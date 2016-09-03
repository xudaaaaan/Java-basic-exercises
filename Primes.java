/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 * @author xudan
 *
 */
public class Primes {

	public static void main(String[] args) {
		int i = 0;
		for(int n = 101 ; n <= 200; n++){
			if(isPrime(n)){
				i++;
				System.out.println( n);
			}
		}
		System.out.println("101-200之间一共有" + i + "个素数");

	}
	
	public static boolean isPrime(int n){
		for(int i = 2; i < n/2; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

}

运行结果：

101 
103 
107 
109 
113 
127 
131 
137 
139 
149 
151 
157 
163 
167 
173 
179 
181 
191 
193 
197 
199 
101-200之间一共有21个素数

