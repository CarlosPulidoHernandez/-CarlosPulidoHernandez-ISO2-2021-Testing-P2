package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTestEACHUSE {
	
	// Each use tests

	@Test
	public void e1() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void e2() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.5);
	}
	
	@Test
	public void e3() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void e4() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(350,10);
		Person p = new Person(64,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void e5() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(24,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void e6() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(6,true,true,true);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void e7() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(30,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void e8() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(350,10);
		Person p = new Person(70,true,false,true);
		assertTrue(t.getTicket(p)==10);
	}
	
	

}
