package RikkeiEdu.Session7;

public class Book {

    private String Title;
    private  String author ;
    private double price  ;


    public Book(String title, String author, double price) {
       this.Title = title;
       this. author = author;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }


}