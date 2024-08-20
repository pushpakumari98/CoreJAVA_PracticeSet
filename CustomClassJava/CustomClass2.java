//Design a Book class with attributes title, author, and price. Include a method getDetails() that returns a string containing the book details. Create two instances of the Book class and print their details.

class Book {
    String title;
    String authorName;
    int price;

    public void getDetails(String title, String authorName, int price) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title of the book:" + title);
        System.out.println("Author name of the book:" + authorName);
        System.out.println("price of the book:" + price);
    }
}

public class CustomClass2 {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.title = "Rich dad Poor dad";
        obj.authorName = "Robert Kiyosaki";
        obj.price = 450;
        obj.displayDetails();
    }
}
