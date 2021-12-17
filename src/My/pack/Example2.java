package My.pack;

import java.util.ArrayList;

public class Example2
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(11);
        numbers.forEach( (n) -> { System.out.println(n); } );
    }
}
