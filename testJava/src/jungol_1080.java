import java.util.Scanner;
public class jungol_1080 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int cnt = 0, sum = 0, num;
        for (;;) {
             num = scanner.nextInt();
             if (num == 0){
                 System.out.println(sum / cnt);
                 break;
             }
             sum += num;
             cnt ++;
        }
    }
}
