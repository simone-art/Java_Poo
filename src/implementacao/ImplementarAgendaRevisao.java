package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ImplementarAgendaRevisao {
	
	public static void main(String[] args) throws ParseException {
		
		//Formatando a data no Java
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		//Reservando espaço para salvar o objeto(instanciar)
		//O espaço reservado é para a agenda
		AgendaRevisao agenda = new AgendaRevisao();
		
		//Atributos
		agenda.data = format.parse("27/10/2021 10:30");
		agenda.nomeCliente = "Simone Santos";
		agenda.contatoCliente = "7888-33-24";
		//agenda.horaAgendamento = "13:30";
		agenda.veiculo = "Ford";
		agenda.modelo = "Uno";
		
		System.out.println("A data da agenda é: " + agenda.data);
		System.out.println("O nome do cliente é: " + agenda.nomeCliente);
		System.out.println("O contato do cliente é: " + agenda.contatoCliente);
		System.out.println("A hora do agendamento é: " + agenda.horaAgendamento);
		System.out.println("O veiculo é: " + agenda.veiculo);
		System.out.println("O modelo do veiculo é: " + agenda.modelo);
		
		//Chamando o método para dentro do objeto
		agenda.agendarRevisao();
		
	}

}
