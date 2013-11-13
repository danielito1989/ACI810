package com.example.control2;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Resultado extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultado);
	}
    public void cerrar(View view) {
    	finish();
}
}