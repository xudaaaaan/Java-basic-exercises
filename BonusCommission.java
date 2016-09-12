/**
 * 企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；利润高于10万元，低于20万
元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部
分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，高于60万元的部分，可
提成1.5%，高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？ 
 * @author xudan
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

运行结果：
Please enter the month profit: 30
The commission of profit is 2.25

