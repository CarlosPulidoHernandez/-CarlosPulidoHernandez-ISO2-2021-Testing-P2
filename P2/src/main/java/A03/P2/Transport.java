package A03.P2;

public class Transport {
	
	private int totalNumberSeats;
	private int normalSeats;
	private int essentialProfessionsSeats;
	private int level;
	private float ticketPrice;
	
	public Transport(int totalNumberSeats, float ticketPrice) throws NegativeValueException {
		this.totalNumberSeats = totalNumberSeats;
		this.ticketPrice = ticketPrice;	
		if(this.totalNumberSeats < 0 || this.ticketPrice <0) {
			throw new NegativeValueException("A variable can not get negative values");
		}
		calculateAvailableSeats();
	}

	private void calculateAvailableSeats() {
		
		if(this.totalNumberSeats>=0 && this.totalNumberSeats<100) { // LEVEL 0
			this.level = 0;
			this.normalSeats = this.totalNumberSeats;
			this.essentialProfessionsSeats = 0;
		} else if(this.totalNumberSeats>=100 && this.totalNumberSeats<=200) { // LEVEL 1
			this.level = 1;
			this.normalSeats = (int) (0.8 * this.totalNumberSeats);
			this.essentialProfessionsSeats = 0;
		} else if(this.totalNumberSeats>=201 && this.totalNumberSeats<=300) { // LEVEL 2
			this.level = 2;
			this.normalSeats = (int) (0.6 * this.totalNumberSeats);
			this.essentialProfessionsSeats = (int) (0.6 * this.normalSeats);
			this.normalSeats -= this.essentialProfessionsSeats;
		} else if(this.totalNumberSeats>=301 && this.totalNumberSeats<=500) { // LEVEL 3
			this.level = 3;
			this.normalSeats = (int) (0.4 * this.totalNumberSeats); 
			this.essentialProfessionsSeats = (int) (0.8 * this.normalSeats);
			this.normalSeats -= this.essentialProfessionsSeats;
		} else { // LEVEL 4
			this.level = 4;
			this.normalSeats = (int) (0.3 * this.totalNumberSeats);
			this.essentialProfessionsSeats = (int) (0.9 * this.normalSeats);
			this.normalSeats -= this.essentialProfessionsSeats;
		}
		
	}
		
	public double calculateTicketCost(Person person) throws NoSeatsAvailableException, NotHealthyException {
		double price = 0;
		
		
		if(!person.isCOVIDPassport() || person.isIll()) {
			throw new NotHealthyException("You are not allowed to travel in those conditions");
		}
	
		if(person.isEssentialProfession()) {
			if(this.level == 2 || this.level == 3 || this.level == 4) {
				if((this.essentialProfessionsSeats-1)>=0) {
					this.essentialProfessionsSeats -= 1;
				}else if((this.normalSeats-1)>=0) {
					this.normalSeats -= 1;
				}else {
					throw new NoSeatsAvailableException("There are no seats available");
				}
			}else {
				if((this.normalSeats-1)>=0) {
					this.normalSeats -= 1;
				}else {
					throw new NoSeatsAvailableException("There are no seats available");
				}
			}
		}else {
			if((this.normalSeats-1)>=0) {
				this.normalSeats -= 1;
			}else {
				throw new NoSeatsAvailableException("There are no seats available");
			}
		}
	
		if(this.level == 0) {
			if(person.getAge() < 23) {
				price = 0.4 * this.ticketPrice;
			}else if(person.getAge() > 65) {
				price = 0.2 * this.ticketPrice;		
			}else {
				price = this.ticketPrice;
			}		
		}else if(this.level == 1){
			if(person.getAge() < 23) {
				price = 0.7 * this.ticketPrice;
			}else if (person.getAge() > 65) {
				price = 0.5 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}
		}else if(this.level == 2) {
			if (person.getAge() > 65) {
				price = 1.2 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}	
		}else if(this.level == 3) {
			if(person.getAge() < 23) {
				price = 1.2 * this.ticketPrice;
			}else if (person.getAge() > 65) {
				price = 1.5 * this.ticketPrice;
			}else {
				price = this.ticketPrice;
			}				
		}else{
			if(person.getAge() < 23) {
				price = 1.5 * this.ticketPrice;
			}else if (person.getAge() > 65) {
				throw new NoSeatsAvailableException("You are not allowed to travel");
			}else {
				price = this.ticketPrice;
			}
		}	
		
		return price;
	}

	public int getTotalNumberSeats() {
		return totalNumberSeats;
	}

	public void setTotalNumberSeats(int totalNumberSeats) {
		this.totalNumberSeats = totalNumberSeats;
	}

	public int getNormalSeats() {
		return normalSeats;
	}

	public void setNormalSeats(int normalSeats) {
		this.normalSeats = normalSeats;
	}

	public int getEssentialProfessionsSeats() {
		return essentialProfessionsSeats;
	}

	public void setEssentialProfessionsSeats(int essentialProfessionsSeats) {
		this.essentialProfessionsSeats = essentialProfessionsSeats;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
			
}
