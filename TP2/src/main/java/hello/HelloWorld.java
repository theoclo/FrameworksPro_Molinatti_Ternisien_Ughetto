package hello;

public class HelloWorld {
    private String message;
    public void setMessage(String msg){
        this.message = msg;
    }

    public void getMessage(){
        System.out.println("Message : "+ this.message);
    }
}
