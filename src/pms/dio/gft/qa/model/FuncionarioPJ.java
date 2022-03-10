package pms.dio.gft.qa.model;

public abstract class FuncionarioPJ {
	
	private String nome;
	private String documento;
	private Endereco endereco;
	private Integer horasTrabalhadas;
	private Double valorHora;
	private Double valorRemunerac�o;
	
	public void calculaRemuneracao() {
		this.valorRemunerac�o = this.horasTrabalhadas * this.valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double getValorRemunerac�o() {
		return valorRemunerac�o;
	}

	public void setValorRemunerac�o(Double valorRemunerac�o) {
		this.valorRemunerac�o = valorRemunerac�o;
	}
	
	
}
