public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author){
        super(title, id);
        this.author = author;
    }
    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 0.50;
    }

    public String getAuthor(){
        return author;
    }
}
