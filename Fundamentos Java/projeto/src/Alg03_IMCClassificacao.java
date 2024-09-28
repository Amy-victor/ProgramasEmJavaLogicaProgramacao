import java.util.Scanner;
public class Alg03_IMCClassificacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); 
        double peso, altura, imc;
        System.out.println("Calculadora de IMC (Índice de Massa Corpórea)");
        System.out.print("Peso:");
        peso = scanner.nextDouble();
        System.out.print("Altura:");
        altura = scanner.nextDouble();
        imc = peso/(altura*altura);
        if (imc<18.5) {
         System.out.printf("IMC: %.2f kg/m²(abaixo do peso)\n",imc);
        }else if (imc>=18.5 && imc<24.9) {
            System.out.printf("IMC: %.2f kg/m²(peso normal)\n",imc);
        }else if (imc>=) {
                
            }}

            
         } 
        }
    }
}
