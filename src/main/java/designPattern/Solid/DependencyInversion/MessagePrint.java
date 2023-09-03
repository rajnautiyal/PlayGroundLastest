package designPattern.Solid.DependencyInversion;

public class MessagePrint {

    public void writeMessage(Message msg, Formatter formatter) throws Exception {
       // Formatter jsonFormatter=new JSONFormatter();
       System.out.println( formatter.format(msg));
    }

}
