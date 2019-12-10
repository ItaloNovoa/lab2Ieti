package com.example.lab2androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Logear(View view) {
        EditText editText = (EditText) findViewById(R.id.email);
        String correo = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.password);
        String contraseña= editText2.getText().toString();
        if(correo.isEmpty() ){
            editText.setError("email is Empty");
        }else if(contraseña.isEmpty()){
            editText2.setError("password is Empty");
        }else{
            Intent menu = new Intent(this,MainActivity.class);
            startActivity(menu);
        }

    }
}
