package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTest {

	// Decision coverage Tests
	
	@Test
	public void testLevel0Age6() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(6,true,true,true);
		assertTrue(t.getTicket(p)==10*0.4);
	}
	
	@Test
	public void testLevel0Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.4);
	}
	@Test
	public void testLevel0Age23() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(23,false,false,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void testLevel0Age30() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(30,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void testLevel0Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel0Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.2);
	}
	@Test
	public void testLevel0Age70() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10*0.2);
	}
	@Test
	public void testLevel1Age6() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(6,true,true,true);
		assertTrue(t.getTicket(p)==10*0.7);
	}
	
	@Test
	public void testLevel1Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.7);
	}
	@Test
	public void testLevel1Age23() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(23,false,false,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void testLevel1Age30() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(30,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void testLevel1Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel1Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.5);
	}
	@Test
	public void testLevel1Age70() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10*0.5);
	}
	@Test
	public void testLevel2Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.8);
	}
	@Test
	public void testLevel2Age30() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(30,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel2Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel2Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*1.2);
	}
	@Test
	public void testLevel2Age70() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10*1.2);
	}
	@Test
	public void testLevel3Age6() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(6,true,true,true);
		assertTrue(t.getTicket(p)==10*1.2);
	}
	@Test
	public void testLevel3Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*1.2);
	}
	@Test
	public void testLevel3Age30() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(30,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel3Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel3Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*1.5);
	}
	@Test
	public void testLevel3Age70() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10*1.5);
	}
	
	@Test
	public void testLevel4Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*1.5);
	}
	
	@Test
	public void testLevel4Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel4Age66() throws NegativeValueException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(66,false,true,false);	
		boolean thrown = false;
		try {
			t.getTicket(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	// MD/DC Coverage
}
