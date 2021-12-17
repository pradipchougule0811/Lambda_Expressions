package My.pack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1
{
    public static void main(String[] args) {
        List<Integer> l1 = List.of(10,20,30,40,50);
        Stream<Integer> s = l1.stream();
        List<Integer> l2 = s.map(e->e*2).collect(Collectors.toList());
        //Here e->e*2 is a Lambda Expression to calculate multiple of 2 from given stream
        System.out.println(l2);
    }
}

