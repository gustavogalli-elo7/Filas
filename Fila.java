package filas;

public class Fila {
	int head;
	int tail;
	int tamanho;
	int usada;
	int [] arrayFila;
	boolean lotada;
	
	public Fila(int tamanho) {
		this.tamanho = tamanho;
		this.head = 0;
		this.tail = -1;
		this.usada = 0;
		arrayFila = new int[tamanho];
		this.lotada = false;
	}

	
	
	public void adicionar(int item) {
		if (this.lotada) {
			System.out.println("Não é possível adicionar. A fila está lotada.");
		} else {
			this.tail = (this.tail + 1) % this.tamanho;
			System.out.println("Adicionando o item " + item + " na posição " + this.tail);
			this.arrayFila[this.tail] = item;
			this.usada = this.usada + 1;
			if (this.usada == this.tamanho) {
				this.lotada = true;
			}
		}
	}
	
	
	public int pegar() {
		return this.arrayFila[this.head];
	}
	
	
	public void deletar() {
		System.out.println("Deletando o item " + this.arrayFila[this.head]);
		this.head = this.head + 1;
	}
	
	
	public void estaVazia() {
		if (this.usada == 0) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("A fila não está vazia.");
		}
	}
	
	
	public void estaCheia() {
		if (this.usada == this.tamanho) {
			System.out.println("A fila está cheia.");
			this.lotada = true;
		} else {
			System.out.println("A fila não está cheia.");
		}
	}
	
	
	public void quantosNaFila() {
		if (this.usada == 1) {
			System.out.println("Temos 1 item na fila. Capacidade: " + this.tamanho);
		} else {
		System.out.println("Temos " + this.usada + " itens na fila. Capacidade: " + this.tamanho);
		}
	}
	
	
	public void status() {
		System.out.print("--------------------------\nLISTA: ");
		for(int item: arrayFila) {
		System.out.print(item + " ");
		}
		System.out.println("\n - Head: " + this.arrayFila[this.head] + "\n - Tail: " + this.arrayFila[this.tail] + "\n--------------------------");
		}
}
