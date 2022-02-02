package a03.p2;

public class Transport implements I_Transport{
	
	private final int totalNumberSeats;
	private int normalSeats;
	private int essentialProf;
	private int level;
	private final double ticketPrice;
	
	public Transport(final int totalNumberSeats, final double ticketPrice) throws NotAllowedValueException {
		this.totalNumberSeats = totalNumberSeats;
		this.ticketPrice = ticketPrice;	
		if(this.totalNumberSeats < 0 || this.ticketPrice < 0) {
			throw new NotAllowedValueException("Variables can not get negative values");
		}
		calculateAvailableSeats();
	}

	private void calculateAvailableSeats() {
		
		if(this.totalNumberSeats>=0 && this.totalNumberSeats<100) { // LEVEL 0
			this.level = 0;
			this.normalSeats = this.totalNumberSeats;
			this.essentialProf = 0;
		} else if(this.totalNumberSeats>=100 && this.totalNumberSeats<=200) { // LEVEL 1
			this.level = 1;
			this.normalSeats = (int) (0.8 * this.totalNumberSeats);
			this.essentialProf = 0;
		} else if(this.totalNumberSeats>=201 && this.totalNumberSeats<=300) { // LEVEL 2
			this.level = 2;
			this.normalSeats = (int) (0.6 * this.totalNumberSeats);
			this.essentialProf = (int) (0.6 * this.normalSeats);
			this.normalSeats -= this.essentialProf;
		} else if(this.totalNumberSeats>=301 && this.totalNumberSeats<=500) { // LEVEL 3
			this.level = 3;
			this.normalSeats = (int) (0.4 * this.totalNumberSeats); 
			this.essentialProf = (int) (0.8 * this.normalSeats);
			this.normalSeats -= this.essentialProf;
		} else { // LEVEL 4
			this.level = 4;
			this.normalSeats = (int) (0.3 * this.totalNumberSeats);
			this.essentialProf = (int) (0.9 * this.normalSeats);
			this.normalSeats -= this.essentialProf;
		}
		
	}
	
	public double getTicket(final Person person) throws NotHealthyException, NoSeatsAvailableException {
		checkHealthConditions(person);	
		assignSeat(person);
		return calculateTicketCost(person);
	}
		
	public double calculateTicketCost(final Person person) throws NoSeatsAvailableException {
		double price = 0;
	
		if(this.level == LEVEL_0) {
			if(person.getAge() < MINOR_AGE_LIMIT) {
				price = 0.4 * this.ticketPrice;
			}else if(person.getAge() > MAJOR_AGE_LIMIT) {
				price = 0.2 * this.ticketPrice;		
			}else {
				price = this.ticketPrice;
			}		
		}else if(this.level == LEVEL_1){
			if(person.getAge() < MINOR_AGE_LIMIT) {
				price = 0.7 * this.ticketPrice;
			}else if (person.getAge() > MAJOR_AGE_LIMIT) {
				price = 0.5 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}
		}else if(this.level == LEVEL_2) {
			if (person.getAge() > MAJOR_AGE_LIMIT) {
				price = 1.2 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}	
		}else if(this.level == LEVEL_3) {
			if(person.getAge() < MINOR_AGE_LIMIT) {
				price = 1.2 * this.ticketPrice;
			}else if (person.getAge() > MAJOR_AGE_LIMIT) {
				price = 1.5 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}				
		}else{
			if(person.getAge() < MINOR_AGE_LIMIT) {
				price = 1.5 * this.ticketPrice;
			}else if (person.getAge() > MAJOR_AGE_LIMIT) {
				throw new NoSeatsAvailableException("You are not allowed to travel");
			}else {
				price = this.ticketPrice;
			}
		}	
		
		return price;
	}
	
	public void checkHealthConditions(final Person person) throws NotHealthyException {	
		if(!person.isCOVIDPassport() || person.isIll()) {
			throw new NotHealthyException("You are not allowed to travel in those conditions");
		}
	}
	
	public void assignSeat(final Person person) throws NoSeatsAvailableException {	
		if(person.isEssentialProfession() && (this.level == 2 || this.level == 3 || this.level == 4)) {
			if(isEssentialProfessionsSeats()) {
				this.essentialProf -= 1;
			}else if(isNormalSeats()) {
				this.normalSeats -= 1;
			}else {
				throw new NoSeatsAvailableException("There are no seats available");
			}
		}else {
			if(isNormalSeats()) {
				this.normalSeats -= 1;
			}else {
				throw new NoSeatsAvailableException("There are no seats available");
			}
		}
	}
		
	public boolean isNormalSeats(){
		return this.normalSeats-1 >= 0;
	}
	
	public boolean isEssentialProfessionsSeats(){
		return this.essentialProf-1 >= 0;
	}

	public int getTotalNumberSeats() {
		return totalNumberSeats;
	}

	public int getNormalSeats() {
		return normalSeats;
	}

	public int getEssentialProfessionsSeats() {
		return essentialProf;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(final int level) throws NotAllowedValueException {
		if(level < 0 || level > 4) {
			throw new NotAllowedValueException("Level mut be between 0 and 4");
		}
		this.level = level;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
			
}
