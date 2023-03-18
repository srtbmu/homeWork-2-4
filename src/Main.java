import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        System.out.println("Введите имена A: ");
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println("Имена A:"+A);
        System.out.println("--------------------");

        System.out.println("Введите имена В: ");
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println("Имена B:"+B);
        System.out.println("--------------------");

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("Сортировка С:"+C);
        System.out.println("--------------------");
        Collections.sort(C,new Sorting());
        System.out.println("Сортировка по количеству букв :"+C);
        System.out.println("--------------------");



    }
}