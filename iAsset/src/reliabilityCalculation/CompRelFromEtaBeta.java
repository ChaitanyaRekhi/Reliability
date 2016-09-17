package reliabilityCalculation;

public class CompRelFromEtaBeta {

	public double calculateRelaibility(double eta, double beta, double time){

		double rel;
		rel = Math.pow(Math.E, (-1)*(Math.pow((time/eta), beta)));
		return rel;

	}

}
