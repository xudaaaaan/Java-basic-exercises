/**
 * �ж�101-200֮���ж��ٸ����������������������
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
		System.out.println("101-200֮��һ����" + i + "������");

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
