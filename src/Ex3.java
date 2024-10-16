import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeProdutos = obterQuantidadeProdutos(sc);
        double[] precos = obterPrecosProduto(sc, quantidadeProdutos);
        double total =  Calculartotaldospreços(precos);
        double media = Calcularmediadospreços( total, quantidadeProdutos);
        String resultado = Exibir_resultados(total, media);
    }
    public static int obterQuantidadeProdutos(Scanner sc) {
        System.out.println("Quantos produtos há no carrinho?");
        int quantidadeProdutos = sc.nextInt();
        return quantidadeProdutos;
    }
    public static double[] obterPrecosProduto(Scanner sc, int quantidadeProdutos) {
        double[] precos = new double[quantidadeProdutos];
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        return precos;
    }
    public static double Calculartotaldospreços(double[] precos) {
        double total = 0;
        for(double preco :precos) {
            total += preco;
        }
        return total;
    }
    public static double Calcularmediadospreços(double total, int quantidadeProdutos) {
        double media = total / quantidadeProdutos;
        return media;
    }
    public static String Exibir_resultados (double total, double media) {
        System.out.println("O total dos preços é: "+total);
        System.out.println("A média dos preços é: "+media);
        return "resultado";
    }
}
