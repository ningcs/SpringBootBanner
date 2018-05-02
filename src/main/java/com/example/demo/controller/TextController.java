package com.example.demo.controller;

import com.example.demo.event.MyApplicationEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ningcs on 2018/1/2.
 */
@Controller
@RequestMapping("/event")
public class TextController {
    Log log= LogFactory.getLog(getClass());
    @Autowired
    ApplicationContext applicationContext;

    @RequestMapping(value = "textEvent" ,method = RequestMethod.POST)
    @ResponseBody
    public String textEvent(){
        MyApplicationEvent myApplicationEvent =new MyApplicationEvent(applicationContext);
        myApplicationEvent.setType("1");
        myApplicationEvent.setObject(null);
        Map<String,Object> map =new HashMap<>();
        map.put("name","ningcs");
        myApplicationEvent.setMaps(map);
        //发布事件
        applicationContext.publishEvent(myApplicationEvent);
        log.info("发布事件");
        return "ok";
    }
}
