import java.util.Scanner;

public class Alg01_ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        double celcius, kelvin, fahrenheit;
        System.out.println("Conversor de Temperatura. Escolha qual deseja fazer a conversão.");
        System.out.println("1- Kelvin");
        System.out.println("2- Fareheit");
        resposta = scanner.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Digite a temperatura em Celcius:");
                celcius = scanner.nextDouble();
                kelvin = celcius + 273.15;
                System.out.println("temperatura em Kelvin: " + kelvin + "K");
                break;
            case 2:
                System.out.println("Digite a temperatura em Celcius:");
                celcius = scanner.nextDouble();
                fahrenheit = (celcius * 9 / 5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
                break;
            default:
                System.out.println("Não há esta escolha");
                break;
        }

    }
}
