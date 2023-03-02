package programmingbasic;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Looping lo = new Looping();
 // lo.print_reverse(12345);
 // lo.count_of_digits(12345);
  int result=lo.sum_of_digits(1234567);
  while(result>9)
  {
	  result=lo.sum_of_digits(result);
  }
	  System.out.println(result);
  
    int num=7179;
	int rev=lo.reverse_a_number(7179);
	if(rev==num) {
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
	}
		
	int reverse_a_number(int no) {
		// TODO Auto-generated method stub
		int sum=0;
		while(no>0) {
			sum=(sum*100)+(no%100);
			no=no/100;
			}
		return sum;
		//System.out.println(sum);
		}

	
	public int sum_of_digits(int plate) {
		// TODO Auto-generated method stub
		int sum=0;
		while(plate>0) {
		//System.out.println(plate%10);
		sum=sum+(plate%10);
		plate=plate / 10;
	}
		return sum;
	}

	private void print_reverse(int plate) {
		
		// TODO Auto-generated method stub
		while(plate>0) {
			System.out.println(plate%10);
		plate = plate/10;
		}
	}

	private void count_of_digits(int plate) {
		// TODO Auto-generated method stub
		int count=0;
		while(plate>0) {
		//System.out.println(plate%10);
		count=count+1;
		plate=plate / 10;
	}
		System.out.println("count of digits:"+ count);
	}

}
