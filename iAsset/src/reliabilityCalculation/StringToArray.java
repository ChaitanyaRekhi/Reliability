package reliabilityCalculation;

public class StringToArray {

	int NoOfRows, NoOfColumns;

	//	String[] SysName = new String[NoOfRows];
	//	String[] StrSAdd = new String[NoOfRows];
	//	String[] StrPAdd = new String[NoOfRows];
	//		int[] IsLMA = new int[NoOfRows];

	public String[][] getData(){

		NoOfRows = 7;

		//		String[] SysName = {"1", "2", "A", "B", "3", "4", "5"};
		//		String[] StrSAdd = {"1", "2", "3", "3", "3.1", "3.2", "3.1"};
		//		String[] StrPAdd = {"1", "1", "1", "1.1", "1.1", "1.1", "1.2"};
		//		String[] IsLMA = {"1", "1", "0", "0", "1", "1", "1"};

		String[][] Data = {{"System", "0.", "0.", "0", "", ""}, {"1", "1.", "1.", "1", "10000", "2.5"}, {"2", "1.", "1.", "1", "10000", "2.5"}, {"A", "3.", "1.2.", "0", "", ""}, {"B", "3.", "1.1.", "0", "", ""}, {"3", "3.1.", "1.1.", "1", "10000", "2.5"}, {"4", "3.2.", "1.1.", "1", "10000", "2.5"}, {"5", "3.1.", "1.2.", "1", "10000", "2.5"}}; 
		return Data;
	}





	public void printData(String[][] Data){

		for(int i = 0 ; i<Data.length; i++){
			for(int j = 0 ; j<Data[0].length; j++){
				System.out.print(Data[i][j]+"\t\t");		
			}
			System.out.println();
		}
		//		System.out.println("Data.length: "+ Data.length);
		//		System.out.println("Data[0].length: "+ Data[0].length);
	}






	public int[][] getIntSAdd(String[][] Data){

		int maxLevelCount = 0;
		for(int i=0; i<Data.length; i++){

			int j = 0; char charInFocus;
			int levelCount = 0;

			charInFocus = Data[i][1].charAt(0);		//1 should be the position of series address in data; 2 should be the parallel address in data. 
			while(j<Data[i][1].length()){
				charInFocus = Data[i][1].charAt(j);
				if (charInFocus == '.'){
					levelCount++;
				}
				j++;
			}

			if(levelCount > maxLevelCount){
				maxLevelCount = levelCount;
			}
		}
		//		System.out.println("maxLevelCount: "+maxLevelCount);

		int[][] intSAdd = new int[Data.length][maxLevelCount];
		int startIndex, endIndex, j, k;

		for(int i = 0; i<Data.length; i++){

			startIndex=0;
			k=0; j=0;
			String subStringInFocus;

			while(k<Data[i][1].length()){

				if(Data[i][1].charAt(k)=='.'){
					endIndex=k;
					subStringInFocus = Data[i][1].substring(startIndex, endIndex);
					intSAdd[i][j] = Integer.parseInt(subStringInFocus);
					startIndex=k+1;
					j++;
				}
				k++;
			}
		}

		for(int i = 0 ; i<Data.length; i++){
			for(int n = 0 ; n<maxLevelCount; n++){
				System.out.print(intSAdd[i][n]+"\t");
			}
			System.out.println();
		}
		return intSAdd;
	}






	public int[][] getIntPAdd(String[][] Data){

		int maxLevelCount = 0;
		for(int i=0; i<Data.length; i++){

			int j = 0; char charInFocus;
			int levelCount = 0;

			charInFocus = Data[i][2].charAt(0);		//1 should be the position of series address in data; 2 should be the parallel address in data. 
			while(j<Data[i][2].length()){
				charInFocus = Data[i][2].charAt(j);
				if (charInFocus == '.'){
					levelCount++;
				}
				j++;
			}

			if(levelCount > maxLevelCount){
				maxLevelCount = levelCount;
			}
		}
		//		System.out.println("maxLevelCount: "+maxLevelCount);

		int[][] intPAdd = new int[Data.length][maxLevelCount];
		int startIndex, endIndex, j, k;

		for(int i = 0; i<Data.length; i++){

			startIndex=0;
			k=0; j=0;
			String subStringInFocus;

			while(k<Data[i][2].length()){

				if(Data[i][2].charAt(k)=='.'){
					endIndex=k;
					subStringInFocus = Data[i][2].substring(startIndex, endIndex);
					intPAdd[i][j] = Integer.parseInt(subStringInFocus);
					startIndex=k+1;
					j++;
				}
				k++;
			}
		}

		for(int i = 0 ; i<Data.length; i++){
			for(int n = 0 ; n<maxLevelCount; n++){
				System.out.print(intPAdd[i][n]+"\t");
			}
			System.out.println();
		}
		return intPAdd;
	}



	public int[] getIntIsLMA(String[][] Data){

		int[] intIsLMA = new int[Data.length];

		for(int i = 0; i<Data.length; i++){
			intIsLMA[i] = Integer.parseInt(Data[i][3]);				
		}
		return intIsLMA;
	}





	public double[] getDoubleEta(String[][] Data) {

		double[] doubleEta = new double[Data.length];

		for(int i = 0; i<Data.length; i++){
			if(Data[i][4].isEmpty()==false){
				doubleEta[i] = Double.parseDouble(Data[i][4]);
			}
		}
		return doubleEta;
	}





	public double[] getDoubleBeta(String[][] Data) {

		double[] doubleBeta = new double[Data.length];

		for(int i = 0; i<Data.length; i++){
			if(Data[i][5].isEmpty()==false){
				doubleBeta[i] = Double.parseDouble(Data[i][5]);				
			}
		}
		return doubleBeta;
	}

}