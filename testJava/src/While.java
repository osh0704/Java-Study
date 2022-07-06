import java.util.Scanner;
public class While {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int inputNumber = scanner.nextInt();
        int i = 0;
        int j = 0;
        while (i < inputNumber){
            j = 0;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
