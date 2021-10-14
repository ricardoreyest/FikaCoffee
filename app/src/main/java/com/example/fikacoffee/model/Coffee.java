package com.example.fikacoffee.model;

import com.example.fikacoffee.R;

import java.util.ArrayList;
import java.util.List;

//Creamos la clase con sus atributos
public class Coffee
{
    private final String name;
    private final double price;
    private final int image;
    private String description;
    private int color;


    public Coffee(String name, double price, int image, String description, int color)
    {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.color = color;
    }


    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getImage()
    {
        return image;
    }

    public String getDescription()
    {
        return description;
    }

    public int getColor()
    {
        return color;
    }


    public static List<Coffee> coffeeList()
    {
        List<Coffee> coffees = new ArrayList<>();
            coffees.add(new Coffee("Caramel Macchiato",1290,R.drawable.caramel_macchiato,"There " +
                    "are many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee1));
            coffees.add(new Coffee("Caramel Cold Drink",1590, R.drawable.caramel_cold_drink,"There " +
                    "are many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee2));
            coffees.add(new Coffee("Iced Coffe Mocha",1590, R.drawable.iced_coffe_mocha,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee3));
            coffees.add(new Coffee("Caramelized Pecan Latte",2090,R.drawable.caramelized_pecan_latte,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee1));
            coffees.add(new Coffee("Toffee Nut Latte",1590, R.drawable.toffee_nut_late,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee2));
            coffees.add(new Coffee("Capuchino",1390, R.drawable.capuchino,"There are many " +
                    "variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee3));
            coffees.add(new Coffee("Toffee Nut Iced Latte",3.5, R.drawable.toffee_nut_late_iced,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered" +
                    " alteration in some form.",R.color.coffee1));
            coffees.add(new Coffee("Americano",3.5, R.drawable.americano,"There are many " +
                    "variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee2));
            coffees.add(new Coffee("Vietnamese-Style Iced Coffee",1290,R.drawable.vietnamese_iced_coffe,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee3));
            coffees.add(new Coffee("Black Tea Latte",1290, R.drawable.black_tea_latte,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.",R.color.coffee1));
            coffees.add(new Coffee(" Classic Irish Coffee",1690,R.drawable.classic_irish_coffe,"There are" +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
            coffees.add(new Coffee("Toffee Nut Crunch Latte",2490,R.drawable.toffee_nut_crunch_latte,"There are" +
                    " many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));



            return coffees;
    }

    public static Coffee findCoffee (String name)
    {
        for (Coffee coffee : coffeeList())
        {
            if(coffee.getName().equals(name))
            {
                return coffee;
            }
        }
        return null;
    }

}

