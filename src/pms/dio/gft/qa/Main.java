package pms.dio.gft.qa;

import pms.dio.gft.qa.model.Endereco;
import pms.dio.gft.qa.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco =
	            new Endereco("Rua 1",
	                "numero 50", "Jardim das flores");
	        System.out.println(endereco);
	        System.out.println("-----");
	        
	        Vendedor vendedor = new Vendedor();
	        vendedor.setNome("Phillip Marques");
	        vendedor.setDocumento("123.456.789-00");
	        vendedor.setValorSalario(1000d);
	        vendedor.setEndereco(endereco);
	        vendedor.calculaBonificacao(2.0);
	        System.out.println(vendedor);
	        System.out.println("-----");
	}

}
