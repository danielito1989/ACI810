package com.example.control2;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity {

	EditText editable;
	Button agregar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editable = (EditText) findViewById(R.id.editText1);
        agregar = (Button) findViewById(R.id.button1);
    }

    
    public void lanzar(View view) {
        Intent i = new Intent(this, Resultado.class );
        startActivity(i);
  } 

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
