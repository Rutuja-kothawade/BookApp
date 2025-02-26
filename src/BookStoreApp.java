
public class BookStoreApp {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);
        Book book3 = new Book("1984", "George Orwell", 8.99);

        // Create Customer objects
        Customer customer1 = new Customer("Ruchita Sonwane", "ruchisonwane03@gmail.com");
        Customer customer2 = new Customer("Minal Kotkar", "minalkotkar08@gmail.com");

        // Display Customer details
        System.out.println("Customers in the bookstore:");
        System.out.println(customer1);
        System.out.println(customer2);

        // Optionally display Book details
        System.out.println("\nBooks available in the bookstore:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
