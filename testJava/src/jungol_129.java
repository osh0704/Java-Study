import java.util.Scanner;
public class jungol_129 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int Base, hight;
        for(int i = 0; i < inputNumber; i++){
            System.out.print("Base : ");
            Base = scanner.nextInt();
            System.out.print("hight : ");
            hight = scanner.nextInt();
            System.out.println("Triangle width : " + Base * hight / 2);
        }
    }
}
