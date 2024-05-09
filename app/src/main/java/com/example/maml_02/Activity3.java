package com.example.maml_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        Button buttonActivityDua = findViewById(R.id.button5);
        Button buttonActivityUtama = findViewById(R.id.button6);

        buttonActivityDua.setOnClickListener(v -> {
            Intent intent = new Intent(Activity3.this, Activity4.class);
            startActivity(intent);
        });

        buttonActivityUtama.setOnClickListener(v -> {
            Intent intent = new Intent(Activity3.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // Optional: menutup ActivitySatu agar tidak tetap ada di tumpukan aktivitas
        });
    }
}
