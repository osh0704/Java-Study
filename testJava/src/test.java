import java.util.Scanner;

class rockScissorsPaper{
    int computer, player;
    public void setValue(int computer, int player){
        this.computer = computer;
        this.player = player;
    }
    public void whoWinner(){
        if (this.computer == this.player) System.out.println("DRAW!!");
        else if (this.computer == 1 && this.player == 2) System.out.println("WIN!!");
        else if (this.computer == 1 && this.player == 3) System.out.println("LOSE!!");
        else if (this.computer == 2 && this.player == 1) System.out.println("LOSE!!");
        else if (this.computer == 2 && this.player == 3) System.out.println("WIN!!");
        else if (this.computer == 3 && this.player == 1) System.out.println("WIN!!");
        else if (this.computer == 3 && this.player == 2) System.out.println("LOSE!!");
    }
}
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("1(가위), 2(바위), 3(보) 중 하나를 입력해주세요");
        int player = scanner.nextInt();
        int computer = (int)(Math.random() * 3) + 1;
        rockScissorsPaper whoWinner = new rockScissorsPaper();
        whoWinner.setValue(computer,player);
        whoWinner.whoWinner();
    }
}
