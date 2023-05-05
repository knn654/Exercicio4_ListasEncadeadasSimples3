package view;

import br.com.kaua.Lista;

public class Principal {
	public static void main(String[] args) throws Exception {
			Lista lista = new Lista();
			int maior = 0;
			int segundoMaior = 0;
			lista.addFirst(3);
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(3);
			lista.addLast(7);
			lista.addLast(16);
			for (int i =0; i < lista.size(); i++) {
				if (lista.get(i) > maior) {
					System.out.println("Novo maior: " + lista.get(i));
					maior = lista.get(i);
				}
			}
			for (int i =0; i < lista.size(); i++) {
				if (lista.get(i) > segundoMaior && lista.get(i) != maior) {
					System.out.println("Novo segundo maior: " + lista.get(i));
					segundoMaior = lista.get(i);
				}
			}
			System.out.println("Maior: " + maior + " | Segundo maior: " + segundoMaior);
	}
}
