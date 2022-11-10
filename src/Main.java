import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int c = str.charAt(0);
        if (97 <= c && c < 123){
            System.out.println("Ture");
        }else {
            System.out.println("False");
        }
    }
}