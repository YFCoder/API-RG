package com.demo.SlideShow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangzhiwei on 16/10/26.
 */
public class TopList implements Serializable {
    private List<Top_image> top ;

    public List<Top_image> getTop() {
        top = new ArrayList<Top_image>();
        return top;
    }


}
