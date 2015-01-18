package com.habaneros.kitchenette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	
	private static String name = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void toLogin(View view) {
		if (name.equals("")) {
			Intent i = new Intent(this, LoginActivity.class);
			startActivity(i);
		} else {
			Intent i = new Intent(this, ChooseRecipeTypeActivity.class);
			startActivity(i);
		}
	}
	
	public static void setName(String inputName) {
		name = inputName;
	}

}
