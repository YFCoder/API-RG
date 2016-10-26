package com.demo.test;

import com.demo.SlideShow.Top_image;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzhiwei on 16/10/26.
 */
public class Test {
    public static void main(String argus[]){
        Top tp3 = new Top();
        tp3.setHead(2333);
        Top_image tp1 = new Top_image("1","2");
        Top_image tp2 = new Top_image("1","2");
        tp1.setClass_name("1");
        tp1.setTop_image("2");
        tp2.setClass_name("1");
        tp2.setTop_image("2");
        List<Top_image> kist = tp3.getList();
        kist.add(tp1);
        kist.add(tp2);

        Gson gson = new Gson();

        String jsonString = gson.toJson(tp3);
        //System.out.println(gson.toJson(tp1));

        System.out.println(jsonString);

    }
    public static class Top{
        private int head;
        private List<Top_image> list;

        public Top(){
            list = new ArrayList<Top_image>();
        }

        public int getHead() {
            return head;
        }

        public void setHead(int head) {
            this.head = head;
        }

        public List<Top_image> getList() {
            return list;
        }

        public void setList(List<Top_image> list) {
            this.list = list;
        }
    }
}
