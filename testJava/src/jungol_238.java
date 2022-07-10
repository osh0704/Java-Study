import java.util.Scanner;
public class jungol_238 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int cycleNumber, cnt = 0;
        for(int i = 0; i < inputNumber; i++){
            cycleNumber = scanner.nextInt();
            if (cycleNumber % 3 == 0 || cycleNumber % 5 == 0) cnt ++;
        }
        System.out.println(cnt);
    }
}
