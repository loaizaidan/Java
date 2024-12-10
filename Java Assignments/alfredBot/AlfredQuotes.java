import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    /*
     * Dev Name: Loai Zaidan
     * Description: Returns a greeting that includes the person's name
     * Input: String
     * Return Type: String
     * Example Output: Hello, Shatha Bast. Lovely to see you
     */
    public String guestGreeting(String name) {
        return String.format("Hello, %s! Lovely to see you.", name);
    }

    /*
     * Description: Returns a polite announcement of the current date and time.
     * Input: None
     * Return Type: String
     * Example Output: It is currently Wed Aug 11 16:34:59 PDT 2022.
     */
    public String dateAnnouncement() {
        Date todayDate = new Date();
        return "It is currently " + todayDate;
    }

    /*
     * Description: Create a method for AlfredBot that regularly processes audio
     * input. This method should take a string that represents the convo, and
     * deliver a suitable response.
     * Input: String conversation
     * Return Type: String
     */
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
}
