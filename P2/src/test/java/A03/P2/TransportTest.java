package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTest {
	
	// Each use Tests
	
	@Test
	public void eUse1() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException{
		Transport t = new Transport(50,10);
		t.setNormalSeats(1);
		t.setEssentialProfessionsSeats(1);
		Person p = new Person(23,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void eUse2() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(150,10);
		t.setNormalSeats(0);
		t.setEssentialProfessionsSeats(1);
		Person p = new Person(65,false,true,true);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void eUse3() throws NegativeValueException, NotHealthyException{
		Transport t = new Transport(20,10);
		t.setNormalSeats(0);
		t.setEssentialProfessionsSeats(0);
		Person p = new Person(22,false,true,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void eUse4() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(350,10);
		t.setNormalSeats(1);
		t.setEssentialProfessionsSeats(0);
		Person p = new Person(66,false,true,true);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void eUse5() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(550,10);
		t.setNormalSeats(-1);
		t.setEssentialProfessionsSeats(0);
		Person p = new Person(64,true,false,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}	
	
	// Pairwise Tests
	
	@Test
	public void pw1() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(250,10);
		t.setNormalSeats(-2147483647);
		t.setEssentialProfessionsSeats(2147483647);
		Person p = new Person(65,true,true,true);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);	
	}
	
	@Test
	public void pw2() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException{
		Transport t = new Transport(250,10);
		t.setNormalSeats(2147483647);
		Person p = new Person(69,false,false,true);
		boolean thrown = false;
		try {
			t.setEssentialProfessionsSeats(Integer.parseInt("2147483648"));
			t.calculateTicketCost(p);
		}catch (java.lang.NumberFormatException e) {
			thrown = true;
		}
		assertTrue(thrown);	
	}
	
	@Test
	public void pw3() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException{
		Transport t = new Transport(250,10);
		t.setLevel(-2147483648);
		t.setEssentialProfessionsSeats(1);
		Person p = new Person(64,true,false,true);
		boolean thrown = false;
		try {
			t.setNormalSeats(Integer.parseInt("2147483648"));
			t.calculateTicketCost(p);
		}catch (java.lang.NumberFormatException e) {
			thrown = true;
		}
		assertTrue(thrown);	
	}
	
	@Test
	public void pw4() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException{
		Transport t = new Transport(350,10);
		t.setEssentialProfessionsSeats(-2147483647);
		boolean thrown = false;
		try {
			Person p = new Person(Integer.parseInt("2147483648"),false,true,false);
			t.setNormalSeats(Integer.parseInt("-2247483648"));
			t.calculateTicketCost(p);
		}catch (java.lang.NumberFormatException e) {
			thrown = true;
		}
		assertTrue(thrown);	
	}
	
	@Test
	public void pw5() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(350,10);
		t.setLevel(2147483646);
		t.setNormalSeats(1);
		t.setEssentialProfessionsSeats(-2147483648);
		Person p = new Person(2147483647,false,true,true);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);	
	}
		
	// Decision coverage Tests
	
	@Test
	public void Health() throws NegativeValueException, NoSeatsAvailableException{
		Transport t = new Transport(50,10);
		Person p = new Person(22,false,false,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NotHealthyException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void esentialProfessionEPS() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		t.setEssentialProfessionsSeats(1);
		Person p = new Person(22,true,true,false);
		t.calculateTicketCost(p);
		assertTrue(t.getEssentialProfessionsSeats() == 0);
	}
	
	@Test
	public void esentialProfessionNS() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(350,10);
		t.setEssentialProfessionsSeats(0);
		t.setNormalSeats(1);
		Person p = new Person(22,true,true,false);
		t.calculateTicketCost(p);
		assertTrue(t.getNormalSeats() == 0);
	}
	
	@Test
	public void esentialProfessionNoSeats() throws NegativeValueException, NotHealthyException {
		Transport t = new Transport(450,10);
		t.setEssentialProfessionsSeats(0);
		t.setNormalSeats(0);
		Person p = new Person(22,true,true,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void essentialProfessionNSLevel0() throws NegativeValueException, NotHealthyException, NoSeatsAvailableException {
		Transport t = new Transport(50,10);
		t.setNormalSeats(1);
		Person p = new Person(22,true,true,false);
		t.calculateTicketCost(p);
		assertTrue(t.getNormalSeats() == 0);
	}
	
	@Test
	public void essentialProfessionNoSeatsLevel1() throws NegativeValueException, NotHealthyException {
		Transport t = new Transport(150,10);
		t.setNormalSeats(0);
		Person p = new Person(22,true,true,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void NoSeats() throws NegativeValueException, NotHealthyException {
		Transport t = new Transport(450,10);
		t.setNormalSeats(0);
		Person p = new Person(22,false,true,false);
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	@Test
	public void NS() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(350,10);
		t.setNormalSeats(1);
		Person p = new Person(22,false,true,false);
		t.calculateTicketCost(p);
		assertTrue(t.getNormalSeats() == 0);
	}
		
	@Test
	public void testLevel0Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*0.4);
	}
	
	@Test
	public void testLevel0Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void testLevel0Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*0.2);
	}
	
	@Test
	public void testLevel1Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*0.7);
	}
	
	@Test
	public void testLevel1Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void testLevel1Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*0.5);
	}
	
	@Test
	public void testLevel2Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void testLevel2Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(250,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*1.2);
	}
	
	@Test
	public void testLevel3Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*1.2);
	}
	
	@Test
	public void testLevel3Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void testLevel3Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(450,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*1.5);
	}
	
	@Test
	public void testLevel4Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10*1.5);
	}
	
	@Test
	public void testLevel4Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.calculateTicketCost(p)==10);
	}
	
	@Test
	public void testLevel4Age66() throws NegativeValueException, NotHealthyException {
		Transport t = new Transport(550,10);
		Person p = new Person(66,false,true,false);	
		boolean thrown = false;
		try {
			t.calculateTicketCost(p);
		}catch(NoSeatsAvailableException e){
			thrown = true;
		}	
		assertTrue(thrown);
	}
	
	// MD/DC Coverage
}
