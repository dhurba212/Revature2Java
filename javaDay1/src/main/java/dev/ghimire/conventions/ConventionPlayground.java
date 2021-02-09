package dev.ghimire.conventions;

//class named ny PascalCase, meaning each word is capitalized
//
public class ConventionPlayground {
    public static void main(String[] args) {
        //package name is reverse domain plural eg com.ghimire.conventions

        //variables are camelCase
        String name="Dhurba Ghimire";
        String firstName="Dhurba";

        //snake case Do Not Use In Java, python or other language use it
        String full_name="Dhurba Ghimire";

        //does not combine Kabab Case
        //String full-name ="Dhurba Ghimire";
        //do not use dollor sign in java to name
        String $ ="Dhurba Ghimire";
        //final variable use upper case
        //
        final String NAME="Dhurba";
        sayHello();
    }

    //methods are named using camelCase, meaning first word not-capitalized , rest are
    public static void sayHello()
    {
        System.out.println("Hello");
    }
}
