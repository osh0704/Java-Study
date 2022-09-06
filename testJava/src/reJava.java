import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class reJava {
    public static void main(String[] args) {
        String[] name = new String[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
            name[i] = scanner.nextLine();

        for(int i = 0; i < 5; i++){
            System.out.println(name[i]);
            System.out.println(name[i].length());
        }
    }
}
