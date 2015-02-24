package com.mycompany.notedemusique;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    public static final String PREFS_NAME = "LoginPrefs";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, NoteActivity.class);

        /*
         * Check if we successfully logged in before.
         * If we did, redirect to home page
         */
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        if (settings.getString("logged", "").toString().equals("logged")) {
            Toast toast = Toast.makeText(getApplicationContext(), "All ready logged in", Toast.LENGTH_LONG);
            toast.show();
            startActivity(intent);
        } else {

            Button b = (Button) findViewById(R.id.loginbutton);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = getIntent();
                    EditText email = (EditText) findViewById(R.id.email);
                    EditText password = (EditText) findViewById(R.id.password);

                    if (email.getText().toString().length() > 0 && password.getText().toString().length() > 0)
                        if (email.getText().toString().equals("test@test.com"))
                            if (password.getText().toString().equals("test")) {
                            /*
                             * So login information is correct,
                             * we will save the Preference data
                             * and redirect to next class / home
                             */
                                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                                SharedPreferences.Editor editor = settings.edit();
                                editor.putString("logged", "logged");
                                editor.commit();
                                Toast toast = Toast.makeText(getApplicationContext(), "Please quit and come back", Toast.LENGTH_LONG);
                                toast.show();

                                startActivity(intent);

                            } else {
                                Toast toast = Toast.makeText(getApplicationContext(), "Password incorrect", Toast.LENGTH_LONG);
                                toast.show();

                            }
                        else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Email incorrect", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Cant be empty", Toast.LENGTH_LONG);
                        toast.show();
                    }

                }


            });
        }
    }

}
