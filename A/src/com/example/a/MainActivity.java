package com.example.a;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnSeekBarChangeListener {

	TextView t1;
	EditText e1, e2;
	SeekBar s1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView1);
        t1.setText("0.0");
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        s1 = (SeekBar) findViewById(R.id.seekBar1);
        
        s1.setOnSeekBarChangeListener(this);
        s1.setOnSeekBarChangeListener
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
		// TODO Auto-generated method stub
		//Toast.makeText(getApplicationContext(),"seekbar progress: "+arg1, Toast.LENGTH_SHORT).show();
		float num1, num2, result;
		if(arg1 == 0){
			e1.getText().clear();
			t1.setText("0.0");
			e2.getText().clear();
		}
		if(arg1 == 1){
			Toast.makeText(getApplicationContext(),"Addition", Toast.LENGTH_SHORT).show();
			num1 = Float.parseFloat(e1.getText().toString());
			num2 = Float.parseFloat(e2.getText().toString());
			result = num + num2;
			t1.setText(Float.toString(result));
		}
		if(arg1 == 2){
			Toast.makeText(getApplicationContext(),"Subtraction", Toast.LENGTH_SHORT).show();
			num1 = Float.parseFloat(e1.getText().toString());
			num2 = Float.parseFloat(e2.getText().toString());
			result = num1 - num2;
			t1.setText(Float.toString(result));
		}
		if(arg1 == 3){
			Toast.makeText(getApplicationContext(),"Multiplication", Toast.LENGTH_SHORT).show();
			num1 = Float.parseFloat(e1.getText().toString());
			num2 = Float.parseFloat(e2.getText().toString());
			result = num1 * num2;
			t1.setText(Float.toString(result));
		}																															
		if(arg1 == 4){
			Toast.makeText(getApplicationContext(),"Division", Toast.LENGTH_SHORT).show();
			num1 = Float.parseFloat(e1.getText().toString());
			num2 = Float.parseFloat(e2.getText().toString());
			result = num1 / num2;
			t1.setText(Float.toString(result));
		}
	}


	@Override
	public void onStartTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStopTrackingTouch(SeekBar arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
