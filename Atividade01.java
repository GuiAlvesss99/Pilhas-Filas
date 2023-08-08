package Estruturadedados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner (System.in);
		
	
		String tabela=
				"""
				******************************************
				1- Adicionar cliente na fila
				2- Listar todos os clientes
				3- Retirar cliente da fila
				0- Sair
				*******************************************
				Entre com a opção desejada:
				""";
		System.out.println(tabela);
		
		int n1;
		String nome;
		
		while(true) {
		n1 = leia.nextInt();	
		
		switch(n1) {
		case 1:
			System.out.println("\nDigite seu nome:");
		    nome =leia.next();
		    fila.add(nome);
		    System.out.println("\nO cliente foi adicionado!");
		    break;
		    
		case 2:
			System.out.println("\nFila de clientes ");
			Iterator<String>iterator =fila.iterator();
			while(iterator.hasNext());{
			System.out.println(iterator.next());
			
		}
			break;
			
		   case 3:
               System.out.println(fila);
               if (fila.isEmpty()){
                   System.out.println("A fila esta vazia");
               }else {
                   fila.remove();
                   System.out.println("\nO cliente foi chamado");
                   System.out.println(fila);
               }
               break;
           case 0:
               System.out.println("\nObrigado por utilizar nosso programa");
               System.exit(0);
               break;
			
	}

	}
}
}