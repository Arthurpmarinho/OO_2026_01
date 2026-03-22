import java.util.Scanner;

public class calculo_numero {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
		int num_a = sc.nextInt();
		int num_b = sc.nextInt();
		int resultado = num_a + num_b;
		System.out.println(resultado);
		resultado = num_a - num_b;
		System.out.println(resultado);
		resultado = num_a*num_b;
		System.out.println(resultado);
		float c = (float)num_a/num_b;
		System.out.println(c);
		double d = Math.pow(num_a, num_b);
		System.out.println(d);
		}

	}

}
