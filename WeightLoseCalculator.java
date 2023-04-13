package edu.utsa.cs3443.macrocounter.Model;

public class WeightLoseCalculator {

    double lbsPerWeek;
    int dailyCalorieGoal;

    public WeightLoseCalculator(double lbsPerWeek) {
        this.lbsPerWeek = lbsPerWeek;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void setDailyCalorieGoal(int dailyCalorieGoal) {
        this.dailyCalorieGoal = dailyCalorieGoal;
    }
    public int setDailyCalorieGoal(){
//NOTE: We cannot exceed 2lbs per week anything more can cause actually be very bad for your health
        dailyCalorieGoal = (int) (2000 - lbsPerWeek * 500);

        return dailyCalorieGoal;
    }


}
