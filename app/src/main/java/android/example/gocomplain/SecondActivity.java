package android.example.gocomplain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



     //placeholder for input text username

        EditText username =  findViewById(R.id.username);
        username.setHint("username");

       /* other way to achieve the same thing but this "( EditText )" is redundant.
        EditText username = ( EditText )  findViewById(R.id.username);
        username.setHint("username"); */


    //placeholder for input text username
        EditText password =  findViewById(R.id.password);
        password.setHint("password");

    }




}
