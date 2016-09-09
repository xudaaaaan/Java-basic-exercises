import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
几个数相加有键盘控制。 
 * @author xudan
 *
 */


public class Project8 {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		try{
			System.out.print("Please enter a: ");
			int a = scan1.nextInt();
			System.out.print("Please enter n: ");
			int n = scan1.nextInt();
			System.out.println(addFun(a,n));
		}finally{
			scan1.close();
		}	
	}
	
	public static int addFun(int a, int n){
		int sum = 0;
		for(int i = n; i > 0 ; i -- ){
			sum += (int) (a * Math.pow(10,n - i) * i);
		}
		return sum;	
	}

}

运行结果：
Please enter a: 5
Please enter n: 3
615
