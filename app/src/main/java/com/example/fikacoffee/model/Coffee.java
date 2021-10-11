package com.example.fikacoffee.model;

import com.example.fikacoffee.R;

import java.util.ArrayList;
import java.util.List;

//Creamos la clase con sus atributos
public class Coffee
{
    private String name;
    private double price;
    private int image;
    private String description;
    private int color;

    //Creamos el constructor
    public Coffee(String name, double price, int image, String description, int color)
    {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.color = color;
    }

    //Creamos los Getter
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

    //Metodo ViewModel
    public static List<Coffee> coffeeList()
    {
        List<Coffee> coffees = new ArrayList<>();
            coffees.add(new Coffee("Caramel Macchiato",1200, R.drawable.caramel_macchiato,"There " +
                    "are many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee1));
            coffees.add(new Coffee("Caramel Cold Drink",3.5, R.drawable.caramel_cold_drink,"There " +
                    "are many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee2));
            coffees.add(new Coffee("Iced Coffe Mocha",3.5, R.drawable.iced_coffe_mocha,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee3));
            coffees.add(new Coffee("Caramelized Pecan Latte",3.5,R.drawable.caramelized_pecan_latte,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee1));
            coffees.add(new Coffee("Toffee Nut Latte",3.5, R.drawable.toffee_nut_late,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee2));
            coffees.add(new Coffee("Capuchino",3.5, R.drawable.capuchino,"There are many " +
                    "variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee3));
            coffees.add(new Coffee("Toffee Nut Iced Latte",3.5, R.drawable.toffee_nut_late_iced,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered" +
                    " alteration in some form.", R.color.coffee1));
            coffees.add(new Coffee("Americano",3.5, R.drawable.americano,"There are many " +
                    "variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee2));
            coffees.add(new Coffee("Vietnamese-Style Iced Coffee",3.5, R.drawable.vietnamese_iced_coffe,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee3));
            coffees.add(new Coffee("Black Tea Latte",3.5, R.drawable.black_tea_latte,"There are " +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered " +
                    "alteration in some form.", R.color.coffee1));
            coffees.add(new Coffee(" Classic Irish Coffee",3.5, R.drawable.classic_irish_coffe,"There are" +
                    "many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee2));
            coffees.add(new Coffee("Toffee Nut Crunch Latte",3.5, R.drawable.toffee_nut_crunch_latte,"There are" +
                    " many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.", R.color.coffee3));
            return coffees;
    }

}

