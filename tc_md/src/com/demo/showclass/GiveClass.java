package com.demo.showclass;

/**
 * Created by huangzhiwei on 16/10/26.
 */

import com.google.gson.Gson;
import com.jfinal.core.Controller;




/**
 * Created by huangzhiwei on 16/10/22.
 */
public class GiveClass extends Controller {
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

            /* Record cs = Db.findById("class",maxtime+1+i);
             String class_name = cs.getStr("class_name");
             String class_pic_url = cs.getStr("class_pic_url");
             String teacher_name = cs.getStr("teacher_name");
             String level = cs.getStr("level");
             String available = "false";
             String local = cs.getStr("local");

             */
          //  Class_Message classMessage = new Class_Message();



        //maxtime = maxtime+3;
        //Gson gson = new Gson();


renderText("22");



        //renderText(alljson);


    }
}