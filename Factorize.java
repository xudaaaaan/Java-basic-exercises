
/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * @author xudan
 *
 */
public class Factorize {

	public static void main(String[] args) {
		 int[] testCases = {2,5,9,18,58,88};
		 for(int i = 0; i < testCases.length; i++){
			 factorize(testCases[i]);
		 }

	}
	
	public static void factorize(int n){
		System.out.print(n + "=");
		for(int i = 2; i <= n; i ++){
			if(isPrime(i)){
				if(i == n){
					System.out.print(i);
				}else{
					if(n % i == 0){
						System.out.print(i + "*");
						n /= i;
						i--;
					}
				}	
			}
		}
		System.out.println();
		
		
	}
	
	public static boolean isPrime(int n){
		if(n == 1) 
			return false;
		else if(n == 2 || n == 3)
			return true;
		else {
			 for(int i = 2; i < n; i++){
				 if(n % i == 0){
					 return false;
				 }
			 }
			 return true;
			
		}
		
		
		
	}

}
