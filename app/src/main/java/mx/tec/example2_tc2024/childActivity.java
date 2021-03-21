package mx.tec.example2_tc2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class childActivity extends AppCompatActivity {

    String anyString;
    TextView myTextViewManager;
    Intent intentReciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTextViewManager = findViewById(R.id.textView2);
        intentReciever = getIntent();
        myTextViewManager.setText(intentReciever.getStringExtra("myExtra"));
    }
}