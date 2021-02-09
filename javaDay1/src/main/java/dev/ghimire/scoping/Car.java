package dev.ghimire.scoping;

//Class vs Object
//an object is an instance of a class
//a class is a blueprint for an object
//an obj is essentially a data construct that has its own variables
//and methods and function that act on those variables

//functions that are attached to an object are called method, method is specific type of function

//4 scopes in Java, there is no Global Scope in Java
//1-static or Class Scope
//2-Instance or Object Scope
//3-Method Scope(Parameter Variable)-
//4-Local Scope or Block Scope(variable defined within a method)
public class Car {
    //these are instance variables
    //if u create a new car(), u create an object that has that variable
    //instance variables also called fields
    String make;
    String model;
    int mileage;
    //static variables refer to the idea that this variable memory address never changes,
    // the value can change but there is only one
    static int carCounter=0;

    //default value for primitive datatype is 0,except for boolean it is false
    //default value for object is null, eg String

    //static variable are variable that only has one copy
    //it can be CHANGED though
    //Does not belong to object
    //it is directly attached to class
    //shared by every object
    static int staticNum=100;

    //method
    //a function that can use those instance variables within it.
    //methods are called on an object
    void showStats()
    {
        //this makes it explicit that u are accesing instance variable
        System.out.println("THe model is "+this.model);
        System.out.println("the make is "+this.make);
        System.out.println("the mileage is "+this.mileage);
    }

    void drive(int miles)
    {
        System.out.println("you are driving your car");
        this.mileage= this.mileage+miles;
    }

    //static methods are functions that do not belong
    //attached to an object
    //static method is attached to the class itself
    static void hello()
    {
        //it is impossible to use the "THIS" keyword in static method
        //designed to be used directly and do not touch instance field
       //logic that might make sense or is useful evenif there is no object to modify
        //eg Converting KM to MILES
        System.out.println();
    }

    //if a function does not look ar or midify at instance variable then it can probably be static
    static int kilometerToMiles(int kilometer)
    {
        int miles = (int)(kilometer*0.62);
        return miles;
    }

    //a constructor will create an instance of class
    //constructor should be named same as class
    //constructor doesnt have a return type
    Car()
    {
        System.out.println("Created Car");
        this.carCounter++;// or u can write Car.carCounter++;
    }
    Car(String make, String model,int mileage)
    {
        this.make=make;
        this.model=model;
        this.mileage=mileage;
        this.carCounter++;
    }

}
//note:Scope and Access modifier are different, people confuse them
