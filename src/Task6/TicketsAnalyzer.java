package Task6;

import java.util.LinkedList;
import java.util.List;

public class TicketsAnalyzer {


	private List<Ticket> tickets;


	public TicketsAnalyzer(int min, int max) {
		//this.min = min;
		//this.max = max;
		tickets = makeTickets(min, max);

	}

	public List<Ticket> makeTickets(int min, int max) {

		LinkedList<Ticket> tickets = new LinkedList<>();

		for (int i = min; i <= max; i++) {
			tickets.add(new Ticket(i));
		}

		return tickets;
	}


	public int findLuckyTicketsBySimpleMethod(List<Ticket> tickets) {
		int resultSimpleMethod = 0;

		for (Ticket tick : tickets) {
			if (tick.isLuckyTicketByCountSimple(tick.getNumber())) {
				resultSimpleMethod++;
			}
		}

		return resultSimpleMethod;
	}

	public int findLuckyTicketsByComplicatedMethod(List<Ticket> tickets) {
		int resultComplicatedMethod = 0;

		for (Ticket tick : tickets) {
			if (tick.isLuckyTicketByCountComplicated(tick.getNumber())) {
				resultComplicatedMethod++;
			}
		}
		return resultComplicatedMethod;
	}


	public String getLuckyTickets() {

		StringBuilder builder = new StringBuilder();
		int resultSimpleMethod = findLuckyTicketsBySimpleMethod(tickets);
		int resultComplicatedMethod = findLuckyTicketsByComplicatedMethod(tickets);

		if (resultComplicatedMethod > resultSimpleMethod) {
			builder.append("Winner-complicated method\n");
		} else if (resultComplicatedMethod < resultSimpleMethod) {
			builder.append("Winner-simple method\n");
		} else {
			builder.append("No winner\n");
		}

		builder.append("simple method ").append(resultSimpleMethod).append(" lucky tickets\n")
				.append("complicated method ").append(resultComplicatedMethod).append(" lucky tickets");

		return builder.toString();

	}


}
