package designPattern.Solid.DependencyInversion;

public class Main {

    public static void main(String args[]) throws Exception {
            Message message=new Message("this is new message");

            Formatter formatter=new JSONFormatter();
            MessagePrint  msg=new MessagePrint();
            msg.writeMessage(message,formatter);
    }
}
