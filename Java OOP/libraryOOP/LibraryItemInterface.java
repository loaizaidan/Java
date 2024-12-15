public interface LibraryItemInterface {
    void borrowItem();
    void returnItem();
    boolean checkAvailability();
    double calculateLateFee(int daysLate);
}