package Task6;

public class Main {


	public static void main(String[] args) throws Exception {

		Tickets tickets = TicketManager.initializeTickets();
		assert tickets != null;
		System.out.println(tickets.getLuckyTickets());


	}
}