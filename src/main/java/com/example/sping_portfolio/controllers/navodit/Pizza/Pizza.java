package com.example.sping_portfolio.controllers.navodit.Pizza;

import java.util.ArrayList;

class Pizza{
    public enum Sizes{small, medium, large};
    public enum ToppingOptions{ham, olives, peporoni, onion, tomato, sausage, corn, peperica};
    public enum CheeseOptions{regular, extra};

    private static final int basePrice =10;
    private static final int toppingPrice = 1;
    private static final int cheeseRegularPrice = 2;
    private static final int cheeseExtraPrice = 5;
    private static final int smallPrice = 2;
    private static final int mediumPrice = 4;
    private static final int largePrice = 6;


    private Sizes size;
    private ArrayList <ToppingOptions> toppings;
    private CheeseOptions cheese;

    public Pizza (){
        toppings = new ArrayList<ToppingOptions>();
        size = Sizes.medium;
        toppings.add (ToppingOptions.peporoni);
        cheese = CheeseOptions.regular;
    }

    public Pizza (Sizes size){
        this.size = size;
        toppings = new ArrayList<ToppingOptions>();
    }

    public int addToppings(ToppingOptions option){
        if (!toppings.contains(option)){
            toppings.add(option);
        }
        return toppings.size();
    }

    public int removeToppings (ToppingOptions option){
        if (toppings.contains(option)){
            toppings.remove(option);
        }
        return toppings.size();
    }

    public ArrayList<ToppingOptions> getToppings(){
        return toppings;
    }

    public int getToppingsCount()
    {
        return toppings.size();
    }

    public void setPizaSize(Sizes size){
        this.size = size;
    }

    public Sizes getPizzaSize(){
        return size;
    }

    public void setCheese(CheeseOptions option){
        this.cheese = option;
    }

    public CheeseOptions getCheese(){
        return cheese;
    }


    public int getPizzaPrice(){

        int toppingCost = toppings.size()*toppingPrice;

        int cheesePrice;
        if (cheese == CheeseOptions.regular){
            cheesePrice = cheeseRegularPrice;
        }
        else{
            cheesePrice = cheeseExtraPrice;
        }

        int sizePrice = 0;
        switch (size){
            case small: {
                sizePrice = smallPrice;
                break;
            }
            case medium: {
                sizePrice = mediumPrice;
                break;
            }
            case large: {
                sizePrice = largePrice;
                break;
            }


        }

        return basePrice + toppingCost + cheesePrice +sizePrice;
    }

    public String toString(){
        String topping = "";
        for (ToppingOptions t : toppings){
            topping += t + ", ";
        }
        return cheese + " cheese " + size + " pizza with " +  topping + "for $" + getPizzaPrice();
    }

}
