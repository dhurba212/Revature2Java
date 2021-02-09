package dev.ghimire.garbage;

public class GarbagePlayground {
    public static void main(String[] args) {
        Book wutheringHeights =new Book();
        wutheringHeights.title="Wuthering Heights";
        wutheringHeights.author="Emile Bronte";

        Book frankenstein = new Book();
        frankenstein.title="Frankenstein";
        frankenstein.author="Mary Shelly";

        System.out.println(frankenstein.author);
        System.out.println(frankenstein.title);
        System.out.println(wutheringHeights.title);
        System.out.println(wutheringHeights.author);

        //GCollection is the process in which objects which are no longer reference get deleted.this frees up memory.
        wutheringHeights=null;
        //frankenstein=null;
        //there is no way to delect object in memory
       System.gc();//politely ask java to delete objects that are not referece anymore
    }
}
