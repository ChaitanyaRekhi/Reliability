package reliabilityCalculation;

public class Main {

	public static void main(String[] args) {
		
		StringToArray StrToArrObject = new StringToArray();
		String[][] Data = StrToArrObject.getData();
//		StrToArrObject.printData(Data);
//		System.out.println("------------------------S Address----------------");
		StrToArrObject.getIntSAdd(Data);
//		System.out.println("------------------------P Address----------------");
		StrToArrObject.getIntPAdd(Data);
		StrToArrObject.getIntIsLMA(Data);
		StrToArrObject.getDoubleEta(Data);
		StrToArrObject.getDoubleBeta(Data);
		StrToArrObject.calculateRelaibility(StrToArrObject.getDoubleEta(Data), StrToArrObject.getDoubleBeta(Data), StrToArrObject.getIntIsLMA(Data), 5000);
		
		
		RelCalcLogic RCLObject = new RelCalcLogic();
		RCLObject.Logic(StrToArrObject);
		
		
	}

}
