/**
 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60������
����C��ʾ��
 * @author xudan
 *
 */
public class Grade {

	public static void main(String[] args) {
		double[] testCases = {78,89.5,97.8,60.1,58.9,21,0,100,-21,108};
		for(int i = 0; i < testCases.length; i++){
			System.out.println("grade:" + testCases[i] + "  " + classify(testCases[i]));
			
		}
		

	}
	
	public static String classify(double n){
		String gra;
		if(n > 100 || n < 0)
			gra = "error!";
		else if(n >= 90)
			gra = "A";
		else if(n >= 60)
			gra = "B";
		else
			gra = "C";
		
		return gra;
		
			
	}

}
