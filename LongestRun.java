
public class LongestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDie coin= new MultiDie(2);
		int maxrun=0, headrun=0, tailrun=0;
		
		for(int i=1; i<10000000; i=i*10){
		maxrun=0;
			for(int flips=0; flips<i; flips++){
			coin.roll();
			if(coin.getFaceValue()==1){
				headrun++;
				tailrun=0;
				if(headrun>maxrun)
					maxrun=headrun;
			}	
			if(coin.getFaceValue()==2){
				tailrun++;
				headrun=0;
				if(tailrun>maxrun)
					maxrun=tailrun;
			}	
			
			}
		System.out.println("The longest run of one side for "+i+" flips was "+maxrun);
		}	
	}

}
