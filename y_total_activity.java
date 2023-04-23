package edu.utsa.cs3443.macrocounter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.macrocounter.Model.CalorieCounter;
import edu.utsa.cs3443.macrocounter.Model.WeightLoseCalculator;


public class y_total_activity extends AppCompatActivity{

    private int [] percentArr = new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.y_total);
        // gets the textViews by ids and assigns them to variables in the program
        TextView carbsPercent = findViewById(R.id.textView11);
        TextView proteinPercent = findViewById(R.id.textView14);
        TextView fatsPercent = findViewById(R.id.textView16);

        // gets the singleton instance of CalorieCounter class
        CalorieCounter cc = CalorieCounter.getInstance();
        // fetches an array for each of the 3 macros and adds them together to return a int of the total number of calories consumed of that type
        int carbTotal= cc.getCarbsArr();
        int proteinTotal = cc.getProteinsArr();
        int fatsTotal = cc.getFatsArr();

        // calls percentCalculator method within this class
        percentArr = percentCalculator(carbTotal,proteinTotal,fatsTotal,cc);

        //converts the integers to strings in order to display them in the TextView
        String carbs = Integer.toString(percentArr[0]);
        String protein = Integer.toString(percentArr[1]);
        String fats = Integer.toString(percentArr[2]);

        //sets the text view to the appropriate percentages
        carbsPercent.setText(carbs);
        proteinPercent.setText(protein);
        fatsPercent.setText(fats);

    }

    /*
    this method returns a int array of the percentages in the form of integers its take sin 3 integers as an argument and 1 CalorieCounter object
    created from singleton
    @param int carb, int protein, int fats, Calorie Counter cc
    @return int[] temp
     */
    public int[] percentCalculator(int carb, int protein, int fats, CalorieCounter cc){

        //initializes array needed for storage
        int[] temp = new int[3];
        int goal = cc.getCurrentTotal(); // gets the current total from CalorieCounter
        /* all 3 of these do the same thing they take the carb, protein or fats calories divide them by the current amount eaten
        and then multiply it by 100 the multiplying part is to convert it into a integer that isn't a decimal value ie .15 = 15%
         */
        int carbPercent = (carb/goal) *100;
        int proteinPercent = (protein/goal) *100;
        int fatPercent = (fats/goal) *100;

        temp[0] = carbPercent;
        temp[1] = proteinPercent;
        temp[2] = fatPercent;

        return  temp;


    }

}