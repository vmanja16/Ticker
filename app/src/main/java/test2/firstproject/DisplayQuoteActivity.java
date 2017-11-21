package test2.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableRow;
import android.widget.TextView;

public class DisplayQuoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_quote);

        // get Intent from Main
        Intent intent = getIntent();

        // Access and modify Price/High/Low values
        TextView textView;
        textView = findViewById(R.id.price_val);
        textView.setText("");
        textView = findViewById(R.id.high_val);
        textView.setText("");
        textView = findViewById(R.id.low_val);
        textView.setText("");


    }
}
