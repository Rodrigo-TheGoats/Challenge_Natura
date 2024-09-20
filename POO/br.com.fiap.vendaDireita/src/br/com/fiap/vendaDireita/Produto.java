package br.com.fiap.vendaDireita;

public class Produto {
	protected String codigo;
	protected String nome;
	protected double preco;
	protected boolean status;
	protected int estoque;
		
	public Produto(String codigo, String nome, double preco, boolean status, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.status = status;
		this.estoque = estoque;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isDisponivel() {
		if (this.estoque > 0)
			this.status = true;
		else
			this.status = false;
		return this.status;
	}
	
	public void aplicarDesconto(double desconto) {
		double preco;
		if (desconto > 1)
			desconto /= 100;
		preco = this.preco * (1 - desconto);
		
		setPreco(preco);
	}
}
