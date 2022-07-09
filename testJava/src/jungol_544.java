import java.util.Scanner;
public class jungol_544 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= inputNumber ; i++){
            sum += i;
        }
        System.out.println(sum);
    }


}
