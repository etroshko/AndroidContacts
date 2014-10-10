package com.contacts;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText name;
	private EditText phone;
	private List<String> infoList = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name = (EditText) findViewById(R.id.name);
		phone = (EditText) findViewById(R.id.phone);
	}

	public void addContact(View view) {

		String nameString = name.getText().toString();
		String phoneString = phone.getText().toString();
		if (nameString.matches("") || phoneString.matches("")) {
            Toast.makeText(this, "Check Info", Toast.LENGTH_SHORT).show();
            return;
        }
		infoList.add(nameString + " " + phoneString);
		Toast.makeText(this, "Done!" , Toast.LENGTH_SHORT).show();
	}

	public void nextActivity(View view) {

		Intent intent = new Intent(this, AddActivity.class);
		intent.putStringArrayListExtra("info", (ArrayList<String>) infoList);
		startActivity(intent);
	}
}
