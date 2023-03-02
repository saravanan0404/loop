package programmingbasic;

public class Looping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Looping2 lop = new Looping2();
lop.print_1_10();

int no=5;
while(no>=1) {
int res=lop.find_fact(no);
System.out.println("factorial of " + no + " is:"+ res);
no=no-1;
}
int result=lop.add_first_n_number(10);
System.out.println("sum of n number is:"+result);

	}

	private void print_1_10() {
		// TODO Auto-generated method stub
		int no=1;
		while(no<=5) {
			System.out.println(no*(11-no));
			no=no+1;
		}
	}

	private int find_fact(int no) {
		// TODO Auto-generated method stub
		int fact=1;
		while(no>=1) {
			fact=fact*no;
			no=no-1;
		}
		return fact;
	}

	private int add_first_n_number(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		while(no>=1) {
			sum=sum+no;
			no=no-1;
		}
		return sum;
	}

}
