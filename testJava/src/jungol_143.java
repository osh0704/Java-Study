import java.util.Scanner;
public class jungol_143 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n * 2 - i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
