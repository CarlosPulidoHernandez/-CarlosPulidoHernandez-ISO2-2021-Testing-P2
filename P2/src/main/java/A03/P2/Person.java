package A03.P2;

public class Person {
	
	private int age;
	private boolean essentialProfession;
	private boolean COVIDPassport;
	private boolean ill;
	
	public Person(int age, boolean essentialProfession, boolean COVIDPassport, boolean ill) {
		this.age = age;
		this.essentialProfession = essentialProfession;
		this.COVIDPassport = COVIDPassport;
		this.ill = ill;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isEssentialProfession() {
		return essentialProfession;
	}

	public boolean isCOVIDPassport() {
		return COVIDPassport;
	}

	public boolean isIll() {
		return ill;
	}
	
}
