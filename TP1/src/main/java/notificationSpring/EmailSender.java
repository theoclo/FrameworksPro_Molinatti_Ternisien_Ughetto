package notificationSpring;

public class EmailSender implements MessageSender {

    public void send(String message){
        System.out.println("Email : "+message);
    }
}
