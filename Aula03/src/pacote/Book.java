package pacote;

public class Book {
	
	private String nome;
	private double preco;
	private int qtdStock;
	private Author autor;
	
	public Book (String nome, Author autor, double preco, int qtdStock) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.qtdStock = qtdStock;
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	public Author getAutor() {
		return this.autor;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double p) {
		this.preco = p;
	}
	
	public int getStock() {
		return this.qtdStock;
	}
	
	public void setQtdStock(int q) {
		this.qtdStock = q;
	}
	
	public void statusBook() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Autor: " +this.autor);
		System.out.println("Preço: "+this.preco);
		System.out.println("Estoque: "+this.qtdStock);
		
	}
	
	public String Stringao() {

		return (autor.Stringao() + ", " + nome + ", " + preco + ", " + qtdStock+".");

	}

}
