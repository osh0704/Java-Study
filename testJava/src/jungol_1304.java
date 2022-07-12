import java.util.Scanner;
public class jungol_1304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int cnt = 1, tmp = 2;
        for(int i = 0; i < inputNumber; i++){
            for(int j = 0; j < inputNumber; j++){
                System.out.print(cnt + " ");
                cnt += inputNumber;
            }
            System.out.println();
            cnt = tmp++;
        }

    }
}
