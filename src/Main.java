import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(Arrays.asList(
                new Person("Petr", "la-Petrov", 16),
                new Person("Albert", "Van-Der-fon-Gor", 15),
                new Person("Kir", "Der-fon-Persi", 15),
                new Person("Ivan", "la-Ivanov", 15)
        ));

        Collections.sort(person, (p1, p2) ->{
            int len1 = p1.getSurname().split("-").length;
            int len2 = p2.getSurname().split("-").length;
            if(len1 != len2) {
                return Integer.compare(len2, len1); //сначала большее len, большее знатнее
            }
            return Integer.compare(p2.getAge(), p1.getAge()); //сначала  большее p, большее знатнее
        });

        for (Person person1 : person) {  //вывод отсортированного списка
            System.out.println(person1);
        }

    }
}