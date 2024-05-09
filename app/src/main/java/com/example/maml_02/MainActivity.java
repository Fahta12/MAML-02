package com.example.maml_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonActivityDua = findViewById(R.id.button1);
        Button buttonActivityUtama = findViewById(R.id.button2);

        buttonActivityDua.setOnClickListener(this::onClick);

        buttonActivityUtama.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // Optional: menutup ActivitySatu agar tidak tetap ada di tumpukan aktivitas
        });
    }

    private void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}
