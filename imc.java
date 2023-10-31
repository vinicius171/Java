import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicitar o peso
        System.out.print("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        // solicitar a altura em metros
        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        //fecha o scanner
        scanner.close();

        // calcula o imc
        double imc = calcularIMC(peso, altura);

        //exibe o imc
        System.out.println("O seu IMC é: " + imc);
        System.out.println("Classificação do IMC: " + classificarIMC(imc));

    }
    // metodo para calcular o imc
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    // metodo para classificar o imc
    public static String classificarIMC(double imc) {
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25) {
            classificacao = "Normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 40) {
            classificacao = "Obesidade";
        } else {
            classificacao = "Obesidade Grave";
        }
        return classificacao;
    }

}
