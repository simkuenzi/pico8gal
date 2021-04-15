package com.github.simkuenzi.pico8gal;

import io.javalin.http.Context;

import java.util.Map;

public class HomePage {
    private final Context context;

    public HomePage(Context context) {
        this.context = context;
    }

    public void show(Map<String, Object> vars) {

    }
}
