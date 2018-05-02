package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by ningcs on 2018/1/2.
 */
public class EventInfo implements Serializable{
    private List<Object> list;
    private Map<String,Object> maps;

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
}
