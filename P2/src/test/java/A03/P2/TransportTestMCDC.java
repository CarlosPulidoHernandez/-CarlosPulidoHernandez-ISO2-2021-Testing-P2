package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTestMCDC {


	@Test
	public void testLevel0Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.4);
	}
	
	@Test
	public void testLevel0Age23() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel1Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.7);
	}
	
	@Test
	public void testLevel0Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.2);
	}
	
	@Test
	public void testLevel0Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
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
	public void testLevel2Age6() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(6,true,false,true);
		assertTrue(t.getTicket(p)==10*0.8);
	}
	@Test
	public void testLevel2Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(65,false,false,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void testLevel3Age23() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(24,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}@Test
	public void testLevel3Age70() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10*1.2);
	}
	@Test
	public void testLevel4Age30() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(30,false,true,true);
		assertTrue(t.getTicket(p)==10);
	}
	

}