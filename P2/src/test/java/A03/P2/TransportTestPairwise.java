package A03.P2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TransportTestPairwise {
	@Test
	public void Pairwise1level0() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(22,true,false,true);
		assertTrue(t.getTicket(p)==10*0.4);
	}
	@Test
	public void Pairwise2level1() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(23,false,false,false);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void Pairwise3level2() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(64,false,true,true);
		assertTrue(t.getTicket(p)==10);
	}
	@Test
	public void Pairwise4level3() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(65,false,false,false);
		assertTrue(t.getTicket(p)==10*1.5);
	}
	@Test
	public void Pairwise5level4() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(69,true,true,false);
		//Expected customized NoSeatsAvaliable exception
		boolean ThrowExcept = false;
		try {
		t.getTicket(p);
		}catch(NoSeatsAvailableException e) {
			ThrowExcept = true;
			assert(ThrowExcept);
		}
		}
	@Test
	public void Pairwise6level4() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(2147483646,true,false,true);
		//Expected customized NoSeatsAvaliable exception
		boolean ThrowExcept = false;
		try {
		t.getTicket(p);
		}catch(NoSeatsAvailableException e) {
			ThrowExcept = true;
			assert(ThrowExcept);
		}
		}
}
