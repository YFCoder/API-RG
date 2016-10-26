package com.demo.SlideShow;

import java.io.Serializable;

/**
 * Created by huangzhiwei on 16/10/26.
 */
public class Top_image implements Serializable {
    private String top_image;
    private String class_name;

    public String getTop_image() {
        return top_image;
    }

    public void setTop_image(String top_image) {
        this.top_image = top_image;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
    public Top_image(String top_image,String class_name){
        this.top_image = top_image;
        this.class_name = class_name;

    }
}
