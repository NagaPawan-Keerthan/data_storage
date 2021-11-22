package com.example.contactmanagment2hw6;


import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class SecondActivity extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClick(View view)
    {
        Intent data = new Intent();
        EditText userName = (EditText)findViewById(R.id.t1);
        data.putExtra("username", userName.getText().toString());
        EditText userPhone = (EditText)findViewById((R.id.t2));
        data.putExtra("userphone", userPhone.getText().toString());
        EditText userEmail = (EditText)findViewById(R.id.t3);
        data.putExtra("useremail", userEmail.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}

