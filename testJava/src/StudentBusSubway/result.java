package StudentBusSubway;
/*
*
John has 7500

Kelly has 18500

Harry has 12500

Bus 100 got 1 passengers and earned 1000 won

Subway 2 got 1 passengers and earned 1500 won

Subway 7 got 2 passengers and earned 3000 won

* */
public class result {
    public static void main(String [] args){
        Student st1 = new Student(8000, "John");
        Student st2 = new Student(19000, "Kelly");
        Student st3 = new Student(14500, "Harry");
        Student st4 = new Student(20000, "Peter");

        Bus bus100 = new Bus(100);
        Subway sub2 = new Subway(2);
        Subway sub7 = new Subway(7);

        st1.takeBus(bus100);
        st2.takeSubway(sub2);
        st3.takeSubway(sub7);
        st4.takeBus(bus100);

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();
        st4.showInfo();

        bus100.showInfo();
        sub2.showInfo();
        sub7.showInfo();
    }
}
