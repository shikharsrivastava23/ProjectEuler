import java.io.*;

public class problem2{
	public static void main(String args[]){

		long a=0,b=1,c=0,sum=0;
		int flag=1;


		while(c<4000000){
			c = a+b;
			a=b;
			b=c;

			if(c%2==0)
				sum = sum+c;
		}

		System.out.println(sum);
	}
}