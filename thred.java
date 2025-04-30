
import java.io.*;
import java.util.*;

class MTable5 extends Thread {
    int n;
    MTable5(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i <= n; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    int n;

    Prime(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class thred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit for multiplication table of 5: ");
        int muln = sc.nextInt();
        MTable5 t1 = new MTable5(muln);

        System.out.print("Enter upper limit to find prime numbers: ");
        int primen = sc.nextInt();
        Prime t2 = new Prime(primen);

        t1.start();
        t2.start();
    }
}

