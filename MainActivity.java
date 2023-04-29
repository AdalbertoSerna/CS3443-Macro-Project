import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import Model.CalorieCounter;
import Model.WeightLoseCalculator;


public class MainActivity extends AppCompatActivity {

    CalorieCounter cc = CalorieCounter.getInstance();
    WeightLoseCalculator wlc = WeightLoseCalculator.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BreakfastButton = findViewById(R.id.BreakfastButton);
        Button LunchButton = findViewById(R.id.LunchButton);
        Button DinnerButton = findViewById(R.id.DinnerButton);
        Button EnterButton = findViewById(R.id.EnterButton);
        Button TotalButton = findViewById(R.id.TotalButton);
        TextView TotalCalories = findViewById(R.id.TotalCalories);
        TextView textView1 = findViewById(R.id.textView1);
        TextView PercentOutput = findViewById(R.id.PercentOutput);
        ProgressBar progressBar = findViewById(R.id.progressBar);


        progressBar.incrementProgressBy(update_Progressbar());
        TotalCalories.setText(cc.getCurrentTotal());
        textView1.setText(wlc.getDailyCalorieGoal());

        BreakfastButton.setOnClickListener(new Controller(this));
        LunchButton.setOnClickListener(new Controller(this));
        DinnerButton.setOnClickListener(new Controller(this));
        EnterButton.setOnClickListener(new Controller(this));
        TotalButton.setOnClickListener(new Controller(this));


    }

    public int update_Progressbar() {
        int percent = cc.getCurrentTotal();
        int lose = wlc.getDailyCalorieGoal();

        int total = percent/lose;
        return total;

    }

}
