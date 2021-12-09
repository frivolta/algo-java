package rest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Table {
    public int id;
    private final String SAME = "Same";
    private int tableSize;
    private String lastOrder;
    private LinkedHashMap<String, String> orders;
    public DishForTwo dishForTwo;

    public Table(int id, int tableSize){
        this.id = id;
        this.tableSize = tableSize;
        orders = new LinkedHashMap<>();
        dishForTwo = new DishForTwo();
    }
    private int getMissingOrders(){
        return tableSize-orders.size();
    }
    public int getId (){
        return id;
    }

    public void addToOrder (String customer, String order){
        String dish;
        if(order.equals(SAME)){
            dish = lastOrder;
        }else {
            dish = order;
            lastOrder = order;
        }
        orders.put(customer, dish);
        // Handle dish for two, if list has it remove it otherwise add it
        if(dishForTwo.isForTwo(order)){
            dishForTwo.handleDishesForTwo(order);
        }
    }

    public String createOrder(){
        StringJoiner joiner = new StringJoiner(", ");
        for(String key: orders.keySet()){
            joiner.add(orders.get(key));
        }
        return joiner.toString();
    }

    public boolean allOrdersFullfilled(){
        return orders.size() == tableSize && dishForTwo.isValid();
    }


    public String missingOrdersMessage(){
        if(dishForTwo.isValid()){
            return new StringBuilder("MISSING ").append(getMissingOrders()).toString();
        }
        return dishForTwo.missingMessage();
    }
}
