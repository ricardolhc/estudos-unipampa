import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
                do {
            
                        System.out.print("Informe um número inteiro ou zero para sair: ");
                        numero = entrada.nextInt();
            
                        if(numero != 0) {
                                System.out.println("O quadrado de " + numero + " é: " + numero * numero);
                        }
            
                } while(numero != 0);
        
	}
}
