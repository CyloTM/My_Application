package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
    public int Score = 0;

    public void on_button_click(View view) {
        Random r = new Random();
        int number1 = r.nextInt( 6)+1;
        TextView tv3 = (TextView) this.findViewById(R.id.score);
        TextView tv = (TextView) this.findViewById(R.id.num1);
        TextView tv2 = (TextView) this.findViewById(R.id.msg);
        tv.setText(Integer.toString(number1));
        EditText in = (EditText) findViewById(R.id.input);
        String text = in.getText().toString();
        int a = Integer.parseInt(text);
        if (a == number1) {
            tv2.setText("congratulations");
            Score = Score + 1;
            tv3.setText("Score: " + Integer.toString(Score));
        } else {
            tv2.setText("Too Bad");
        }
    }
    public int roll_the_dice(){
        Random r = new Random();
        int number1 = r.nextInt( 6+1);
        return number1;
    }

    public void on_button_click2(View view){
        TextView tv = (TextView)this.findViewById(R.id.num2);
        int number = roll_the_dice();
        if (number == 1){
            tv.setText("If you could go anywhere in the world, where would you go?");
        }
        else if (number == 2){
            tv.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }
        else if (number == 3){
            tv.setText("If you could eat only one food for the rest of your life, what would that be?");
        }
        else if (number == 4){
            tv.setText("If you won a million dollars, what is the first thing you would buy?");
        }
        else if (number == 5){
            tv.setText("If you could spend the day with one fictional character, who would it be?");
        }
        else if (number == 6){
            tv.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }

    }
    }

