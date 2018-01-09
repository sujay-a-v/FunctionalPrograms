package Sudeep;

public class Primes {

	public static void main(String[] args) {
		System.out.println(2);
		System.out.println(3);
		System.out.println(5);
		System.out.println(7);
		outer:for(int i=11;i<=1000;i+=2)
		{
			for(int j=3;j<i/2;j+=2)
			{
				if((i%j)==0) continue outer;
			}
		System.out.println(i);	
		}
	}
}
