package edu.utsa.cs3443.macrocounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.macrocounter.Controller.MealController;
import edu.utsa.cs3443.macrocounter.Controller.WeightInputController;

public class WeightInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_input);

        EditText lbsPerWeekText = findViewById(R.id.lbsPerWeek);

        String lbsPerWeekS = lbsPerWeekText.getText().toString();

        int lbsPerWeek = Integer.parseInt(lbsPerWeekS);

        Button SubmitWButton = findViewById(R.id.SubmitWButton);

        SubmitWButton.setOnClickListener(new WeightInputController(lbsPerWeek));

    }
}
