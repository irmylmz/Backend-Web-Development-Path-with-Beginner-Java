
public class ProgramtoFindTheAverageOfTheElementsInAnArray {

	public static void main(String[] args) {
		int[] list = {12, 25, 36, 48, 52};
		/*
		double sum = 0.0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}

		System.out.println("Average: " + (sum / list.length));
		
		*/
		
		//Harmonik 
		double sum = 0.0;
		
		for(int i : list) {
			if (i == 0) {
	            throw new IllegalArgumentException("Harmonik ortalama için elemanlar 0 olamaz.");
	        }
			sum += (1.0/i);
		}
		
		System.out.println("Harmonic Mean: " + (list.length/sum));
	}

}
