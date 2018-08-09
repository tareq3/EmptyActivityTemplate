/*
 * Created by Tareq Islam on 8/9/18 4:31 PM
 *
 *  Last modified 8/9/18 4:17 PM
 */

package com.mti.customisedstatusbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_with_appbar);
        
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Home");
    }
}
