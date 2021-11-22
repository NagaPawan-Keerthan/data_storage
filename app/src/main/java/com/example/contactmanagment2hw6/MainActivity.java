package com.example.contactmanagment2hw6;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    ArrayList<String> L=new ArrayList<String>();
    ArrayAdapter<String> ad;
    int request_code = 0;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        ad=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, L);
        setListAdapter(ad);
    }
    public void addDetails(View v) {
        startActivityForResult(new Intent("com.example.contactmanagment2hw6.SecondActivity"),request_code);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == request_code) {
            if (resultCode == RESULT_OK) {
                L.add(data.getStringExtra("username"));
                L.add(data.getStringExtra("userphone"));
                L.add(data.getStringExtra("useremail"));
                ad.notifyDataSetChanged();
            }
        }
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        String str = getListView().getItemAtPosition(position).toString();
        Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
        intent.putExtra("USERNAME", str);
        intent.putExtra("USERPHONE", str);
        intent.putExtra("USEREMAIL", str);
        startActivity(intent);
    }
}

