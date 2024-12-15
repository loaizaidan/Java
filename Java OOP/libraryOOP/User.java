// User class with enhanced encapsulation
public class User {
    // Private fields
    private String name;
    
    // Constructor with parameter validation
    public User(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    
    // Method to borrow an item
    public void borrowItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot borrow null item");
        }
        System.out.println(name + " is borrowing " + item.getTitle());
        item.borrowItem();
    }
    
    // Method to return an item
    public void returnItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot return null item");
        }
        System.out.println(name + " is returning " + item.getTitle());
        item.returnItem();
    }
    
    // Getter with controlled access
    public String getName() {
        return name;
    }
}