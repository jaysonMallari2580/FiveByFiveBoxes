package com.example.fivebyfiveboxes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Constraint extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_activity);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Constraint.this,Linear.class);
    }
}
