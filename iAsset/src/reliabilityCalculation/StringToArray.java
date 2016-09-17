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
				System.out.print(Data[i][j]+"\t");		
			}
			System.out.println();
		}
	}

	public int[][] getIntSAdd(String[][] Data){
		
		int noOfLevels = 2;
		int[][] intSAdd = new int[Data[0].length][noOfLevels];
		
		
		
		
		
		return intSAdd; 
		
	}
	


}
