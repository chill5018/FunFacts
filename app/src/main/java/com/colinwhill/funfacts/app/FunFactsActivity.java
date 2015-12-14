package com.colinwhill.funfacts.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends Activity {

    private FactBook fb = new FactBook();
    private ColorWheel cw = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare View Variables and assign the Views from the layout files
        final TextView factLabel = (TextView) findViewById(R.id.FactTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.background);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = fb.getFact();
                //Update label with dynamic fact
                int color = cw.getColor();
                layout.setBackgroundColor(color);
                factLabel.setText(fact);
                layout.setBackgroundColor(color);



            }
        };
        showFactButton.setOnClickListener(listener);

        //THis can be like a console printout - visual feedback for a user action
        //Toast.makeText(this, "Yay! Our Activity was Created", Toast.LENGTH_LONG).show();

        // Logging
        Log.d("On Create", "Activity was created via the On Create Method");

    }

}
