package com.demo.GiveClass;
/**
 * Created by huangzhiwei on 16/10/26.
 */

import com.google.gson.Gson;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;


/**
 * Created by huangzhiwei on 16/10/22.
 */
public class GiveClass extends Controller {
    @ActionKey("/sc")
    public void give()  {
     /* StringBuilder jsonstr = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = this.getRequest().getReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                jsonstr.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String js = String.valueOf(jsonstr);
        JSONObject jsonobj = null;
        try {
            jsonobj = new JSONObject(js);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int id = 0;
        try {
            id = jsonobj.getInt("id");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        int maxtime = 0;
        try {
            maxtime = jsonobj.getInt("maxtime");
        } catch (JSONException e) {
            e.printStackTrace();
        }*/


         int maxtime = 0;

         Classes allclass = new Classes();
        List<Class_Message> list = allclass.getList();

              for (int i=0;i<3;i++) {
                  Record cs = Db.findById("class", maxtime + 1 + i);
                  String class_name = cs.getStr("class_name");
                  String class_pic_url = cs.getStr("class_pic_url");
                  String teacher_name = cs.getStr("teacher_name");
                  String level = cs.getStr("level");
                  String available = "false";
                  String local = cs.getStr("local");
                  Class_Message  cm = new Class_Message();
                  cm.setClass_name(class_name);
                  cm.setAvailable(available);
                  cm.setTeacher_name(teacher_name);
                  cm.setClass_pic_url(class_pic_url);
                  cm.setLevel(level);
                  cm.setLocal(local);
                  list.add(cm);

              }
               allclass.setMaxtime(maxtime+3);
        //  Class_Message classMessage = new Class_Message();



        //maxtime = maxtime+3;
        Gson gson = new Gson();


        renderText(gson.toJson(allclass));



        //renderText(alljson);


    }
}