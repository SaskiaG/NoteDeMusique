package com.mycompany.notedemusique;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class NoteActivity extends ActionBarActivity {

    private String Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final Intent intent = new Intent(this, WebActivity.class);

        final Spinner spinner = (Spinner) findViewById(R.id.note);

        // Create an ArrayAdapter using the string array and a default spinner layout
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                        R.array.note, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
                spinner.setAdapter(adapter);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Perform action on click
                Value = spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
                TextView t1 = (TextView) findViewById(R.id.textView4);
                switch(Value){
                    case "C":
                        t1.setText("The equivalent in french is Do");
                        break;
                    case "D":
                        t1.setText("The equivalent in french is Ré");
                        break;
                    case "E":
                        t1.setText("The equivalent in french is Mi");
                        break;
                    case "F":
                        t1.setText("The equivalent in french is Fa");
                        break;
                    case "G":
                        t1.setText("The equivalent in french is Sol");
                        break;
                    case "A":
                        t1.setText("The equivalent in french is La");
                        break;
                    case "B":
                        t1.setText("The equivalent in french is Si");
                        break;

                }

            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
