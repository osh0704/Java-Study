import java.util.Scanner;
public class jungol_543 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= inputNumber; i++){
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
