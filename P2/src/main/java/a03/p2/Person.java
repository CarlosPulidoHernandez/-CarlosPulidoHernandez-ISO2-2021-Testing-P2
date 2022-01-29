package a03.p2;

public class Person {
	
	private final int age;
	private final boolean essentProf;
	private final boolean covidPass;
	private final boolean ill;
	
	public Person(final int age, final boolean essentProf, final boolean covidPass, final boolean ill) {
		this.age = age;
		this.essentProf = essentProf;
		this.covidPass = covidPass;
		this.ill = ill;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isEssentialProfession() {
		return essentProf;
	}

	public boolean isCOVIDPassport() {
		return covidPass;
	}

	public boolean isIll() {
		return ill;
	}
	
}
