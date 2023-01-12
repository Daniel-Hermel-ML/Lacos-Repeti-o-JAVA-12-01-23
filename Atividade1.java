package laco.Repeticao;
import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;


        System.out.print("--Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.print("--Digite o segundo número: ");
        num2 = ler.nextInt();

        if (num1 < num2) {
            for (int contador = num1; contador <= num2; contador++){
                if (contador % 3 == 0 && contador % 5 == 0){
                    System.out.println(contador+" é múltiplo de 3 e 5");
                }
            }

        } else {
            System.out.println("Intervalo inválido");
        }




    }
}
