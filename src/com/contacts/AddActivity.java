package com.contacts;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AddActivity extends Activity {

	private ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		setContentView(R.layout.activity_add);
		super.onCreate(savedInstanceState);
		lv = (ListView) findViewById(R.id.listView1);
		Intent intent = getIntent();
		ArrayList<String> infoList = intent.getStringArrayListExtra("info");
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, infoList);
		lv.setAdapter(arrayAdapter);

	}
}