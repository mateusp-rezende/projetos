package teste01;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
	    pessoa.setName("mateus");
	    pessoa.setIdade(17);
	    
	    System.out.println("Nome: " + pessoa.getName());
	    System.out.println("Idade: " + pessoa.getIdade()) ;
	}

}
