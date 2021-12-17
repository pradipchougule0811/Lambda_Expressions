package My.pack;

public class Example3
{
    public static void main(String[] args) {
        //Method call using Lambda Expression
        new Thread(
                () ->   {
                    System.out.println("My Runnable");
                }
        ).start();
    }
}
