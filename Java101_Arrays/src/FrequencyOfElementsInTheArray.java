

public class FrequencyOfElementsInTheArray {

	public static void main(String[] args) {
		int[] list = {23, 67, 81, 23, 12, 81, 23};
        int[] fre = new int[list.length];
        boolean[] visited = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            if (visited[i]) continue; // zaten sayıldıysa atla

            int count = 1; // kendisi
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    visited[j] = true; // tekrar eden elemanı işaretle
                }
            }
            fre[i] = count;
        }

		
		for(int x = 0; x < list.length; x++) {
			if(fre[x] != 0) {
				System.out.println(list[x] + ", " + fre[x] + " kere tekrar ett.");
			}
			
		}

		
	}

}
