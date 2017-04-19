package com.example.anne.lighthelperproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irCadastro(View v){
        Intent irCadastro = new Intent(this,RegisterActivity.class);
        startActivity(irCadastro);
    }

    public void irLogin(View v){
        Intent irLogin = new Intent(this,LoginActivity.class);
        startActivity(irLogin);
    }
}
