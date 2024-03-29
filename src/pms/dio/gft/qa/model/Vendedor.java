package pms.dio.gft.qa.model;

import pms.dio.gft.qa.CalculaBonificacao;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
	private Double valorDaBonificacao;
	
	@Override
	  public void calculaBonificacao(Double porcentagemBonificacao) {
	    this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
	  }

	  @Override
	  public String toString() {
	    return "Vendedor{" +
	        "nome='" + nome + '\'' +
	        ", documento='" + documento + '\'' +
	        ", valorSalario=" + valorSalario +
	        ", endereco=" + endereco.getRua() +
	        ", valorDaBonificacao=" + valorDaBonificacao +
	        '}';
	  }

}
