import java.util.Scanner;
public class jungol_147 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int cnt = 1;
        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < inputNumber - i; j++){
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}
