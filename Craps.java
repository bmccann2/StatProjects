
public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDie die1= new MultiDie(6);
		MultiDie die2= new MultiDie(6);
		
		int count=0, sum, point=0, lossSum=0;
		boolean win=false, loss=false;
		final int games=100;
		double avg, winSum=0;
		
		
		for(int i=0; i<games; i++){
		count=0;
		win=false;
		loss=false;
			while(!win && !loss){
			die1.roll();
			die2.roll();
			sum= die1.getFaceValue()+die2.getFaceValue();
			
			count++;
				if(count==1){
					if(sum==7 || sum==11){
						win=true;
						winSum++;
					}	
					else if(sum== 2 || sum==3 || sum==12){
						loss= true;
						lossSum++;
					}	
					else
						point= sum;
				}
				else if(count>1){
					if(sum==7){
						loss= true;
						lossSum++;
					}	
					else if(sum== point){
						win=true;
						winSum++;
					}	
				}
		}
		}
	System.out.println("Wins: "+winSum+" Losses: "+lossSum);
	avg= (winSum/games)*100;
	System.out.println("Out of "+games+" games you have a %"+avg+" of winning");
		
	}

}
