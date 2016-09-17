package reliabilityCalculation;

public class Main {

	public static void main(String[] args) {
		
		StringToArray StrToArrObject = new StringToArray();
		String[][] Data = StrToArrObject.getData();
		StrToArrObject.printData(Data);
		System.out.println("------------------------S Address----------------");
//		StrToArrObject.getIntSAdd(Data);
		System.out.println("------------------------P Address----------------");
//		StrToArrObject.getIntPAdd(Data);

		CompRelFromEtaBeta CRObject = new CompRelFromEtaBeta();
		double[] compRel = CRObject.calculateRelaibility(StrToArrObject.getDoubleEta(Data), StrToArrObject.getDoubleBeta(Data), 5000);
		
		for(int i=0; i<7; i++){
		System.out.println(compRel[i]);
		}
	}

}
