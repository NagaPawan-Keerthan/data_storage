package com.example.contactmanagment2hw6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity  extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView T = (TextView)findViewById(R.id.t4);
        Intent intent = getIntent();
        String un = intent.getStringExtra("USEREMAIL");
        String upn = intent.getStringExtra("USERPHONE");
        String ue = intent.getStringExtra("USEREMAIL");
        T.setText(un);
        T.setText(upn);
        T.setText(ue);
    }
}
