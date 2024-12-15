public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("Java for Beginners", "B01", "Loai Awad");
        Magazine mag = new Magazine("Tech Daily", "M01", "Tech Lounge");
        DVD dvd = new DVD("Coding Adventures", "D01", "Nasri");

        User user = new User("Loai");

        System.out.println("\n------------------------");

        user.borrowItem(dvd);
        System.out.println("Is the DVD availabe?: " + dvd.checkAvailability());

        System.out.println("\n------------------------");

        user.borrowItem(dvd);

        System.out.println("\n------------------------");

        user.returnItem(dvd);
        System.out.println("Is the DVD availabe?: " + dvd.checkAvailability());
        // late fee calc
        System.out.println("\n-----------------------Late fees:-----------------------");
        System.out.println("You are 7 days late returning the dvd, your fee is: " + dvd.calculateLateFee(7));
        System.out.println("\n------------------------");
        System.out.println("You are 9 days late returning the magazine, your fee is: " + mag.calculateLateFee(9));
        System.out.println("\n------------------------");
        System.out.println("You are 3 days late returning the book, your fee is: " + book.calculateLateFee(3));
        System.out.println("\n------------------------");
    }
}
