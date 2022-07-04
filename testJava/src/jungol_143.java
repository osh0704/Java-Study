import java.util.Scanner;
public class jungol_143 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int printNumber = 1;
        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < inputNumber; j++){
                if (printNumber >= 10) printNumber = 1;
                System.out.print(printNumber);
                System.out.print(" ");
                printNumber += 2;
            }
            System.out.println();
        }
    }
}
