public class DVD extends LibraryItem{
    private String director;

    public DVD(String title, String id, String director){
        super(title, id);
        this.director = director;
    }
    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 0.15;
    }

    public String getDirector(){
        return director;
    }
}
