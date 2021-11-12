package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Lr.
     */
    LinearLayout LR;
    /**
     * The Si.
     */
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting element between java and xml files
        LR = (LinearLayout) findViewById(R.id.ver);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // menu inflation
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        //data transform to String and setting background accordingly
        if (st.equals("cyan")){
            LR.setBackgroundColor(Color.CYAN);
        }

        if (st.equals("green")){
            LR.setBackgroundColor(Color.GREEN);

        }
        if (st.equals("red")){
            LR.setBackgroundColor(Color.RED);

        }
        return true;

    }

    /**
     * Move.
     *
     * @param view the view
     */
    public void move(View view) {
        //creating Intent in order to move activity
        si = new Intent(this,MainActivity2.class);
        startActivity(si);
    }
}