package Estruturadedados;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");//push -- insere um elemento na pilha
		pilha.push("Prato azul");
		pilha.push("Prato branco");
		pilha.push("Prato preto");
		
		System.out.println("\nElementos da Pilha: "+pilha);
		
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());//exclui um elemento da pilha
		
		System.out.println("\nElementos da Pilha: "+pilha);
		
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		
		System.out.println("\nElementos da Pilha: "+pilha);
		
		System.out.println("\nElemento do topo da Pilha: "+pilha.peek());//mostra o elemento do topo da pilha
		
		System.out.println("\nAdicionar um elemento na Pilha: "+pilha.push("Prato roxo"));//adicionar um elemento na pilha
		
		System.out.println("\nElementos da Pilha: "+pilha);
		
		System.out.println("\nTamanho da Pilha: "+pilha.size());//mostra o tamanho da pilha
		
		System.out.println("\nO elemento prato verde existe na pilha? "+pilha.contains("Prato verde"));//verifica se um elemento contém dentro da pilha
		
		System.out.println("\nExibir todos os elementos da pilha através do Iterator... ");
		
		Iterator<String> iterator =  pilha.iterator();//modifica a saída da visualização da pilha
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		pilha.clear();//limpa a pilha
		
		System.out.println("\nA pilha está vazia? "+pilha.isEmpty());//verifica se a pilha está vazia
		
	}

}