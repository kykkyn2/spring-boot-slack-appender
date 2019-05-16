package com.qkrwjdgus.controller;

import com.google.gson.reflect.TypeToken;
import com.qkrwjdgus.AppContext;
import com.qkrwjdgus.model.Sample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
public class SampleController {

    private static Logger logger = LogManager.getLogger(SampleController.class);

    @PostMapping(value = "/")
    public void hello(@RequestBody String json) {


        System.out.println("=====");

        logger.info("to go?! {} " + new String(json.getBytes(), StandardCharsets.UTF_8));

        logger.info("why not!! {} " + Charset.defaultCharset().name());
        logger.info("아오 빡쳐!!");


        List<Sample> list = AppContext.GSONC.fromJson(json, new TypeToken<List<Sample>>() {
        }.getType());

        System.out.println("=====");
        System.out.println(list.get(0).getTitleText());
        System.out.println("=====");

    }

}
