package com.akmal5labs.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Azlan on 9/6/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "JAPeiQDKqSbk9nxBITKvlFfdlFeAgXQx2inWVj6L", "fM4CCby50UiyEmRUwIKWPEaFnUVtzs8SkXdHJpOI");
    }

}
