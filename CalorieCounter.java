package edu.utsa.cs3443.macrocounter.Model;

public class CalorieCounter {
    int fats;
    int carbs;
    int proteins;
    int currentTotal = 0;


    public CalorieCounter(int fats, int carbs, int proteins) {
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
    }

    public CalorieCounter(int fats, int carbs, int proteins, int currentTotal) {
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.currentTotal = currentTotal;
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

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }
    public int countCalories(int fats, int carbs, int proteins, int currentTotal){
        currentTotal += fats*9 + carbs*4 + proteins*4;

    return currentTotal;
    }
}
