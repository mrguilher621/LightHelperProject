package com.example.anne.lighthelperproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void irMenu(View v){
        Intent irMenu = new Intent(this,MenuActivity.class);
        startActivity(irMenu);
    }
}
