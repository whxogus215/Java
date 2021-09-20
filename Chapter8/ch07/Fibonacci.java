package ch07;

public class Fibonacci {
	
	int[] value;
	int number;
	
	public Fibonacci(int number)
	{
		this.number = number;
		value = new int[number];
	}
	public int fibonacciRecur(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacciRecur(n-1) + fibonacciRecur(n-2);
	}
	
	public int fibonacciIter(int n) {
		
		int ppre = 0;   // n = 0�� ��
		int pre = 1;    // n = 1�� ��
		int current = 0; // ���� ��
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		for (int i = 2; i <=n; i++) {
			
			current = ppre + pre;
			ppre = pre;
			pre = current;
		}
		return current;
	}
	
	// �޸������̼� : ������ ���� �����Ͽ� ����ϴ� ���α׷��� ���
	public int fibonacciMem(int n) {
		
		value[0] = 0;
		value[1] = 1;
		
		if (n==0) {
			return value[0];
		}
		
		if (n==1) {
			return value[1];
		}
		
		int i;
		for( i = 2; i<=n;i++) {
			value[i] = value[i-1] + value[i-2];
		}
		
		return value[i-1]; // i�� �ݺ������� ���� i = n+1�� �����Ƿ� n�� ����ϱ� ���ؼ� �ε����� i-1�̾�� �Ѵ�. 
	}
	
	
	

	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci(100);
		
		int result = fib.fibonacciRecur(10);
		System.out.println(result);
		
		result = fib.fibonacciIter(10);
		System.out.println(result);
		
		result = fib.fibonacciMem(10);
		System.out.println(result);
		
	}

}
