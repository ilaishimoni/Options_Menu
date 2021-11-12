package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * The type Main activity 2.
 */
public class MainActivity2 extends AppCompatActivity {


    /**
     * The Lr 2.
     */
    LinearLayout LR_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //connecting element between java and xml files
        LR_2 = (LinearLayout) findViewById(R.id.CL);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,4,"MAGENTA");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){


        String st = item.getTitle().toString();
        //data transform to String and setting background accordingly
        if (st.equals("cyan")){
            LR_2.setBackgroundColor(Color.CYAN);
        }

        if (st.equals("green")){
            LR_2.setBackgroundColor(Color.GREEN);

        }
        if (st.equals("red")){
            LR_2.setBackgroundColor(Color.RED);

        }
        if (st.equals("MAGENTA")){
            LR_2.setBackgroundColor(Color.MAGENTA);

        }

        return true;

    }

    /**
     * Goback.
     *
     * @param view the view
     */

    // go back (no data)
    public void goback(View view) {
        finish();
    }
}