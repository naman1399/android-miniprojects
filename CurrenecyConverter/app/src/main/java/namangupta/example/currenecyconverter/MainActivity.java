package namangupta.example.currenecyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        EditText inputAmmount = (EditText) findViewById(R.id.amountEditText);

        float convertedAmount = Integer.parseInt(inputAmmount.getText().toString()) * 70.90f;

        Toast.makeText(MainActivity.this, "₹ " + convertedAmount, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
