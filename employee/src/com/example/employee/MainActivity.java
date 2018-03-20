package com.example.employee;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.sqlite.*;

public class MainActivity extends Activity{

	SQLiteDatabase db;
	EditText ename, eid, esalary;
	Button eadd,edel,eupdate,eview,eview_all;
	String elname, elid,elsalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename =(EditText)findViewById(R.id.editText1);
        eid =(EditText)findViewById(R.id.editText2);
        esalary =(EditText)findViewById(R.id.editText3);
        eadd = (Button)findViewById(R.id.button1);
        eadd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				elname = ename.getText().toString();
				Toast.makeText(getApplicationContext(), elname, Toast.LENGTH_SHORT).show();
			}
		});
     
    }
    
      
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



	   
}
