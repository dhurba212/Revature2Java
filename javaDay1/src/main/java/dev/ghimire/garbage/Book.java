package dev.ghimire.garbage;

public class Book {
    String title;
    String author;
    //dont use finalize, its for GC
   @Override
    public void finalize(){
        System.out.println("the book"+this.title+"was deleted");
    }


}
