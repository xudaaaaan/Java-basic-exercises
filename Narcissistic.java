/**
 * ��ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
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
		if( n == (sin * sin * sin + ten * ten * ten + hun * hun * hun)){
			return true;
		}else{
			return false;
		}
			
	}

}
