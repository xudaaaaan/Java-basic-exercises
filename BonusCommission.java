/**
 * ��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%���������10��Ԫ������20��
Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ�
�֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��60��100��֮��ʱ������60��Ԫ�Ĳ��֣���
���1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž��������� 
 * @author xuyao
 *
 */
import java.util.Scanner;

public class BonusCommission {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the month profit: ");
		double profit = input.nextDouble();
		System.out.println("The commission of profit is " + commission(profit) );
		input.close();
	
	}
	
	public static double commission(double p){
		double c;
		if(p <= 10){
			c = p * 0.1;
		}
		else if(p <= 20){
			c = 10 * 0.1 + (p - 10) * 0.075;
		}
		else if(p <= 40){
			c = 10 * 0.1 + 10 * 0.075 + (p - 20) * 0.05;
		}
		else if(p <= 60){
			c = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (p - 40) * 0.03;
		}
		else if(p <= 100){
			c = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (p - 60) * 0.015;
		}
		else{
			c = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (p - 100) * 0.01;
		}
		return c;
		
	}

}
