import java.util.Scanner;
public class Alg02_CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println("Calculadora de IMC (Índice de Massa Corpórea)");
        System.out.print("Peso:");
        peso = scanner.nextDouble();
        System.out.print("Altura:");
        altura = scanner.nextDouble();
        imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f kg/m²\n",imc);
    }
}
