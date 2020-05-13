package com.appproccontact.recyclerView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.firebaseemailpasswordexample.R;

public class DetailsBoulanger extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_boulanger);

        initializeViews();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsBoulanger.this, BoulangerActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initializeViews() {
        btnBack = findViewById(R.id.Back);
    }
}
