import java.util.Random;
public class Bonus3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int die1, die2, sumPrev, sumCurr, rolls, sum=0, p1=0, p2=0;
		Random ran= new Random();
		final int trials=100000;
		boolean win1, win2;
		
		for(int i=0; i<trials; i++){
			win1=false;
			rolls=0;
			sumPrev=0;
			do{
				die1= ran.nextInt(6)+1;
				die2= ran.nextInt(6)+1;
				sumCurr= die1+die2;
				if((sumCurr==7)&&(sumPrev==7))
					win1=true;
				sumPrev= sumCurr;
				rolls++;
			} while (!win1);
			
			sum+= rolls;
			
		}
		System.out.println("It takes an average of "+(double)sum/trials+" rolls in order for player 1 to win");
		sum=0;
		for(int i=0; i<trials; i++){
			win2=false;
			rolls=0;
			sumPrev=0;
			do{
				die1= ran.nextInt(6)+1;
				die2= ran.nextInt(6)+1;
				sumCurr= die1+die2;
				if((sumCurr==7)&&(sumPrev==8))
					win2=true;
				sumPrev= sumCurr;
				rolls++;
			} while (!win2);
			
			sum+= rolls;
			
		}
		System.out.println("It takes an average of "+(double)sum/trials+" rolls in order for player 2 to win");
		
		for(int i=0; i<trials; i++){
			win1=false;
			win2=false;
			rolls=0;
			sumPrev=0;
			
		do{
		die1= ran.nextInt(6)+1;
		die2= ran.nextInt(6)+1;
		sumCurr= die1+die2;
		if((sumCurr==7)&&(sumPrev==7))
			win1=true;
		if((sumCurr==7)&&(sumPrev==8))
			win2=true;
		sumPrev= sumCurr;		
		}while((!win1)&&(!win2));
			if(win1)
				p1++;
			if(win2)
				p2++;
			
		}
		System.out.println("Player 1 wins "+p1+" times and Player 2 wins "+p2+" times");
	}

}
