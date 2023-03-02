package programmingbasic;

public class Ifbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ifbasics ib = new Ifbasics();
         //ib.learn_if1();
        //ib.learn_if2();
	    ib.learn_if3();
	     //ib.learn_if4();
        //ib.learn_if5();
	}
	

	private void learn_if5() {
		// TODO Auto-generated method stub
		if(true)
		{
			System.out.println("Hi");
		}
	}


	private void learn_if4() {
		// TODO Auto-generated method stub
		int maths=90, science=95;
		if(maths==100)
		{
			if(science==100)
			{
				System.out.println("honda bike");
			}
			else 
			{
				System.out.println("Diary milk silk");
			}
		}
		else
		{
			if(science==100)
			{
				System.out.println("Biryani");
			}
			else
			{
				System.out.println("Watch");
			}
		}
	}


	private void learn_if3() {
		// TODO Auto-generated method stub
		int age1=20, age2=20;
		if(age1>age2)
		{
			System.out.println("elder brother is:"+ age1);
		}
		else if(age2>age1)
		{
			System.out.println("elder brother is:"+age2);
		}
		else 
		{
			System.out.println("both are same");
		}
	}


	private void learn_if2() {
		// TODO Auto-generated method stub
		int age1=20, age2=12;
		if(age1>age2)
		{
			System.out.println("elder brother is:"+ age1);
		}
		else if(age2>age1)
		{
			System.out.println("elder brother is:"+age2);
		}
	}

	private void learn_if1() {
		// TODO Auto-generated method stub
		int age1=10, age2=12;
		if(age1>age2)
		{
			System.out.println("elder brother is:"+ age1);
		}
		else
		{
			System.out.println("elder brother is:"+age2);
		}
	}

}
