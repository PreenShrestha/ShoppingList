package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args){
        String [] list ={"Cereal","Chicken","Rice","Eggs","Blueberries","Chips","Cheese","Potato","Fries","Salmon"};
        System.out.println("List of 10 items for shopping list: ");
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("End");
    }
}
