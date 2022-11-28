import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.",name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s",date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if (alexis != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (alfred != -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.",dayPeriod,name);
    }
    
    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        Integer timeInHours = Integer.parseInt(formatter.format(date));
        String dayPeriod = "morning";
        if (timeInHours >= 12 && timeInHours < 18) {
            dayPeriod = "afternoon";
        }
        else if (timeInHours >= 18 && timeInHours < 22) {
            dayPeriod = "evening";
        }
        else if (timeInHours >= 22 || timeInHours < 5) {
            dayPeriod = "night";
        }
        return String.format("Good %s. Lovely to see you.",dayPeriod);
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}