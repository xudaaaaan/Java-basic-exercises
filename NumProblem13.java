/**
 * һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣� 
 * @author xuyao
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
