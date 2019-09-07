import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("nhap 10 phan tu cho mang");
        for (int i = 0; i < array.length; i++) {
            int element = scanner.nextInt();
            array[i] = element;
        }
        int check = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < check) {
                check = array[i];
            }
        }
        System.out.println(check);
    }
}
