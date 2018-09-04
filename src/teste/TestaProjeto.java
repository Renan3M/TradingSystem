package teste;

import negocio.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class TestaProjeto {
	private static String rua;       
	private static String numeroCasa;
	private static String bairro;    
	private static String cidade;    
	private static String estado;    
	private static String uf;       
	private static Scanner ler;
	private static Endereco endereco;
	
	public static void main(String[] args) {
		
		ler = new Scanner(System.in);

		
		try {
			getInput();
			endereco = new Endereco(rua, numeroCasa,bairro,cidade,estado,uf);
		} catch (IOException e) {
			endereco = new Endereco();
		}
		
		endereco.divulgar();
		

	}
	
	
	private static void getInput() throws IOException {
		IOException ex = new IOException("Algum campo não foi preenchido");
		
		System.out.println("::: Preenchimento do endereço :::");
		
		System.out.print("Rua /Av :");
		rua = ler.nextLine();
		System.out.print("Número da casa: ");
		numeroCasa = ler.nextLine();
		System.out.print("Bairro: ");
		bairro = ler.nextLine();
		System.out.print("Cidade: ");
		cidade = ler.nextLine();
		System.out.print("Estado: ");
		estado = ler.nextLine();
		System.out.println("UF: ");
		uf = ler.nextLine();
		
		if(rua == "" || numeroCasa == "" || bairro == "" || 
				cidade == "" || estado == "" || uf == "") { throw ex;}
		
	}

}
