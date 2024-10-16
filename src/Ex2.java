import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadedealunos = ObterQuantidadedealunos(sc);
        double[] notas = pegarNotasDosAlunos(quantidadedealunos, sc);

        int aprovados = aprovadosdaturma(notas);
        int reprovados = reprovadosdaturma(notas);
        double media = mediadosalunos(notas);

        exibirResultados(aprovados, reprovados, media);

    }

    public static int ObterQuantidadedealunos(Scanner sc) {
        System.out.println("Quantos alunos têm na sua turma: ");
        return sc.nextInt();
    }

    public static double[] pegarNotasDosAlunos(int quantidadedealunos, Scanner sc) {
        double[] notas = new double[quantidadedealunos];
        for (int i = 0; i < quantidadedealunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10:");
                notas[i] = sc.nextDouble();
            }
        }
        return notas;
    }

    public static int aprovadosdaturma(double[] notas) {
        int aprovados = 0;
        for (double nota : notas) {
            if (nota >= 6) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static int reprovadosdaturma(double[] notas) {
        int reprovados = 0;
        for (double nota : notas) {
            if (nota < 6) {
                reprovados++;
            }
        }
        return reprovados;
    }

    public static double mediadosalunos(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public static void  exibirResultados(int aprovados, int reprovados, double media) {
        System.out.println("A quantidade de alunos aprovados é: " + aprovados);
        System.out.println("A quantidade de alunos reprovados é: " + reprovados);
        System.out.println("A média da turma é: " + media);
    }

}

