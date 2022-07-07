package StudentBusSubway;

public class Subway {
    int money;
    int count;
    int subwayNumber;

    public Subway(int subwayNumber){
        this.subwayNumber = subwayNumber;
    }
    public void take(int count){
        this.count += count;
        this.money += 1000;
    }
    public int getMoney() {
        return money;
    }

    public int getCount() {
        return count;
    }
    public void showInfo(){
        System.out.println("Subway " + this.subwayNumber + " got " + getCount() + " passengers and earned " + getMoney() + " won");
    }
}
