class People{
    private int age;
    private char gender;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'W')this.gender = gender;
        else {
            System.out.println("ERROR!!");
        }
    }

    public char getGender() {
        return gender;
    }
}
public class GetterSetter {
    public static void main (String[] args){
        People p2 = new People();
        People p1 = new People();
        p1.setGender('M');
        p1.setAge(15);
        p2.setGender('W');
        p2.setAge(19);
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());
    }
}
