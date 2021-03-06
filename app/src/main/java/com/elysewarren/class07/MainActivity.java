package com.elysewarren.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView) findViewById(R.id.display_text);
    }

    public void launchActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra(Keys.String, "Hello....");
        intent.putExtra(Keys.NUM, 100);
        startActivity(intent);
    }
}
