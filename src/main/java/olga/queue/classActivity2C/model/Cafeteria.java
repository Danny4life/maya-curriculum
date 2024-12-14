package olga.queue.classActivity2C.model;

import olga.queue.classActivity2C.enums.MealTypes;

public class Cafeteria {
    private MealTypes mealType;

    public Cafeteria(MealTypes mealType) {
        this.mealType = mealType;
    }

    public MealTypes getMealType() {
        return mealType;
    }
}
