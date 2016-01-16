package com.lawsonfulton.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        index = getIntent().getIntExtra("index", 0);
        String item = getIntent().getStringExtra("item");

        EditText etNewItem = (EditText) findViewById(R.id.etEditItem);
        etNewItem.append(item);
    }

    public void onSaveItem(View v) {
        Intent data = new Intent();
        EditText etNewItem = (EditText) findViewById(R.id.etEditItem);

        data.putExtra("item", etNewItem.getText().toString());
        data.putExtra("index", index);

        setResult(RESULT_OK, data);

        this.finish();
    }
}
