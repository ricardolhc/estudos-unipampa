import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite um numero: ");
        	float n = sc.nextFloat();
            
            	System.out.print("O sucessor de " + n + " é: " + ++n);
	}
}
