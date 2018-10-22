package Task6;

public class Main {


	public static void main(String[] args) {


		TicketsAnalyzer ticketsAnalyzer =TicketManager.initializeTickets();
		if (ticketsAnalyzer != null) {
			System.out.println(ticketsAnalyzer.getLuckyTickets());
		}

	}
}