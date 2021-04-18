package br.com.alura.escola.dominio;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

	private List<Ouvinte> ouvintes = new ArrayList<Ouvinte>();
	
	public void adicionar(Ouvinte ouvinte) {
		this.ouvintes.add(ouvinte);
	}
	
	public void publicar(Evento evento) {
		ouvintes.stream().forEach(ouvinte -> ouvinte.processa(evento));
	}
}
