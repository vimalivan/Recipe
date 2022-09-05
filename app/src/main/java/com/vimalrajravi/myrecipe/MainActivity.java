package com.vimalrajravi.myrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.finRecipeButton);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);



        button.setOnClickListener(v -> {
            // move to next recipeActivity
            String recipe = "";
            if (checkBox1.isChecked() && checkBox2.isChecked()) {
                recipe = "curd Rice";
                System.out.println("curd Rice");
            } else if (checkBox3.isChecked() && checkBox4.isChecked()) {
                recipe = "boil water";
                System.out.println("boil water");
            }

            System.out.println("Button tapped");
            Intent intent = new Intent(this, RecipeActivity.class);
            intent.putExtra("recipe", recipe);
            startActivity(intent);
        });
    }


}