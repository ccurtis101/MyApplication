package com.example.chriscu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





///new code here...
    }

    public void App (View view) {

        final EditText NameEntered = (EditText) findViewById(R.id.enterName);
        Button  ButtonClicked = (android.widget.Button) findViewById(R.id.button);



        ButtonClicked.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {


                        Log.v("enterName ", NameEntered.getText().toString());
                       // Toast.makeText(getApplicationContext(), "Choose another name ", Toast.LENGTH_LONG).show();
                        TextView randomName;

                        //////START OF IF FOR NAMES

                       String EspName = NameEntered.getText().toString();

                        if (EspName.equals("Chris")) {

                            Log.v("CHRIS XXXXXXXXXXXXXX", NameEntered.getText().toString());
                            Toast.makeText(getApplicationContext(), "XXXXXXXXXXXXXX ", Toast.LENGTH_LONG).show();
                        }

                        else

                            Toast.makeText(getApplicationContext(), "Choose another name ", Toast.LENGTH_LONG).show();

                        ////END OF IF FOR NAMES

                        NameEntered.getText().clear();

                        randomName = (TextView)findViewById(R.id.newName);
                        randomName.setText("Escriba su mensaje y luego seleccione el canal.");

                    }
                });

    }


    public void Result (View view){





    TextView randomName;

        randomName = (TextView)findViewById(R.id.newName);
        randomName.setText("Enter your name please...");


        List<String> list = new ArrayList<String>();
        list.add("spiderman");
        list.add("wonderwoman");
        list.add("hulk");


        Random rand = new Random();
        String randomGen = list.get(rand.nextInt(list.size()));





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
