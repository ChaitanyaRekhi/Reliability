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

		String[][] Data = {{"1", "1", "1", "1"}, {"2", "1", "2", "1"}, {"A", "3", "1", "0"}, {"B", "3", "1.1", "0"}, {"3", "3.1", "1.1", "1"}, {"4", "3.2", "1.1", "1"}, {"5", "3.1", "1.2", "1"}}; 
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

		int maxLevelCount = 1;
		for(int i=0; i<Data.length; i++){

			int j = 0; char charInFocus;
			int levelCount = 1;

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

		for(int i = 0; i<Data.length; i++){
			for(int j = 0; j<maxLevelCount; j++){

				String subStringInFocus;		


			}

		}

		return intSAdd; 

	}



}
