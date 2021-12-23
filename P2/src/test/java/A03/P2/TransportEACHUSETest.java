package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportEACHUSETest {
	
	// Each use coverage

	@Test
	public void e1() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(50,ticketPrice);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void e2() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(150,ticketPrice);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice*0.5);
	}
	
	@Test
	public void e3() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(250,ticketPrice);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void e4() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(350,ticketPrice);
		Person p = new Person(64,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void e5() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		Transport t = new Transport(550,ticketPrice);
		Person p = new Person(24,false,true,false);
		assertTrue(t.getTicket(p)==ticketPrice);
	}
	
	@Test
	public void e6() throws NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(22,false,true,false);
			t.setLevel(-1);
			t.getTicket(p);
		}catch(NotAllowedValueException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e7() throws NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(2147483646,false,true,false);
			t.setLevel(-2147483647);
			t.getTicket(p);
		}catch(NotAllowedValueException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e8() throws NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(2147483647,false,true,false);
			t.setLevel(-2147483648);
			t.getTicket(p);
		}catch(NotAllowedValueException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e9() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(Integer.parseInt("2147483648"),false,true,false);
			t.setLevel(Integer.parseInt("-2147483649"));
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e10() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(0,false,true,false);
			t.setLevel(Integer.parseInt("-2247483648"));
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e11() throws NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(30,false,true,false);
			t.setLevel(2147483646);
			t.getTicket(p);
		}catch(NotAllowedValueException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e12() throws NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(69,false,true,false);
			t.setLevel(2147483647);
			t.getTicket(p);
		}catch(NotAllowedValueException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e13() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(Integer.parseInt("2247483648"),false,true,false);
			t.setLevel(5);
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e14() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(Integer.parseInt("-2147483647"),false,true,false);
			t.setLevel(Integer.parseInt("2147483648"));
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e15() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(550,ticketPrice);
			Person p = new Person(Integer.parseInt("-2147483648"),false,true,false);
			t.setLevel(Integer.parseInt("2247483648"));
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e16() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(150,ticketPrice);
			Person p = new Person(Integer.parseInt("-2147483649"),false,true,false);
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	
	@Test
	public void e17() throws NotAllowedValueException, NoSeatsAvailableException, NotHealthyException {
		double ticketPrice = 10;
		boolean thrown = false;
		try {
			Transport t = new Transport(150,ticketPrice);
			Person p = new Person(Integer.parseInt("-2247483648"),false,true,false);
			t.getTicket(p);
		}catch(java.lang.NumberFormatException e) {
			thrown = true;		
		}
		assertTrue(thrown);
	}
	

}
