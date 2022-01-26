package A03.P2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TransportPairwiseTest {
	
	// Pairwise tests
	
	@Test
	public void Pairwise1level0() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(22,true,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.4);
	}
	
	@Test
	public void Pairwise2level0() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(30,true,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void Pairwise3level1() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void Pairwise4level1() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(2147483646,true,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.5);
	}
		
	@Test
	public void Pairwise5level2() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(64,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void Pairwise6level2() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(24,true,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	
	@Test
	public void Pairwise7level3() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(450,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void Pairwise8level3() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(450,ticketPrice);
		Person p = new Person(-2147483647,true,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*1.2);
	}
	
	@Test
	public void Pairwise9level4() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(69,true,true,false);
		boolean ThrowExcept = false;
		try {
			t.getTicket(p);
		}catch(NoSeatsAvailableException e) {
			ThrowExcept = true;
		}
		assertTrue(ThrowExcept);
	}
	
	@Test
	public void Pairwise10level4() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(2147483646,true,true,false);
		boolean ThrowExcept = false;
		try {
			t.getTicket(p);
		}catch(NoSeatsAvailableException e) {
			ThrowExcept = true;
		}
		assertTrue(ThrowExcept);
	}
	
	
}
