package A03.P2;

public class Principal {
	
	public static void main(String args []) {
		Person p1 = new Person(12, true, true, false);
		Person p2 = new Person(90, false, true, false);	
		Transport t1;
		try {
			t1 = new Transport(220,10);
			try {
				System.out.println(t1.calculateTicketCost(p1));
			}catch(NoSeatsAvailableException e){
				System.out.println(e);
			}catch(NotHealthyException e) {
				System.out.println(e);
			}
				
			try {
				System.out.println(t1.calculateTicketCost(p2));
			}catch(NoSeatsAvailableException e){
				System.out.println(e);
			}catch(NotHealthyException e) {
				System.out.println(e);
			}
		}catch(NegativeValueException e) {
			System.out.println(e);
		}	
	}

}
