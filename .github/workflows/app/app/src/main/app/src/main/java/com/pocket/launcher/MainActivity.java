package com.pocket.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.Gravity;
import android.graphics.Color;
import android.content.Intent;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#121212"));

        TextView title = new TextView(this);
        title.setText("POCKET LAUNCHER");
        title.setTextColor(Color.CYAN);
        title.setTextSize(32);
        layout.addView(title);

        Button btnBedrock = new Button(this);
        btnBedrock.setText("MINECRAFT BEDROCK");
        btnBedrock.setOnClickListener(v -> {
            Intent i = getPackageManager().getLaunchIntentForPackage("com.mojang.minecraftpe");
            if (i != null) startActivity(i);
            else Toast.makeText(this, "Bedrock não encontrado", Toast.LENGTH_SHORT).show();
        });
        layout.addView(btnBedrock);

        Button btnJava = new Button(this);
        btnJava.setText("MINECRAFT JAVA (C++)");
        btnJava.setOnClickListener(v -> Toast.makeText(this, "Motor C++ Ativo", Toast.LENGTH_SHORT).show());
        layout.addView(btnJava);

        setContentView(layout);
    }
              }
