package com.example.insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pGzNSpRnKVWoDpVPk5sjOUleY7IUuOG7lW9EExjO")
                .clientKey("t4HNFsQA2rBb4ojtX8WDI2STbXmoKOdIf9Z4RxtA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
