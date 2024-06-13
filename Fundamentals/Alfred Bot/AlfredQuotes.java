import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String Ola = String.format("Hello, %s. Lovely to see you", name);
        // YOUR CODE HERE
        return Ola;
    }
    
    public String dateAnnouncement() {
        Date date= new Date();
        String Ola = String.format("It is currently %s",date);
        // YOUR CODE HERE
        return Ola;
        // It is currently Wed Aug 11 16:34:59 PDT 2022.
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1){return "Right away, sir. She certainly isn't sophisticated enough for that";}
        else if(conversation.indexOf("Alfred") != -1){return "At your service. As you wish, naturally.";}
        else{return "Right. And with that I shall retire.";}
    }
    
    public String guestGreeting(String name ,String name1) {

        String Ola = String.format("Hello, %s, %s Lovely to see you", name,name1);

        return Ola;
    }

    public String CustomMethod(String name) {
        return name.toLowerCase() + ' ' + name.toUpperCase() ;
    }


}

