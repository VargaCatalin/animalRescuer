package org.fasttrackit;

import java.nio.charset.MalformedInputException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to animal rescuer!" );


        //Proprietes of Adopter !
        Adopter adopterProprietes = new Adopter();
        adopterProprietes.name = "Marcel";
        adopterProprietes.gender = "Boy";
        adopterProprietes.age = 10;
        adopterProprietes.money = 50;

        System.out.println("Adopter proprietes are:");
        System.out.println("Name: " + adopterProprietes.name);
        System.out.println("Gender: " + adopterProprietes.gender);
        System.out.println("Age: " + adopterProprietes.age);
        System.out.println("Money have: " + adopterProprietes.money);

        //////////////////////////////////////////////////////////////////////



        //Proprietes of Animal !
        Animal animalDog = new Animal();
        animalDog.name = "Bruno";
        animalDog.age = 2;
        animalDog.weight = 5;
        animalDog.healthLevel = 98; // 1 - pana la 100 %
        animalDog.hungerLevel = 10; // 1 -  pana la 10 %
        animalDog.hapinessLevel = 2; // 1 - pana la 10 %
        animalDog.medicalTreatment = true;
        animalDog.favouriteFood = "Bones";
        animalDog.unfavorableFood = "Pedigree";
        animalDog.favouriteActivity = "Swimming";

        System.out.println("Animal proprietes are:");
        System.out.println("Name: " + animalDog.name);
        System.out.println("Age: " + animalDog.age);
        System.out.println("Weight: " + animalDog.weight);
        System.out.println("Health: " + animalDog.healthLevel);
        System.out.println("Hunger level are: " + animalDog.hungerLevel);
        System.out.println("Hapiness level are: " + animalDog.hapinessLevel);
        System.out.println("Favourite food are: " + animalDog.favouriteFood);
        System.out.println("Unfavourable Food are: " + animalDog.unfavorableFood);
        System.out.println("Favourite activity are: " + animalDog.favouriteActivity);

        //////////////////////////////////////////////////////////////////////////////






        //Proprietes of Food

       Food foodProprietes = new Food();
        foodProprietes.nameFood = "Bones";
        foodProprietes.foodWeight = 1000;
        foodProprietes.priceFood = 50;
        foodProprietes.foodstock = 5;


        System.out.println("Food name are: " + foodProprietes.nameFood);
        System.out.println("Food weight is: " + foodProprietes.foodWeight);
        System.out.println("Price food is: " + foodProprietes.priceFood);

        ////////////////////////////////////////////////////////////////////


        //Proprietes of Vet

        Vet vetProprietes = new Vet();
        vetProprietes.nameVet = "Dorel";
        vetProprietes.ageVet = 55;
        vetProprietes.genderVet = "Male";
        vetProprietes.specializationVet = "Dentist";
        vetProprietes.priceTreatment = 100;


        System.out.println("Vet name are: " + vetProprietes.nameVet);
        System.out.println("Vet age is: " + vetProprietes.ageVet);
        System.out.println("Vet gender are: " + vetProprietes.genderVet);
        System.out.println("Vet specialization is: " + vetProprietes.specializationVet);
        System.out.println("Price treatment is: " + vetProprietes.priceTreatment);



        ////////////////////////////////////////////////////////////////////

        //Game members

        Game game = new Game();
        game.dog = animalDog;
        game.adopter = adopterProprietes;
        game.vet = vetProprietes;

        






  
                           }



}