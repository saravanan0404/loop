package programmingbasic;

public class Looping5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Looping5 loopingobj= new Looping5();
//loopingobj.printing1_100();
//loopingobj.print();
int no=1;
loopingobj.primenumber(no);

 //int no=10;
 while(no>=1) {
	 int result=loopingobj.Factorial(no);
 System.out.println(result);
 no=no-1;
 }
 

//Looping lo = new Looping();
//int rev=lo.reverse_a_number(456789);
//System.out.println(rev);
	}
	private int Factorial(int no) {
		// TODO Auto-generated method stub
	
		int fact=1;int sum = 0;
		while(no>=1) {
			fact=fact*no;
			sum=sum+fact;
			no=no-1;
		}
		return fact;
	}
	private void primenumber(int no) {
		// TODO Auto-generated method stub
		while(no<=20) {
		int div=2,count=0;
		while(div<no) {
			if(no%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		if(count==0) {
			System.out.println(no);
		}
		no=no+1;
		}
	}
	private void print() {
		// TODO Auto-generated method stub
		int no=1, pro=5;
		while(pro>0) {
			no=no*pro;
			System.out.print(no+" ");
			pro=pro-1;
		}
			
		}
	

	private void printing1_100() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=100) {
			int rem=no%10;
			if(rem==5) {
				System.out.println(no);
			}
			else if(no/10==5) {
				System.out.println(no);
			}
			no=no+1;
		}
	}

}
