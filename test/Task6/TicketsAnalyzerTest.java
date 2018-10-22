package Task6;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 14.10.2018.
 */
public class TicketsAnalyzerTest {
	Ticket ticket;

	TicketsAnalyzer ticketsAnalyzer;
	LinkedList<Ticket> ticket1 = new LinkedList<>();

	@Before
	public void setUp() throws Exception {
		ticketsAnalyzer = new TicketsAnalyzer(400310, 400313);

		ticket1.add(ticket = new Ticket(400310));
		ticket1.add(ticket = new Ticket(400312));
		ticket1.add(ticket = new Ticket(400313));
	}


	@Test
	public void testMakeTickets() {
		assertEquals(ticket1.size(), ticketsAnalyzer.makeTickets(222222, 222224).size());

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
				"simple method 1 lucky ticketsAnalyzer\n" +
				"complicated method 1 lucky ticketsAnalyzer";
		assertEquals(expectResult, ticketsAnalyzer.getLuckyTickets());

	}

	
}