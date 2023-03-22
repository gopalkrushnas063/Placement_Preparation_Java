import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,45,74,2,6,79);

        List<Integer> listEven = list1.stream().filter(i->i%10==0).collect(Collectors.toList());
        System.out.println(listEven);

        list1.stream().filter(i->i%10==0).forEach(System.out::println);
    }
}