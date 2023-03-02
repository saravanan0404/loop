package programmingbasic;

public class Looping3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping3 loopingobj=new Looping3();
		loopingobj.Greater_common_divisor(100,60);
	}

	private void Greater_common_divisor(int no1, int no2) {
		// TODO Auto-generated method stub
		int divisor=2;
		int gcd=0;boolean first=true;
		int small=no1<no2?no1:no2;
		while(divisor<=small) {
			if(no1%divisor==0 && no2%divisor==0)
			{
				if(first==true)
				{
					System.out.println("lcd "+ divisor );
					divisor=divisor+1;
					first = false;
					continue;
				}
				System.out.println(divisor);
			gcd=divisor;
			}
			divisor=divisor+1;
		}
		System.out.println("gcd is "+ gcd);
	}
}
