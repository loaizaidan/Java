public class Magazine extends LibraryItem{
    private String publisher;

    public Magazine(String title, String id, String publisher){
        super(title, id);
        this.publisher = publisher;
    }
    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 0.25;
    }

    public String getPublisher(){
        return publisher;
    }
}


