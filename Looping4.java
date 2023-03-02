package programmingbasic;

public class Looping4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Looping4 looping = new Looping4();
//looping.printing();
//looping.printingcount();
//looping.find_power();
//looping.lcm(3,10);
looping.lcm(4,9);
//looping.find_squre_root(81);
}	
	private void find_squre_root(int no) {
		// TODO Auto-generated method stub
		int divisor = 2;
		while(divisor<no) {
			if(no/divisor==divisor)
			{
			System.out.println("squre root of "+divisor);
		break;
		}
		divisor=divisor+1;
		}
		}
		
	private void lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big=no1>no2?no1:no2;
		while(true) {
			if(big%no1==0&&big%no2==0)
			{
				System.out.println("lcm is:"+ big);
			break;
			}
			big=big+1;
		}
	}






	int findpower(int base, int power) {
		// TODO Auto-generated method stub
		int result=1;
	    while(power>0) {
	    	result=result*base;
	    	power=power-1;
	    }
	    return result;
	}




	private void find_power() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=4) {
			System.out.print(no*no*no + " ");
			no=no+1;
		}
	}





	private void printingcount() {
		// TODO Auto-generated method stub
		int no=1,count=1;
		while(count<=5) {
			System.out.print(" "+no+" ");
			count=count+1;
			no=no*11;
		}
	}

	private void printing() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=121) {
			System.out.print(" "+no+" ");
			no=no*11;
		}
	}

}
