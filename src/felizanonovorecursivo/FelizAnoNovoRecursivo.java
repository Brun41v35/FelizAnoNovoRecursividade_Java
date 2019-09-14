package felizanonovorecursivo;

import java.util.Scanner;

public class FelizAnoNovoRecursivo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        contagem(teclado.nextInt());
    }
    
    public static void contagem(int numero) {
        if(numero == 0) {
            System.out.println("Feliz Ano Novo!!!");
        } else {
            System.out.println(numero);
            contagem(numero - 1);
        }
    }
    
}
