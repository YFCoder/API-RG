package com.demo.showclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzhiwei on 16/10/26.
 */
public class AllClass  {
    private List<Class_Message> list;
    public AllClass(){
        this.list = new ArrayList<Class_Message>();

    }




    public List<Class_Message> getList() {
        return list;
    }

    public void setList(List<Class_Message> list) {
        this.list = list;
    }
}
