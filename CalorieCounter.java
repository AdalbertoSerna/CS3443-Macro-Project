package edu.utsa.cs3443.macrocounter.Model;

import java.util.ArrayList;

public class CalorieCounter {
   private int fats;
   private int carbs;
   private int proteins;
   private int currentTotal = 0;
    private ArrayList<Integer> fatsArr = new ArrayList<>();
    private ArrayList<Integer> carbsArr = new ArrayList<>();
    private ArrayList<Integer> proteinArr = new ArrayList<>();

    private static CalorieCounter calorieCounter = null;


    private CalorieCounter(){};


    public static CalorieCounter getInstance(){
        if(calorieCounter == null){
            calorieCounter = new CalorieCounter();
        }
        return calorieCounter;
    }


    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getProteins() {
        return proteins;
    }

    public void setCurrentCount(int currentTotal){
        this.currentTotal =currentTotal;

    }
    public int getCurrentTotal(){
        return currentTotal;
    }
    public int getCarbsArr(){
        int total = 0;
        for(int index:carbsArr){
            total += index;

        }
        return total;

    }
    public int getProteinsArr(){
        int total = 0;
        for(int index:proteinArr){
            total += index;

        }
        return total;

    }
    public int getFatsArr(){
        int total = 0;
        for(int index:fatsArr){
            total += index;

        }
        return total;

    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }
    public int countCalories(int fats, int carbs, int proteins){

        fats *=9;
        carbs *=4;
        proteins*=4;
        fatsArr.add(fats);
        carbsArr.add(carbs);
        proteinArr.add(proteins);
        currentTotal += fats + carbs + proteins;
        setCurrentCount(currentTotal);

    return currentTotal;
    }
}
