package com.example.parseinstagram;
import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 1) Use for troubleshooting -- remove this line for production
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        // 2) Set applicationId, masterKey from the Heroku server settings. clientKey (masterkey) is't needed unless explicitly configured. Any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hasan-instagram-codepath") // should correspond to APP_ID env variable
                .clientKey("hasanCodePathInstagramMasterKey")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://hasan-instagram-codepath.herokuapp.com/parse").build());
    }
}
