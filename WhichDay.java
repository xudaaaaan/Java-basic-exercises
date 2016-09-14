/**
 * 输入某年某月某日，判断这一天是这一年的第几天？ 
 * @author xudan
 *
 */
import java.util.Scanner;
public class WhichDay {

	public static void main(String[] args) {
		System.out.println("Please enter year, month, date in order: ");
		Scanner input = new Scanner(System.in);

		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		input.close();
		System.out.println(year + "." + month + "." + day + " is the " + whichDay(year,month,day) + "th day of this year.");
		
	}
	
	/**
	 * 判断是否为闰年
	 * @param y
	 * @return
	 */
	public static boolean isLeapYear(int y){
		return((y % 4 == 0 && y % 100 != 0)||(y % 400 == 0));
	}
	
	/**
	 * 判断一个日期是一年中的第几天
	 * @param d
	 * @return
	 */
	public static int whichDay(int y, int m, int d){
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(isLeapYear(y)){
			months[1] = 29;
		}
		int n = 0;
		for(int i = 0; i < m-1; i++){
			n += months[i];
		}
		return n + d;
	}
}
运行结果：
Please enter year, month, date in order:
2013 4 17
2013.4.17 is the 107th day of this year.

