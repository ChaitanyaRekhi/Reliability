package reliabilityCalculation;

public class Main {

	public static void main(String[] args) {
		
//		CompRelFromEtaBeta CRObject = new CompRelFromEtaBeta();
//		double compRel = CRObject.calculateRelaibility(12000, 1.9, 5000);
//		System.out.println(compRel);
		
		StringToArray StrToArrObject = new StringToArray();
		String[][] Data = StrToArrObject.getData();
		StrToArrObject.printData(Data);
		StrToArrObject.getIntSAdd(Data);
	}

}
