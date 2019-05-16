package com.qkrwjdgus;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

/**
 * 설명
 */
@Component
public class AppContext {

    public static Gson GSON = new GsonBuilder().create();

    public static Gson GSONC = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

}
