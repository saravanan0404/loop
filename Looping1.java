package programmingbasic;

public class Looping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Looping1 ll=new Looping1();
     //int no=153;
     //int no=9;
     //ll.reverse_no(153);
     int no=5;
     while(no>0) {
   int result = ll.find_power(2, no);
   System.out.println(result);
   no=no-1;
     }
   Looping lo=new Looping();
    //int result2=lo.sum_of_digits(result);
    //if(result2==no) {
    	System.out.println("neon");
    }
    //else 
    {
    	System.out.println("not neon");
    }
	

	void reverse_no(int no) {
		// TODO Auto-generated method stub
		int no2=no;
		int sum=0;
		while(no>0) {
		int rem=no%10;
		int r=find_power(rem,3);
		System.out.println(r);
		sum=sum+r;	
		no=no/10;
		System.out.println(sum);
		System.out.println(no);
		}
		if(sum==no2) {
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}


	int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int result=1;
		while(power>0) {
			result=result*base;
			power=power-1;
			}
		return result;
	}

}
