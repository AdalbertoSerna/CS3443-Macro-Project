package edu.utsa.cs3443.macrocounter.Model;

public class WeightLoseCalculator {
    int currentWeight;
    int lbsPerWeek;
    int dailyCalorieGoal = 0;

    public WeightLoseCalculator(int currentWeight, int lbsPerWeek) {
        this.currentWeight = currentWeight;
        this.lbsPerWeek = lbsPerWeek;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getLbsPerWeek() {
        return lbsPerWeek;
    }

    public void setLbsPerWeek(int lbsPerWeek) {
        this.lbsPerWeek = lbsPerWeek;
    }
    public int setDailyCalorieGoal(int lbsPerWeek){
//NOTE: We cannot exceed 2lbs per week anything more can cause actually be very bad for your health
        dailyCalorieGoal = 2000 - lbsPerWeek * 500;
        return dailyCalorieGoal;
    }
}
