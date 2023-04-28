package edu.utsa.cs3443.macrocounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.macrocounter.Controller.MealController;

public class meal_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal);

        EditText fatsText = findViewById(R.id.fats);
        EditText carbsText = findViewById(R.id.carbs);
        EditText proteinsText = findViewById(R.id.protein);

        String fatsS = fatsText.getText().toString();
        String carbsS = carbsText.getText().toString();
        String proteinsS = proteinsText.getText().toString();

        int fats = Integer.parseInt(fatsS);
        int carbs = Integer.parseInt(carbsS);
        int proteins = Integer.parseInt(proteinsS);

        Button submit = findViewById(R.id.submit);


        submit.setOnClickListener(new MealController(proteins,carbs,fats));

    }
}
