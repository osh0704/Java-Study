package StudentBusSubway;

/*
학생, 버스 ,지하철의 클래스가 있고
학생은 학생의 이름과 소지 금액, 버스, 지하철을 타서 빠질 금액
버스, 지하철은 고유 번호와 탄 인원과 획득 금액
* */
public class Student{
    String name;
    int money;

    public Student(int money, String name){
        this.name = name;
        this.money = money;
    }
    public void takeSubway(Subway subway){
        this.money -= 1000;
        subway.take(1);
    }
    public void takeBus(Bus bus){
        this.money -= 500;
        bus.take(1);
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void showInfo(){
        System.out.println(this.getName() + " has " + this.getMoney());
    }
}
