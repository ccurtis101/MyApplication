package com.example.chriscu.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                       /// HIDE KEYBOARD ////////////////////
                        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(NameEntered.getWindowToken(), 0);

                        Log.v("enterName ", NameEntered.getText().toString());

                        TextView randomName;

                        //////START OF IF FOR NAMES///////////////////////

                        randomName = (TextView)findViewById(R.id.newName);
                       String EspName = NameEntered.getText().toString();

                        String[] thisIsAStringArray = {"AAA", "BBB", "CCC", "DDD", "EEE"};
                        System.out.println( thisIsAStringArray[0] );
                        System.out.println( thisIsAStringArray[1] );
                        System.out.println( thisIsAStringArray[2] );
                        System.out.println( thisIsAStringArray[3] );
                        System.out.println( thisIsAStringArray[4] );

                        if (EspName.equals(thisIsAStringArray[0])) {

                            Log.v("ARRRAYYYYBBB", NameEntered.getText().toString());
                            Toast.makeText(getApplicationContext(), "ARRRAYYAAA ", Toast.LENGTH_LONG).show();
                        }
                        else

                        if (EspName.equals(thisIsAStringArray[1])) {

                            Log.v("ARRRAYYYYBBBB", NameEntered.getText().toString());
                            Toast.makeText(getApplicationContext(), "ARRRAYYBBBB ", Toast.LENGTH_LONG).show();
                        }
                        else


                        if (EspName.equals("Chris")) {

                            Log.v("CHRIS XXXXXXXXXXXXXX", NameEntered.getText().toString());
                            Toast.makeText(getApplicationContext(), "XXXXXXXXXXXXXX ", Toast.LENGTH_LONG).show();


                        }

                        else

                            Toast.makeText(getApplicationContext(), "Choose another name ", Toast.LENGTH_LONG).show();

                        ////END OF IF FOR NAMES

                        NameEntered.getText().clear();


                        randomName.setText("Escriba su mensaje y luego seleccione el canal.");

                    }
                });

    }


    public void Result (View view){


        TextView NewName = (TextView) findViewById(R.id.newName);


          NewName.setText("Enter your name please...");







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
