package filas;
public class Main {
	public static void main(String[] args) {
		Fila f = new Fila(5);
		f.adicionar(99);
		f.adicionar(12);
		f.adicionar(45);
		f.adicionar(32);
		f.adicionar(81);	
		f.adicionar(100);	
		
		f.quantosNaFila();
		f.estaCheia();
		f.estaVazia();
		
		System.out.println("Pegando o item " + f.pegar());
		f.deletar();
//		f.deletar();
		f.status();
		
	}
}
