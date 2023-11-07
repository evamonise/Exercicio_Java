package execicio_java;
import java.util.Scanner;

public class Pessoa {
	public static void main(String[] args) {

		
		String nome;
		String estado;
		String cidade;
		String bairro;
		String rua;
		String numero;
		String cep; 
		System.out.println("Para realizar o cadastro é necessário algumas informações sua.");
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInfome seu nome completo por gentileza: ");
		nome = teclado.nextLine();
		System.out.println("\nPara darmos continuidade ao cadastro infome seu endereço.");
		System.out.print("Digite estado em que você mora: ");
		estado = teclado.nextLine();
		System.out.print("Digite a cidade em que você mora: ");
		cidade = teclado.nextLine();
		System.out.print("Digite o bairro em que você mora: ");
		bairro = teclado.nextLine();
		System.out.print("Digite o nome da rua em que você mora: ");
		rua = teclado.nextLine();
		System.out.print("Digite o número da sua residência: ");
		numero = teclado.nextLine();
		System.out.print("Digite seu cep: ");
		cep = teclado.nextLine();
		
		
		System.out.println("\nOlá " +nome);
	    System.out.println("Bairro: " + estado);
	    System.out.println("Cidade: " + cidade);
	    System.out.println("Estado: " + bairro);
	    System.out.println("Rua: " + rua);
	    System.out.println("Número: " + numero);
	    System.out.println("Cep: " + cep);
	    System.out.println("\nSeu cadastro foi realizado com sucesso!!");
	    
	 
	    
	}

}
