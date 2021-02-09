package dev.ghimire.primitive;

public class PrimitivePlayground {
    public static void main(String[] args) {
        //8 primitives on java
        //not object,not complex
        //all primitive starts with lower case
        boolean boo=true;
        byte by=0;
        short sh=0;
        char ch='a';
        int in=0;
        float fl=0.78f;//can have decimal value. in java decimal is default double
        long lo=0;
        double doo=100.0;//can have decimal value

        //String is an object, not primitive
        String hello="hello";

        byte a=2;//or even short a=2;
        byte b=3;// or even short b=3;
       // byte c=a+b; its an error
        int c=a+b;//java always does arithmetic with int only

    }
}
