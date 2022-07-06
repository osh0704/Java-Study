import java.util.Scanner;

class Person{
    String Name;
    int age;
    public Person(String name){
        Name = name;
    }
    public Person(String name, int agE){
        Name = name;
        age = agE;
    }
}
public class object1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String leejaemyung = scanner.nextLine();
        Person st1 = new Person("이재명");
        Person st2 = new Person("이재하", 19);
        System.out.println(st1.Name);
        System.out.println(st1.age);
        System.out.println(st2.Name);
        System.out.println(st2.age);
        System.out.println(leejaemyung);
    }
}
