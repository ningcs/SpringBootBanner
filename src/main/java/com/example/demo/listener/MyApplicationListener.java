package com.example.demo.listener;

import com.example.demo.event.MyApplicationEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;

/**
 * Created by ningcs on 2018/1/2.
 * 自定义事件监听器，实现ApplicationListener接口
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    Log log= LogFactory.getLog(getClass());
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        log.info(myApplicationEvent.getType());
        log.info(myApplicationEvent.getMaps());
        log.info(myApplicationEvent.getObject());
        System.out.println(myApplicationEvent.getClass().getName() + "被监听......");
    }
}