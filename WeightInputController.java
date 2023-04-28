package edu.utsa.cs3443.macrocounter.Controller;

import androidx.appcompat.app.AppCompatActivity;

import edu.utsa.cs3443.macrocounter.Model.CalorieCounter;
import edu.utsa.cs3443.macrocounter.Model.WeightLoseCalculator;
import edu.utsa.cs3443.macrocounter.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WeightInputController implements View.OnClickListener {

    int lbsPerWeek;

    WeightLoseCalculator cc = WeightLoseCalculator.getInstance();

    public WeightInputController(int lbsPerWeek) {
    }

    @Override
    public void onClick(View view) {

    }


}
