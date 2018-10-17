import Task2.EnvelopeAnalyzerTest;
import Task6.ComplicatedMethodTest;
import Task6.SimpleMethodTest;
import Task6.TicketManagerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		SimpleMethodTest.class,
		ComplicatedMethodTest.class,
		TicketManagerTest.class,
		EnvelopeAnalyzerTest.class,

})
public class TestSuit {
}
