/**
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ����������
���ף���10�η�����ߣ� 
 * @author xudan
 * @param: i:��ʾ��i+1����أ�h��ʾÿ����غ󷴵������ĸ߶ȣ� s�����ʮ�����ʱ�ܹ������ľ��롣
 */


public class Bounce {

	public static void main(String[] args) {
		double h = 50;
		double s = 100;
		for(int i = 1; i < 10; i++){
			s += h * 2;
			h /= 2;
	
		}
		System.out.println("��ʮ�η���" + h + "�׸ߡ�");
		System.out.println("��ʮ����غ��ܹ�������" + s + "�ס�");

	}

}
