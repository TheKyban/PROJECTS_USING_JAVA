package Testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\programming\\Projects_Java\\Testing\\words.text");
        System.out.println(file.length());
        Scanner sc = new Scanner(file);
        for (int i =0; i<3; i++) {
            // sc.skip(0);
            String a = sc.nextLine();

            System.out.println(a);
        }
    }
}
