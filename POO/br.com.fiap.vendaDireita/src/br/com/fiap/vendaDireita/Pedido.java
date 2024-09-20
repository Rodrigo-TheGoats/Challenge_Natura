package br.com.fiap.vendaDireita;

public class Pedido {
	protected Produto produto;
	protected Consultora consultora;
	
	public Pedido(Produto produto, Consultora consultora) {
		super();
		this.produto = produto;
		this.consultora = consultora;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Consultora getConsultora() {
		return consultora;
	}
	
	public void setConsultora(Consultora consultora) {
		this.consultora = consultora;
	}
	
	public void aplicarDesconto(double desconto) {
		produto.aplicarDesconto(desconto);
	}
	
}
