package test2.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String USER_INPUT_LOOKUP = "FirstProject.INPUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Note: for android:onClick method to call a function,
    // function must have Public access,
    // A void return value
    // A View as the only parameter (it is the View object that was clicked)
    /** Called when user hits "Go" button */
    public void getInputView(View view){
        Intent intent = new Intent(this, DisplayQuoteActivity.class);
        // Find input and extract
        EditText editText = findViewById(R.id.editText);
        String user_input = editText.getText().toString();
        // add key/val pair to input (passing this val to next activity)
        intent.putExtra(USER_INPUT_LOOKUP, user_input);
        // Start the intent (DisplayQuoteActivity instanciated here)
        startActivity(intent);
    }
}
