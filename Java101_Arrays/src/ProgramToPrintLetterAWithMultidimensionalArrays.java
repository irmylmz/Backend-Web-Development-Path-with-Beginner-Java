public class ProgramToPrintLetterAWithMultidimensionalArrays {

	public static void main(String[] args) {
		String[][] letterB = new String[6][4];
		
		for(int i=0; i < letterB.length; i++) {
			for(int j=0; j < letterB[i].length; j++) {
				letterB[i][j] = " ";
				
				if(i == 0 || i == 2 || i == 5) {
					if(j==0 || j==1 || j== 2) {
						letterB[i][j] = "*";
					}
				}else if (i == 1 || i == 3 || i == 4) {
					if (j==0 || j==3) {
						letterB[i][j] = "*";
					}
				}
				
				
			}
		}
		
		for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
		
		
		String[][] letterJ = new String[6][5];
	
		for(int i=0; i < letterJ.length; i++) {
			for(int j=0; j < letterJ[i].length; j++) {
				letterJ[i][j] = " ";
				if(i==1) {
					letterJ[i][j] = "*";
				}else if (i == 1 || i == 2 || i == 3 || i == 4) {
					if (j==3) {
						letterJ[i][j] = "*";
					}
					
				}else if (i == 5) {
					if(j==1 || j==2) {
						letterJ[i][j] = "*";
					}
				}
				if (i == 4 && j == 0) {
					letterJ[i][j] = "*";
				}
				
				
			}
		}
		
		for (String[] row : letterJ){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
		
		System.out.println();
		
		
		String[][] letterK = new String[6][4];
		
		for(int i=0; i < letterK.length; i++) {
			for(int j=0; j < letterK[i].length; j++) {
				letterK[i][j] = " ";
				if (j==0) {
					letterK[i][j] = "*";
				}
				if(i==0 || i==4 || i==5) {
					if(j==3) {
						letterK[i][j] = "*";
					}
				}else if (i==1 || i==3) {
					if(j==2) {
						letterK[i][j] = "*";
					}
				}else if (i==2) {
					if(j==0 || j==1) {
						letterK[i][j] = "*";
					}
					
				}	
				
			}
		}

		for (String[] row : letterK){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

	}

}
