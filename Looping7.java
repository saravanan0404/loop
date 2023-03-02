package programmingbasic;

public class Looping7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Looping7 objj=new Looping7();
//objj.multiples_4_5();
objj.swapping_no();

	}

	private void swapping_no() {
		// TODO Auto-generated method stub
		int no1=100,no2=400;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1+ " "+ no2);
	}

	private void multiples_4_5() {
		// TODO Auto-generated method stub
		int no=1, div=5,end=25;
		while(no<=end) {
			if(no%div==0) {
				System.out.println(no);
			}
			no=no+1;
			
		if(no==26) {
		   no=1;div=4;end=20;
		continue;
		}
	}
  }
}


