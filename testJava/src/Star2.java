import java.util.Scanner;
public class Star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}