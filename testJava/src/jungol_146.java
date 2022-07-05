import java.util.Scanner;
public class jungol_146 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int num = 0;
        char ch = 'A';
        for(int i = 0; i < inputNumber; i ++){
            for(int j = 0; j < inputNumber - i; j++){
                System.out.print(ch++ + " ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
