package pacote;


class Teste {

	public static void main(String[] args) {
		Author a1 = new Author("Lenno", "razorraver1@hotmail.com", 'M');
		a1.status();
		Author a2 = new Author("Lenno2", "razorraver2@hotmail.com", 'F');
		a2.status();
		
		
		Book b1 = new Book ("Romance", a1, 500, 10);
		System.out.println("Nome: "+b1.getNome());
		System.out.println("Autor: "+b1.getAutor());
		System.out.println("Preço: "+b1.getPreco());
		System.out.println("Estoque: "+b1.getStock());
		
		Book b2 = new Book ("Terror", a2, 300, 20);
		System.out.println("Nome: "+b2.getNome());
		System.out.println("Autor: "+b2.getAutor());
		System.out.println("Preço: "+b2.getPreco());
		System.out.println("Estoque: "+b2.getStock());
		
		
		System.out.println(b1.Stringao());
		System.out.println(b2.Stringao());

		
		
		
		
		
	}

}
