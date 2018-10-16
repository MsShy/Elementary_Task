package Task6;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 14.10.2018.
 */
public class TicketsTest {
	Ticket ticket;

	Tickets tickets;
	LinkedList<Ticket> ticket1 = new LinkedList<>();

	@Before
	public void setUp() throws Exception {
		tickets = new Tickets(400310, 400313);

		ticket1.add(ticket = new Ticket(400310));
		ticket1.add(ticket = new Ticket(400312));
		ticket1.add(ticket = new Ticket(400313));
	}


	@Test
	public void testMakeTickets() {
		assertEquals(ticket1.size(), tickets.makeTickets(222222, 222224).size());

	}


	@Test
	public void testFindLuckyTicketsBySimpleMethod() {
		int expectResult = 1;

		assertEquals(expectResult,
				tickets.findLuckyTicketsBySimpleMethod(ticket1));


	}

	@Test
	public void testFindLuckyTicketsByComplicatedMethod() {
		int expectResult = 1;

		assertEquals(expectResult,
				tickets.findLuckyTicketsByComplicatedMethod(ticket1));

	}

	@Test
	public void testGetLuckyTickets() {
		String expectResult = "No winner\n" +
				"simple method 1 lucky tickets\n" +
				"complicated method 1 lucky tickets";
		assertEquals(expectResult, tickets.getLuckyTickets());

	}

	
}