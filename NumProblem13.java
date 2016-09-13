/**
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？ 
 * @author xudan
 *
 */
public class NumProblem13 {

	public static void main(String[] args) {
		for(int i = -100;; i++){
			if(isPerfectSquare(i + 100)&&isPerfectSquare(i + 168)){
				System.out.println("The number is " + i);
			}
		}
	}
	
	public static boolean isPerfectSquare(int n){
		for(int i = 1; i <= n; i++){
			if(i * i == n){
				return true;
			}
		}
		return false;
	}
}
运行结果：
The number is 156
