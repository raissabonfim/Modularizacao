import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somafuncao = 0;
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        somafuncao = somadosvalores(num1, num2);
        ;
        System.out.println("A soma dos números é: " + somafuncao);

        somapar(somafuncao);
    }

    public static int somadosvalores(int num1, int num2) {
        return num1 + num2;
    }

    public static void somapar(int somafuncao) {

        if (somafuncao % 2 == 0) {
            System.out.println("A soma é par.");
        } else
            System.out.println("A soma é ìmpar.");
    }

}

