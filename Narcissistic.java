/**
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * @author xuyao
 *
 */
public class Narcissistic {

	public static void main(String[] args) {
		for(int n = 100; n <= 999; n ++){
			if(isNarcissistic(n)){
				System.out.println(n);
			}
		}
	}
	
	public static boolean isNarcissistic(int n){
		int hun = n / 100;
		int ten = (n - hun * 100) / 10;
		int sin = (n - hun * 100 - ten * 10);
		return n == (sin * sin * sin + ten * ten * ten + hun * hun * hun);
			
	}

}

运行结果：
153 
370 
371 
407 

