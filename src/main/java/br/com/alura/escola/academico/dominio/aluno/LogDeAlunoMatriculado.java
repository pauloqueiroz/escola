package br.com.alura.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.academico.dominio.Evento;
import br.com.alura.escola.academico.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte{

	public void reageAo(Evento evento) {
		String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
		System.out.println(String.format("Aluno com CPF %s matriculado em: %s", ((AlunoMatriculado) evento).getCpfDoAluno().getNumero(), momentoFormatado));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		if(evento instanceof AlunoMatriculado) {
			return true;
		}
		return false;
	}
}
