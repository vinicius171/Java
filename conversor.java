import java.util.Scanner;

public class conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius+"°C é igual a "+fahrenheit+"°F");
    }
}