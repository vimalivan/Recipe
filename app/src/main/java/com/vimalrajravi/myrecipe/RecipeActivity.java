package com.vimalrajravi.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        String recipe = getIntent().getStringExtra("recipe");
        TextView textView = findViewById(R.id.titleTextView);
        textView.setText(recipe);
    }
}