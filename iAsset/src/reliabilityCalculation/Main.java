package reliabilityCalculation;

public class Main {

	public static void main(String[] args) {
		
		StringToArray StrToArrObject = new StringToArray();
		String[][] Data = StrToArrObject.getData();
		StrToArrObject.printData(Data);
		System.out.println("------------------------S Address----------------");
		StrToArrObject.getIntSAdd(Data);
		System.out.println("------------------------P Address----------------");
		StrToArrObject.getIntPAdd(Data);

		CompRelFromEtaBeta CRObject = new CompRelFromEtaBeta();
		double[] compRel = CRObject.calculateRelaibility(StrToArrObject.getDoubleEta(Data), StrToArrObject.getDoubleBeta(Data), StrToArrObject.getIntIsLMA(Data), 5000);
		
//		for(int i=0; i<7; i++){
//		System.out.println(compRel[i]);
//		}
		
//		double[] relsInFocus = {0.5,0.5,0.5,0.5,0.5,0.5,0.5,0.5};
//		RelCalcLogic RelCalcLogicObject = new RelCalcLogic();
//		System.out.println("System Rel is: "+RelCalcLogicObject.calcInSeries(relsInFocus));
//		System.out.println("System Rel is: "+RelCalcLogicObject.calcInParallel(relsInFocus));
		
	}

}
