/**
 * һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.��� �ҳ�1000���ڵ�������
���� 
 * @author xudan
 *
 */
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Perfect numbers between 0 and 1000:");
		for(int n = 1; n <= 1000; n ++){
			if(isPerfect(n)){
				System.out.println(n);
			}
		}

	}
	
	public static boolean isPerfect(int n){
		int sum = 0;
		for(int i = 1; i < n; i ++){
			if(n % i == 0){
				sum += i;
			}
		}
		return sum == n;
		
	}

}
