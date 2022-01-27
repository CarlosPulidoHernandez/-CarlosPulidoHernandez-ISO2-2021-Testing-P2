package a03.p2;

import static org.junit.Assert.*;

import org.junit.Test;

import a03.p2.NoSeatsAvailableException;
import a03.p2.NotAllowedValueException;
import a03.p2.NotHealthyException;
import a03.p2.Person;
import a03.p2.Transport;

public class TransportMCDCTest {
	
	// MCDC coverage


	@Test
	public void testLevel0Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.4);
	}
	
	@Test
	public void testLevel0Age23() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel1Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.7);
	}
	
	@Test
	public void testLevel0Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.2);
	}
	
	@Test
	public void testLevel0Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
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
	public void testLevel1Age23() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel2Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel1Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
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
	public void testLevel2Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel3Age66() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(350,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.5);
	}
	
	@Test
	public void testLevel3Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(350,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.2);
	}
	
	@Test
	public void testLevel3Age23() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(350,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel4Age22() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.5);
	}
	
	@Test
	public void testLevel3Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(350,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel4Age66() throws NotAllowedValueException, NotHealthyException {
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
	
	@Test
	public void testLevel4Age23() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void testLevel4Age65() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	


}
