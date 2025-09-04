import java.util.Scanner;

public class MineSweeper {
	Scanner sc = new Scanner(System.in);
	int rowNum, colNum;
	String[][] gameBoard;
	boolean isWin = false;
	
	public MineSweeper(int rowNum, int colNum) {
		if(colNum<2 && rowNum<2) {
			System.out.println("Uygun Satır ve Sütun sayısı giriniz.");
		}
		this.colNum = colNum;
		this.rowNum = rowNum;
		gameBoard = new String[rowNum][colNum];
	}
	
	
	public String[][] createBoard(String[][] arr) {
		int k = (rowNum * colNum) / 4;
		int count = 0;
		
		while(count <= k) {
			int x = (int)(Math.random() * rowNum);
			int y = (int)(Math.random() * colNum);
			
			if (!"*".equals(arr[x][y])) {
                arr[x][y] = " * ";
                count++;
            }
		}
		return arr;
	}
	
	public String[][] fillBoard(String[][] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = " - ";
			}
		}
		return arr;
	}
	
	public void printMatris(String[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean isLose(String[][] arr, int x, int y) {
	    if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length) {
	        return false;
	    }
	    return " * ".equals(arr[x][y]);
	}
	
	public String[][] replaceChar(String[][] mines, String[][] view, int x, int y) {
	    if (x < 0 || x >= rowNum || y < 0 || y >= colNum) return view; // koruma
	    if (!isLose(mines, x, y)) {
	        view[x][y] = countSide(mines, x, y);
	    }
	    return view;
	}
	
	public String countSide(String[][] arr, int x, int y) {
	    int count = 0;
	    for (int i = x - 1; i <= x + 1; i++) {
	        for (int j = y - 1; j <= y + 1; j++) {
	            if (i < 0 || i >= rowNum || j < 0 || j >= colNum) continue; // sınır kontrolü
	            if (" * ".equals(arr[i][j])) count++;                       // arr[i][j] !
	        }
	    }
	    return " " + count + " ";
	}
	
	public boolean isVisited(String[][] view, int x, int y) {
	    return !" - ".equals(view[x][y]); 
	}
	
	public boolean isWin(String[][] mines, String[][] view) {
	    for (int i = 0; i < rowNum; i++) {
	        for (int j = 0; j < colNum; j++) {
	            if (!" * ".equals(mines[i][j]) && " - ".equals(view[i][j])) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public void run() {
	    System.out.println("Mayın Tarlasına Hoşgeldiniz!");

	    String[][] board = new String[rowNum][colNum];
	    fillBoard(board);

	    String[][] hiddenboard = new String[rowNum][colNum];
	    fillBoard(hiddenboard);
	    createBoard(hiddenboard);
	    /*
	    printMatris(hiddenboard);
	    System.out.println("========================");
	     */
	    printMatris(board);
	    
	    int x, y;
	    while (true) {
	        System.out.print("Bir satır değeri girin (0-" + (rowNum - 1) + "): ");
	        x = sc.nextInt();
	        System.out.print("Bir sütun değeri girin (0-" + (colNum - 1) + "): ");
	        y = sc.nextInt();

	        if (x < 0 || x >= rowNum || y < 0 || y >= colNum) {
	        	System.out.println();
	            System.out.println("Geçersiz koordinat! Tekrar deneyin.");
	            continue;
	        }

	        if (isLose(hiddenboard, x, y)) {
	        	System.out.println();
	            System.out.println("Mayına bastın! Oyun bitti.");
	            printMatris(hiddenboard);
	            break;
	        }
	        
	        if(isVisited(board, x, y)) {
	        	System.out.println();
	        	System.out.println("Girdiğiniz değerler daha önce girilmiştir, tekrar deneyin. ");
	            continue;
	        }

	        replaceChar(hiddenboard, board, x, y);

	        printMatris(board);
	        
	        if (isWin(hiddenboard, board)) {
	            System.out.println("Tebrikler, tüm mayınsız hücreleri açtın! Kazandın!");
	            break;
	        }

	    }
	}
	
	
	
	

}
