package com.example.noso.myapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.noso.myapplication.services.NewConversation;

public class Chats extends AppCompatActivity {
    private ListView listView;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        listView = (ListView) findViewById(R.id.chats);
        fab = findViewById(R.id.newConversation);
        String[] itemname = {"Omnia Kamal", "Amira Tarek", "Sherif Amr", "Abdelrahman Tarek", "Mostafa Amr"};
        Integer[] imgID = {R.drawable.omniakamal, R.drawable.amiratarek, R.drawable.sherifamr, R.drawable.homie, R.drawable.mostafaamr};
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, itemname, imgID);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Chats.this, "item clicked", Toast.LENGTH_SHORT).show();
                Intent Q = new Intent(Chats.this, ChatScreen.class);
                startActivity(Q);
            }

        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Chats.this, NewConversation.class);
                Toast.makeText(getApplicationContext(), "sasa", Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }

}