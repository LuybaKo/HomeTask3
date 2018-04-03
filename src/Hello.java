import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = scanner.next();
        System.out.println("Hello, " + name);

    }
}
