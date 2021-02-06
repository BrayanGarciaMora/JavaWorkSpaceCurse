package bookPoo;

public class Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursividad obje = new Recursividad();

		System.out.println(obje.factorial(5));
		System.out.println(obje.factorial(1,5));
		System.out.println(obje.de(4));
	}

	public long factorial(long n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);

		}

	}

	public long factorial(long n, int a) {
		return (n == 1) ? 1 : n * factorial(n - 1);
	}
	
	
	public String de(int a) {
		return (a==1)? "hola": "adios";
	}
}
