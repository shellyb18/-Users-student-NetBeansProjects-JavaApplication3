/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList();
        myFirstList.add("Apple");
        myFirstList.add("Orange");
        myFirstList.add("Pineapple");

        for (String s : myFirstList) {
            System.out.println(s);
        }
        
        for (int i = 0; i < myFirstList.size(); i++) {
            System.out.println(myFirstList.get(i));
        }
        
        Animal cat = new Animal("Meow");
        
        cat.speak();
        
        List<Animal> myAnimals = new ArrayList();
        myAnimals.add(new Animal("ruff"));
        myAnimals.add(new Animal("hehehe"));
        myAnimals.add(new Animal("hola"));
        
    }

}
