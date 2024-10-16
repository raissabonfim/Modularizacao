import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = saberoraio(sc);
        double area = calculararea(raio);
        double perimetro = calcularperimetro(raio, area);
        String resultado = Exibirresultados(perimetro,area);

    }
    public static double saberoraio(Scanner sc) {
        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();
        return raio;
    }
    public static double calculararea( double raio) {
        double area = 0;
        area = Math.PI * raio * raio;
        return area;
    }
    public static double calcularperimetro (double raio, double area) {
        double perimetro = 0;
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
    public static String Exibirresultados(double perimetro, double area) {
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);
        return "resultado";
    }
}
