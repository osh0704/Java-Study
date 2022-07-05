import java.util.Scanner;
public class Jungol_148 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int i = 0; i < inputNumber - 1; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < inputNumber - i - 1; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
