package edu.utsa.cs3443.macrocounter.Controller;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.macrocounter.Model.CalorieCounter;
import edu.utsa.cs3443.macrocounter.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MealController implements View.OnClickListener {
    int proteins, carbs, fats;

    CalorieCounter cc = CalorieCounter.getInstance();

    public MealController(int proteins, int carbs, int fats){

    }
    @Override
    public void onClick(View view) {

    }
}