import java.util.Scanner;

public class Alg05_CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dinheirosacado, nota200, nota100, nota50, nota20, nota10, nota5, nota2;
        int[] nota = { 0, 0, 0, 0, 0, 0, 0 };
        System.out.println("----------Caixa Eletrônica-----------");
        System.out.print("Digite a quantidade que deseja sacar:");
        dinheirosacado = scanner.nextInt();
        if (dinheirosacado < 2 && dinheirosacado != 3) {
            System.out.println("Não é possível sacar essa quantidade");
        } else {
            System.out.println("Valor do saque: " + dinheirosacado + "R$");
            nota[0] = dinheirosacado / 200;
            dinheirosacado = dinheirosacado - nota[0] * 200;
            nota[1] = dinheirosacado / 100;
            dinheirosacado = dinheirosacado - nota[1] * 100;
            nota[2] = dinheirosacado / 50;
            dinheirosacado = dinheirosacado - nota[2] * 50;
            nota[3] = dinheirosacado / 20;
            dinheirosacado = dinheirosacado - nota[3] * 20;
            nota[4] = dinheirosacado / 10;
            dinheirosacado = dinheirosacado - nota[4] * 10;
            System.out.println("=------------------=");
            System.out.println("= Notas de 200: " + nota[0] + "  =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 100: " + nota[1] + "  =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 50: " + nota[2] + "   =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 20: " + nota[3] + "   =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 10: " + nota[4] + "   =");
        }
        if (dinheirosacado >= 2 && dinheirosacado <= 8 && dinheirosacado != 7 && dinheirosacado != 5) {
            nota[6] = dinheirosacado / 2;
            dinheirosacado = dinheirosacado - nota[6] * 2;
            System.out.println("=------------------=");
            System.out.println("= Notas de 5:" + nota[5] + "     =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 2: " + nota[6] + "    =");
            System.out.println("=------------------=");
        } else {
            nota[5] = dinheirosacado / 5;
            dinheirosacado = dinheirosacado - nota[5] * 5;
            nota[6] = dinheirosacado / 2;
            dinheirosacado = dinheirosacado - nota[6] * 2;
            System.out.println("=------------------=");
            System.out.println("= Notas de 5:" + nota[5] + "     =");
            System.out.println("=------------------=");
            System.out.println("= Notas de 2: " + nota[6] + "    =");
            System.out.println("=------------------=");
            
        }
    }
}
