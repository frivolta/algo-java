package rest;

import java.util.ArrayList;
import java.util.List;

public class DishForTwo {
    private final String SPLITTER = " for 2";
    private ArrayList<String> dishesForTwo;

    public DishForTwo(){
        dishesForTwo = new ArrayList<>();
    }
    private String dishFromOrder(String order){
        return order.split(SPLITTER)[0];
    }

    private boolean hasDish(String order){
        return dishesForTwo.contains(dishFromOrder(order));
    }

    public boolean isForTwo(String order){
        return order.contains(SPLITTER);
    }

    public void handleDishesForTwo(String order){
        String dish = dishFromOrder(order);
        if(hasDish(order)){
            dishesForTwo.remove(dish);
        }else{
            dishesForTwo.add(dish);
        }
    }

    // @ToDo: Should be an abstract class for messages(?)
    public String missingMessage (){
        StringBuilder missing = new StringBuilder();
        return missing.append("MISSING 1 for ").append(dishesForTwo.get(0)).append(SPLITTER).toString();
    }

    public boolean isValid(){
        return dishesForTwo.isEmpty();
    }
}
