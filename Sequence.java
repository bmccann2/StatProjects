
public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDie coin= new MultiDie(2);
		int count=0, sequence=0;
		boolean found=false;
		
		for(int i= 0; i<=1000000; i++){
			coin.roll();
			
			if(!found){
				if((sequence==0)&&(coin.getFaceValue()==1))
					sequence=1;
				
				else if((sequence==1)&&(coin.getFaceValue()==2))
					sequence=2;
				else if((sequence==1)&&(coin.getFaceValue()==1))
					sequence=0;
				
				else if((sequence==2)&&(coin.getFaceValue()==2))
					sequence=0;
				else if((sequence==2)&&(coin.getFaceValue()==1))
					found=true;
				count++;
			}
		}
		if(found)
		System.out.println("It took "+count+" flips to reach the HTH sequence");
	
		found=false;
		count=0;
		sequence=0;
		for(int i= 0; i<=1000000; i++){
			coin.roll();
			
			if(!found){
				if((sequence==0)&&(coin.getFaceValue()==1))
					sequence=1;
				
				else if((sequence==1)&&(coin.getFaceValue()==2))
					sequence=2;
				else if((sequence==1)&&(coin.getFaceValue()==1))
					sequence=0;
				
				else if((sequence==2)&&(coin.getFaceValue()==1))
					sequence=0;
				else if((sequence==2)&&(coin.getFaceValue()==2))
					found=true;
				count++;
			}
		}
		if(found)
		System.out.println("It took "+count+" flips to reach the HTT sequence");
	}

}
