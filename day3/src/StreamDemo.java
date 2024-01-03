import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
//        Stream<Integer> s=Stream.of(1,2,3,4,5,6,7,8,9);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(8);
        arr.add(7);
        arr.add(6);


        //Terminal Method
        arr.stream().forEach(System.out::println);


        //Intermediate
        //filter()
        arr.stream().filter(i -> i%2==0).forEach(System.out::println);

        //map()
        arr.stream().map(i-> i*10).forEach(System.out::println);

        //Reduce
        int sum= arr.stream().reduce(0,Integer::sum);
        System.out.println(sum);



        //.filter(i-> i%2==0 );
        //s.forEach(i -> System.out.println(i));

    }
}
