package StudentBusSubway;

public class Bus {
    int money;
    int count;
    int BusNumber;

    public Bus(int busNumber) {
        this.BusNumber = busNumber;
    }

    public void take(int count){
        this.count += count;
        this.money += 500;
    }
    public int getMoney() {
        return money;
    }

    public int getCount() {
        return count;
    }
    public void showInfo(){
        System.out.println("Bus " + this.BusNumber +  " got " + this.getCount() + " passengers and earned " + this.getMoney() + " won");
    }
}
