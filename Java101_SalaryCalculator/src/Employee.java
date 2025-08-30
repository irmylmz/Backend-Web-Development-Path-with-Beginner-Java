
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(this.salary > 1000) {
			return (this.salary * 3)/100.0;
		}
		return 0;
	}
	
	int bonus() {
		if(this.workHours > 40) {
			return (workHours-40) * 30;
		}
		return 0;
	}
	
	double raiseSalary() {
		int time = 2021 - this.hireYear;
		if(time > 19) {
			return (this.salary*15)/100.0;
		}else if (time > 9 && time < 20) {
			return (this.salary*10)/100.0;
		}
		return (this.salary*5)/100.0;
	}
	
	double topSalary() {
		return (this.salary + this.bonus() - this.tax() + this.raiseSalary());
	}
	
	void printInfo() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı : " + this.hireYear);
		System.out.println("Vergi: " + this.tax());
		System.out.println("Maaş Artışı: " + this.bonus());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + this.bonus() - this.tax()));
		System.out.println("Toplam Maaş: " + this.topSalary());
	}

}
