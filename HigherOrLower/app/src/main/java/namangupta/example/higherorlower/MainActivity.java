package namangupta.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessButton(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);

        int inputValue = Integer.parseInt(editText.getText().toString());

        String message = "";

        if (inputValue < randomNumber) {
            message = "Higher!";
        } else if (inputValue > randomNumber) {
            message = "Lower!";
        } else {
            message = "That's right! Try again!";
        }

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumber = new Random().nextInt(20) + 1;
    }
}
