package Controller;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivityController implements View.OnClickListener{
    MainActivity mainActivity;
    public MainActivityController(MainActivity mainActivity){
        this.mainActivity = mainActivity;

    }

    @Override
    public void onClick(View view) {
    Button button = (Button)view;
    String alias = button.getText().toString();

    switch(alias) {
        case "Breakfast":
        case "Lunch":
        case "Dinner":
            Intent i = new Intent(mainActivity, meal_activity.Class);
            startActivity(i);
            break;
        case "Enter Weight":
            Intent temp = new Intent(mainActivity, WeightInputActivity.Class);
            startActivity(temp);
            break;
        case "Total Today":
            Intent temp1 = new Intent(mainActivity, y_total_activity.Class);
            startActivity(temp1);
            break;

    }
    }
}
