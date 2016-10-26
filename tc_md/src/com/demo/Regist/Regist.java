package com.demo.Regist;

import com.google.gson.Gson;
import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.kit.HttpKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by huangzhiwei on 16/10/19.
 */
public class Regist extends Controller {
     public void index(){

             renderText("测试");

     }
    public void getdata() throws IOException {
       StringBuilder jsonstr = new StringBuilder();
        BufferedReader reader = this.getRequest().getReader();
        String line = null;
        while((line = reader.readLine()) != null){
            jsonstr.append(line);
        }
        reader.close();
        String js = String.valueOf(jsonstr);
        JSONObject jsonobj = null;
        try {
            jsonobj = new JSONObject(js);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String username = null;
        try {
            username = jsonobj.getString("username");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String password = null;
        try {
            password = jsonobj.getString("password");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String sql = "select * from users where username ="+"\'"+username+"\'";
       List<Record> users = Db.find(sql);
        RegistJson rjson = new RegistJson();
        Gson gson = new Gson();
       if (users.size()>0){
          /*renderText("{\n" +
                  "\"result\" : \"no\"\n," +"\"id\""+":"+"-1"+
                  "}");
                  */
          rjson.setId(-1);
           rjson.setResult("no");


       }else {
           Record user = new Record().set("username",username ).set("password", password).set("headpic","localhost");
           Db.save("users",user);
           String getid = "select * from users where username ="+"\'"+username+"\'";

            List<Record> userid =  Db.find(getid);
           int id =userid.get(0).getInt("id");
          /* renderText("{\n" +
                   "\"result\" : \"yes\"\n," +
                   "\"id\" : "+String.valueOf(id)+
                   "}");
                   */
          rjson.setId(id);
           rjson.setResult("yes");
       }
        renderText(gson.toJson(rjson));


    }
}
