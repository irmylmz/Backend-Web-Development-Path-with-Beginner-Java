
public class FindingTranspose {

	public static void main(String[] args) {
		int[][] matris = {{9,6,3}, {2,4,8}};
		
		int[][] transpose = new int[matris[0].length][matris.length];
		
		for(int i=0; i<transpose.length; i++) {
			for(int j=0; j<transpose[0].length; j++) {
				transpose[i][j] = matris[j][i];
			}
		}
		

		for(int[] row : transpose) {
			for(int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
