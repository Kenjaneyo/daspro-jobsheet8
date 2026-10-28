import java.util.Scanner;
public class Tugas122 {
    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;                       // penghitung banyak angka tercetak
            for (int i = 1; i <= n; i++) {       // baris
                for (int j = 1; j <= i; j++) {   // angka 1 sampai i
                    System.out.print(j);
                    if (j < i) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
    

