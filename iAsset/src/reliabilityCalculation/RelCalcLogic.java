package reliabilityCalculation;

import java.util.HashSet;
import java.util.Set;

public class RelCalcLogic {

	Set<Integer> toBeFilledSet = new HashSet<Integer>();
	Set<Integer> sameLevelSet = new HashSet<Integer>();
	Set<Integer> probabaleParallelSet = new HashSet<Integer>();
	Set<Integer> focusParallelSet = new HashSet<Integer>();
	Set<Integer> probabaleSeriesSet = new HashSet<Integer>();
	Set<Integer> focusSeriesSet = new HashSet<Integer>();

	SysLvlRelCalc SLRCObject = new SysLvlRelCalc();

	public void Logic(StringToArray Object){
		int index=1;
		while(index<=Object.NoOfRows){
			if(Object.intIsLMA[index-1]==0 && Object.intPAdd[index-1][Object.maxLevelCount-1]!=0){
				toBeFilledSet.add(index);
			}
			index++;
		}

		int index1=1;
		while(index1<=Object.NoOfRows){
			if(Object.intPAdd[index1-1][Object.maxLevelCount-1]!=0&& toBeFilledSet.contains(index1)==false){
				sameLevelSet.add(index1);
			}
			index1++;
		}

		System.out.println("Set Thory: "+toBeFilledSet+" | "+sameLevelSet+" | "+focusSeriesSet);
		for(int l=0; l<10; l++){
			System.out.println((l+1)+" | "+Object.intIsLMA[l]+" | "+Object.intrRel[l]);
		}




		for(int i: toBeFilledSet){
			int a=0, b=0;
			for(int j: sameLevelSet){
				for(int k = 0; k < Object.maxLevelCount; k++){

					if(Object.intSAdd[i-1][k] != 0 && Object.intSAdd[j-1][k] != Object.intSAdd[i-1][k]) a=1;
					if(Object.intPAdd[i-1][k] != 0 && Object.intPAdd[j-1][k] != Object.intPAdd[i-1][k]) b=1;

				}
				if(a==0 && b==0){
					focusSeriesSet.add(j);
				}a=0; b=0;
			}

			double[] relsInFocus = new double[focusSeriesSet.size()];
			int count=0;

			for(int v: focusSeriesSet){
				relsInFocus[count]= Object.intrRel[v-1];
				count++;
			}

			Object.intrRel[i-1] = SLRCObject.calcInSeries(relsInFocus);
			Object.intIsLMA[i-1]=1;

			System.out.println("Set Thory: "+toBeFilledSet+" | "+sameLevelSet+" | "+focusSeriesSet);
			for(int l=0; l<10; l++){
				System.out.println((l+1)+" | "+Object.intIsLMA[l]+" | "+Object.intrRel[l]);
				
			focusSeriesSet.removeAll(focusSeriesSet);
			
			
			}
		}





	}
}