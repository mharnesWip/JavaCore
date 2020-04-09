public class Book {
    int isbn;
    String title, author;
    double price;

    Book(int bn, String tit, String aut, double pri){
        isbn = bn;
        title = tit;
        author = aut;
        price = pri;
    }

    public void displayDetails(){
        System.out.println("Book Details: ");
        System.out.println("Author - " + this.author);
        System.out.println("title - " + this.title);
        System.out.println("isbn - " + this.isbn);
        System.out.println("price - " + this.price);
    }

    public void discountedPrice(double discount){
        double discounted_amount = price*discount/100;
        double discounted_price = price - discounted_amount;

        System.out.println("The books discounted price is: " + discounted_price);
    }

    public static void main(String args[]){
        Book obj = new Book(425, "Where The Wild Things Are", "Some Guy", 25.75);

        obj.displayDetails();
        obj.discountedPrice(10);
    }
}
