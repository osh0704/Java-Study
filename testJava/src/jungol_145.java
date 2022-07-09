import java.util.Scanner;
public class jungol_145 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < inputNumber - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
