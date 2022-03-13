package Assignment1;

public class question1 {
	public static void main(String[] args) {
		System.out.println("the first 20 Fibonacci numbers are:");
		int f1=1;
		int f2=1;
		double sum1=0;
		System.out.print(f1+" "+f2);
		for(int i=2;i<20;i++) {
			int f3=f1+f2;
			sum1+=f3;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
		System.out.println(" ");
		System.out.println("The Average is"+(sum1/20));
	}

}
