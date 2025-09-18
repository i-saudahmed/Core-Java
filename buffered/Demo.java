package buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Enter a  number : ");
        // ascii value giving
        // int result = System.in.read();
        // -------------- //? old method input
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());

        // ? new method
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }
}
