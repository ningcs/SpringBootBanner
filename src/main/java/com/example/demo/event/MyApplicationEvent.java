package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

import java.util.Map;

/**
 * Created by ningcs on 2018/1/2.
 * 自定义事件，继承ApplicationEvent抽象类
 */
public class MyApplicationEvent extends ApplicationEvent{
    private String type;
    private Object object;
    private Map<String,Object> maps;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public MyApplicationEvent(Object source) {
            super(source);
    }
}
