package lenox.cafeteria.model;

import lenox.cafeteria.enums.MealType;

public class Cafeteria {

    private MealType mealType;


    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
