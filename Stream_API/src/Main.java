import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,45,74,2,6,79);

        List<Integer> listEven = list1.stream().filter(i->i%10==0).collect(Collectors.toList());
        System.out.println(listEven);

        list1.stream().filter(i->i%10==0).forEach(System.out::println);


        List<Integer> sqList = list1.stream().map(i-> i*i).collect(Collectors.toList());
        System.out.println(sqList);

        list1.stream().map(i->i*i).forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "New York"));
        students.add(new Student(2, "Los Angeles"));
        students.add(new Student(3, "Chicago"));
        students.add(new Student(4, "Houston"));
        students.add(new Student(5, "New York"));

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getId() == 1 && s.getCity().equals("New York"))
                .collect(Collectors.toList());

        filteredStudents.forEach(s -> System.out.println("ID: " + s.getId() + ", City: " + s.getCity()));

        List<Student> filteredStudentsMap = students.stream()
                .map(s -> {
                    if (s.getId() == 1 && s.getCity().equals("New York")) {
                        return s;
                    } else {
                        return null;
                    }
                })
                .filter(s -> {
                    if (s == null) {
                        return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());

        filteredStudentsMap.forEach(s -> System.out.println("ID: " + s.getId() + ", City: " + s.getCity()));

    }
}