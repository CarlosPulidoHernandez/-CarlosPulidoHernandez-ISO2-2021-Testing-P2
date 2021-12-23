package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportDecisionTest {

	// Decision coverage Tests
	
	@Test
	public void testLevel0Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.4);
	}
	
	@Test
	public void testLevel0Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel0Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.2);
	}
	
	@Test
	public void testLevel1Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.7);
	}
	
	@Test
	public void testLevel1Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel1Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.5);
	}
	
	@Test
	public void testLevel2Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel2Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.2);
	}
	
	@Test
	public void testLevel3Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(450,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.2);
	}
	
	@Test
	public void testLevel3Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(450,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel3Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(450,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.5);
	}
	
	@Test
	public void testLevel4Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.5);
	}
	
	@Test
	public void testLevel4Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel4Age66() throws NotAllowedValueException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(66,false,true,false);	
		boolean thrown = false;
		try {
			t.getTicket(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	

}
