package namangupta.example.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sayHiFunction(View view) {

        EditText personName = (EditText) findViewById(R.id.name);

        Toast.makeText(MainActivity.this, "Hi there, " + personName.getText().toString(), Toast.LENGTH_LONG).show();

        Log.i("Info", "Button tapped!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
