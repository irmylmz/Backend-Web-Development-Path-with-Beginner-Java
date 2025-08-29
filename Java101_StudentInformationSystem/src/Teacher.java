
public class Teacher {
	String name;
	String mpnm;
	String branch;
	
	public Teacher(String name, String mpnm, String branch) {
		this.name = name;
		this.branch = branch;
		this.mpnm = mpnm;
	}
	
	void print() {
		System.out.println("Adı: " + this.name);
		System.out.println("Telefonu: " + this.mpnm);
		System.out.println("Bölümü: " + this.branch);
	}
	
}
