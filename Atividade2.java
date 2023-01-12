package laco.Repeticao;
import java.util.*;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int contador = 1; contador < 11; contador++){
            System.out.print("--Digite o "+contador+"º número: ");
            num = ler.nextInt();

            if (num % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Total de números pares "+par+".");
        System.out.println("Total de números impares "+impar+".");
    }
}
