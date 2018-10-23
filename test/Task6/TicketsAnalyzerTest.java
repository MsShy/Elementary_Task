package Task6;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class TicketsAnalyzerTest {

	private static TicketsAnalyzer ticketsAnalyzer;
	private static LinkedList<Ticket> ticket1 = new LinkedList<>();

	@BeforeClass
	public static void setUp() throws Exception {
		ticketsAnalyzer = new TicketsAnalyzer(400310, 400313);

		ticket1.add(new Ticket(400310));
		ticket1.add(new Ticket(400312));
		ticket1.add(new Ticket(400313));
	}



	@Test
	public void testFindLuckyTicketsBySimpleMethod() {
		int expectResult = 1;

		assertEquals(expectResult,
				ticketsAnalyzer.findLuckyTicketsBySimpleMethod(ticket1));


	}

	@Test
	public void testFindLuckyTicketsByComplicatedMethod() {
		int expectResult = 1;

		assertEquals(expectResult,
				ticketsAnalyzer.findLuckyTicketsByComplicatedMethod(ticket1));

	}

	@Test
	public void testGetLuckyTickets() {
		String expectResult = "No winner\n" +
				"simple method 1 lucky tickets\n" +
				"complicated method 1 lucky tickets";
		assertEquals(expectResult, ticketsAnalyzer.getLuckyTickets());

	}

	
}