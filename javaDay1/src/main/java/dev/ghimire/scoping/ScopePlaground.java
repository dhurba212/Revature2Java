package dev.ghimire.scoping;

public class ScopePlaground {
    public static void main(String[] args) {

        //new keyword EXPLICITLY means allocate memory for new object
        //1 car class
        //2 instance of that class
        //2 car objects
        Car honda= new Car("Honda","Crv",80000);
//        honda.make="Honda";
//        honda.model="Crv";
//        honda.mileage=80000;

        Car hyundai = new Car();
        hyundai.make= "Hyundai";
        hyundai.model= "dont know";
        hyundai.mileage = 50000;

        //right now there are 2 car objects in memory
        honda.showStats();
        System.out.println("............");
        hyundai.showStats();

        honda.drive(100);
        honda.showStats();

        //all these three statements are the same
        Car.staticNum=10000;
        honda.staticNum=20000;
        hyundai.staticNum=30000;

        Car.kilometerToMiles(75);
    }
}
