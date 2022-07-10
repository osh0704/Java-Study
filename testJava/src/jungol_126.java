import java.util.Scanner;
public class jungol_126 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int cycleNumber, odd = 0, even = 0;
        for(int i = 0; i < inputNumber; i++){
            cycleNumber = scanner.nextInt();
            if(cycleNumber == 0){
                System.out.println("odd : " + odd);
                System.out.println("even : " + even);
                break;
            }
            if (cycleNumber % 2 == 0) odd++;
            else even++;
        }
    }
}
