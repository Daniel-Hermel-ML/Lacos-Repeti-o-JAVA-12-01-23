package laco.Repeticao;
import java.util.*;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, resultado = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            num = ler.nextInt();
            if (num >= 1){
                resultado = resultado + num;
            }
        }while (num != 0);

        System.out.println("--A soma dos números positivos é: "+resultado);
    }
}
