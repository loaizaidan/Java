public abstract class LibraryItem implements LibraryItemInterface {
    
    private String title;
    private String id;
    private boolean isAvailable;
     
    protected LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
        this.isAvailable = true;
    }
    
    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    
    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
    
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
    
    @Override
    public abstract double calculateLateFee(int daysLate);
    
    public String getTitle() {
        return title;
    }
    
    public String getId() {
        return id;
    }
}