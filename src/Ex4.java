import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = saberraio(sc);
        double area = calculararea(raio);
        String resultado = Mostrarresultado(area);
    }

    public static double saberraio(Scanner sc) {
        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();
        return raio;
    }

    public static double calculararea(double raio) {
        double area = 3.14159 * raio * raio;
        return area;
    }

    public static String Mostrarresultado(double area) {
        System.out.println("A área do círculo é: " + area);
        return "resultado";
    }
}
