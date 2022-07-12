import java.util.Scanner;
public class jungol_1303 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int inputNumber1 = scanner.nextInt();
        int inputNumber2 = scanner.nextInt();
        int cnt = 1;
        for(int i = 0; i < inputNumber1; i++){
            for(int j = 0; j < inputNumber2; j++){
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}
