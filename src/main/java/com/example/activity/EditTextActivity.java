package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import com.example.R;

/**
 * Created by Hoshiko on 5/7/15.
 */
public class EditTextActivity extends Activity {
    int clickcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);



    Button button = (Button) findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            clickcount = clickcount +1;
            TextView tv = (TextView)findViewById(R.id.counter);
            tv.setText(String.valueOf(clickcount));

            // it is same as above 2 lines.  ((TextView)findViewById(R.id.counter)).setText(String.valueOf(clickcount));
        }
    });


    }
}
