package Task2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class EnvelopeAnalyzerTest {
	static EnvelopeAnalyzer analyzer;




	@Before
	public void setUp() throws Exception {

		analyzer = new EnvelopeAnalyzer();
		analyzer.add(new Envelope(2, 4));
		analyzer.add(new Envelope(2, 4));


	}

	@After
	public void tearDown() throws Exception {
		analyzer.removeAll();
	}


	@Test
	public void testCompare() {

		assertEquals(false,
				analyzer.isFits());

	}

	
}