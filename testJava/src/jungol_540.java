import java.util.Scanner;
public class jungol_540 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int iNumber;
        for(;;){
            iNumber = scanner.nextInt();
            if (iNumber < 0) break;
            if(iNumber % 3 == 0) System.out.println(iNumber / 3);
        }
    }
}
