package programmingbasic;

public class Looping6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Looping6 obj=new Looping6();
//obj.decimal_to_binary();
//obj.binary_to_decimal();
obj.fibonacci_series1();
obj.fibonacci_series();
}

private void fibonacci_series1() {
		// TODO Auto-generated method stub
		int first=0,second=1;
		while(first<=13) {
			System.out.println(first);
			second = first+second;
			first=second-first;
		}
	}


private void fibonacci_series() 
{ // TODO Auto-generated method stub 
	int first=0,second=1; 
	while(first<=24) { 
		int third=first+second;
        System.out.println(first); 
        first=second; second=third; 
        } 
	}
 

	private void binary_to_decimal() {
		// TODO Auto-generated method stub
		int cake =1000,decimal=0,power=0;
		while(cake>0) {
			int rem=cake%10;
			decimal=decimal+(rem*find_power(2,power));
			cake=cake/10;
		}
		System.out.println(decimal);
	}

	private int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int result=1;power=0;
		while(power<3) {
			result=result*base;
			power=power+1;
		}
		return result;
	}

	private void decimal_to_binary() {
		// TODO Auto-generated method stub
		int cake=8;
		String binary="";
		while(cake>0) {
			int rem=cake%2;
			binary=rem+binary;
			cake=cake/2;
		}
		System.out.println(binary);
	}
}




