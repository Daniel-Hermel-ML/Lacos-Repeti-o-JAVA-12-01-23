package laco.Repeticao;
import java.util.*;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double contador = 0;
        double num, media = 0, resultado = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            num = ler.nextInt();
            if (num % 3 == 0){
                resultado = resultado + num;
                contador++;
            }else{
                contador--;
            }

        }while (num != 0);
        media = resultado / contador;

        System.out.printf("--A média de todos os números múltiplos de " +
                "3 é: %.2f",media);
    }
}
