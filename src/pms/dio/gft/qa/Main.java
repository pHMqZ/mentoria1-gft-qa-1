package pms.dio.gft.qa;

import pms.dio.gft.qa.model.Endereco;
import pms.dio.gft.qa.model.Gerente;
import pms.dio.gft.qa.model.OperadorDeCaixa;
import pms.dio.gft.qa.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco =
	            new Endereco("Rua 1",
	                "numero 50", "Jardim das flores");
	        System.out.println(endereco);
	        System.out.println("-----");
	        
	        Vendedor vendedor1 = new Vendedor();
	        vendedor1.setNome("Phillip Marques");
	        vendedor1.setDocumento("123.456.789-00");
	        vendedor1.setValorSalario(1000d);
	        vendedor1.setEndereco(endereco);
	        vendedor1.calculaBonificacao(2.0);
	        System.out.println(vendedor1);
	        System.out.println("-----");
	        
	        Vendedor vendedor2 = new Vendedor();
	        vendedor2.setNome("Alceu");
	        vendedor2.setDocumento("456.123.789-00");
	        vendedor2.setValorSalario(1500d);
	        vendedor2.setEndereco(endereco);
	        vendedor2.calculaBonificacao(2.5);
	        System.out.println(vendedor2);
	        System.out.println("-----");
	        
	        OperadorDeCaixa operadorCaixa =
	                new OperadorDeCaixa("Banguela", "789.456.123-00", 2000d, endereco);
	            System.out.println(operadorCaixa);
	            System.out.println("-----");

	            Gerente gerente = new Gerente();
	            gerente.setNome("Elis Bexiga");
	            gerente.setDocumento("456.123.789-00");
	            gerente.setEndereco(endereco);
	            gerente.setHorasTrabalhadas(35);
	            gerente.setValorHora(100d);

	            gerente.calculaRemuneracao();
	            gerente.calculaBonificacao(3d);
	            System.out.println(gerente);
	}

}
