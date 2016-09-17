package reliabilityCalculation;

public class CompRelFromEtaBeta {

	public double[] calculateRelaibility(double[] doubleEta, double[] doubleBeta, double time){

		double[] intrRel = new double[doubleEta.length];
		
		for(int i=0; i<doubleEta.length; i++){
		
			intrRel[i] = Math.pow(Math.E, (-1)*(Math.pow((time/doubleEta[i]), doubleBeta[i])));
		}
		
		return intrRel;

	}

}
