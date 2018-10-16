package Task6;

public class Main {


	public static void main(String[] args) {


		Tickets tickets =TicketManager.initializeTickets();
		if (tickets!= null) {
			System.out.println(tickets.getLuckyTickets());
		}

	}
}