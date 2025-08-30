
public class Match {
	Fighter f1;
	Fighter f2;
	int maxWeight;
	int minWeight;
	
	Match(Fighter f1, Fighter f2, int maxWeight, int minWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	
	void run() {
		if(isCheck()) {
			
			if(isF1start()) {
				while(this.f1.health > 0 && this.f2.health > 0) {
					System.out.println("=== YENİ ROUND ===");
					this.f2.health = this.f1.hit(f2);
					if(isWin()) {
						break;
					}
					this.f1.health = this.f2.hit(f1);
					if(isWin()) {
						break;
					}
					System.out.println(this.f1.name + " SAĞLIK: " + this.f1.health);
					System.out.println(this.f2.name + " SAĞLIK: " + this.f2.health);
				}
				
			}else {
				while(this.f2.health > 0 && this.f1.health > 0) {
					System.out.println("=== YENİ ROUND ===");
					this.f1.health = this.f2.hit(f1);
					if(isWin()) {
						break;
					}
					this.f2.health = this.f1.hit(f2);
					if(isWin()) {
						break;
					}
					System.out.println(this.f2.name + " SAĞLIK: " + this.f2.health);
					System.out.println(this.f1.name + " SAĞLIK: " + this.f1.health);
				}
				
			}
				
			
		}else {
			System.out.println("Sporcuların skletleri uymuyor!");
		}
		
	}
	
	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	boolean isWin() {
		if(this.f1.health == 0) {
			System.out.println(this.f2.name + " kazandı.");
			return true;
		}
		if(this.f2.health == 0) {
			System.out.println(this.f1.name + " kazandı.");
			return true;
		}
		
		return false;
	}
	
	boolean isF1start() {
		double num = Math.random() * 2;
		if(num<1) {
			return true;
		}
		return false;
	}

}
