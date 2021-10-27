package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import beans.AgendaRevisao;

public class ImplementarAgendaRevisao {
	
	public static void main(String[] args) throws ParseException {
		
		//Formatando a data no Java
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss" );
		Calendar cal = Calendar.getInstance();
	    
	    cal.set(Calendar.HOUR_OF_DAY, 13);
	    cal.set(Calendar.MINUTE, 30);
		
		//Reservando espa�o para salvar o objeto(instanciar)
		//O espa�o reservado � para a agenda
		AgendaRevisao agenda = new AgendaRevisao();
		//Atributos
		agenda.data = format.parse("27/10/2021 10:30");
		agenda.nomeCliente = "Simone Santos";
		agenda.contatoCliente = "7888-33-24";
		agenda.horaAgendamento = sdf.format(cal.getTime());
		agenda.veiculo = "Ford";
		agenda.modelo = "Uno";
		
		System.out.println("A data da agenda �: " + agenda.data);
		System.out.println("O nome do cliente �: " + agenda.nomeCliente);
		System.out.println("O contato do cliente �: " + agenda.contatoCliente);
		System.out.println("A hora do agendamento �: " + agenda.horaAgendamento);
		System.out.println("O veiculo �: " + agenda.veiculo);
		System.out.println("O modelo do veiculo �: " + agenda.modelo);
		
		//Chamando o m�todo para dentro do objeto
		agenda.agendarRevisao();
		
	}

}
