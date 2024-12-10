import java.util.ArrayList;

public class GenericException {

    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted Value: " + castedValue);
            } catch (ClassCastException e) {
                System.out.println("Error: ClassCastException at index " + i + ".Value: " + myList.get(i));
                System.out.println("Exception Message: " + e.getMessage());
            }
        }
    }
}