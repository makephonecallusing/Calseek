package com.meeza.b;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText e1,e2,e3;
	Button add,update,delete,view,viewall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.EditText01);
        e3 = (EditText) findViewById(R.id.EditText02);
        add = (Button) findViewById(R.id.button1);
        update = (Button) findViewById(R.id.Button01);
        delete = (Button) findViewById(R.id.Button02);
        view = (Button) findViewById(R.id.
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
