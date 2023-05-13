import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** CONVERSOR DE TEMPERATURA CELCIUS PARA FAHRENHEIT *****");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Valor em Celcius");
        double C = teclado.nextDouble();
        teclado.close();

        double F = (C * 9 / 5) + 32;

        System.out.printf("A temperatura em Fº é de %.2f ", F);
    }
}
