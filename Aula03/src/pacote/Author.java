package pacote;

public class Author {
	
	private String nome;
	private String email;
	private char genero;
	
	public Author(String nome, String email, char genero) {
		this.nome = nome;
		this.email = email;
		this.genero = genero;
	}
	
	public String getNome () {
		return this.nome;
		
	}
	
	public String getEmail() {
		return this.email;
		
	}
	
	public void setEmail (String e) {
		this.email = e;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
    public void status () {
    	System.out.println("Autor: " +this.nome);
    	System.out.println("Email: " +this.email);
    	System.out.println("Genero: " +this.genero);
    }
    public String Stringao() {

		return (nome + ", " + email + ", " + genero);

	}
}
