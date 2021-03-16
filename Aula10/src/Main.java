import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("Digite os numeros que voce quer que sejam imprimidos \n Para sair pressione 0");

        int num = 0;

        do {
            System.out.println("Digite um numero: ");
            num = in.nextInt();

            array.add(num);

        } while (num > 0);

        System.out.println("Os numeros gravados foram: " + array);


        int numConjunto;
        System.out.println("Digite a quantidade de numeros que voce quer que imprima: ");
        numConjunto = in.nextInt();

        int numero = 0;

        for (int i = 0; i < numConjunto; i++) {
            numero = array.get(i);
            System.out.println(numero);
        }
        System.out.println("Numeros gravados no conjunto: " + array);
    }

}