import java.util.Scanner;

public class Alg04_OrdenacaoTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        System.out.print("Digite o valor 1:");
        num1 = scanner.nextDouble();
        System.out.print("Digite o valor 2:");
        num2 = scanner.nextDouble();
        System.out.print("Digite o valor 3:");
        num3 = scanner.nextDouble();
        for (int cont = 0; cont < 300; cont = cont + 1) {
            System.out.print("\r\n");
        }
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Maior:" + num1);
                System.out.println("Meio:" + num2);
                System.out.println("Menor:" + num3);
            } else {
                System.out.println("Maior:" + num1);
                System.out.println("Meio:" + num3);
                System.out.println("Menor:" + num2);
            }
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Maior:" + num2);
                System.out.println("Meio:" + num1);
                System.out.println("Menor:" + num3);
            } else {
                System.out.println("Maior:" + num2);
                System.out.println("Meio:" + num3);
                System.out.println("Menor:" + num1);
            }
        }
        if (num3 > num1 && num3 > num2) {
            if (num2 > num1) {
                System.out.println("Maior:" + num3);
                System.out.println("Meio:" + num2);
                System.out.println("Menor:" + num1);
            } else {
                System.out.println("Maior:" + num3);
                System.out.println("Meio:" + num1);
                System.out.println("Menor:" + num2);
            }
        }
    }
}
