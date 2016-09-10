/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
少米？第10次反弹多高？ 
 * @author xudan
 * @param: i:表示第i+1次落地；h表示每次落地后反弹起来的高度； s代表第十次落地时总共经过的距离。
 */


public class Bounce {

	public static void main(String[] args) {
		double h = 50;
		double s = 100;
		for(int i = 1; i < 10; i++){
			s += h * 2;
			h /= 2;
	
		}
		System.out.println("第十次反弹" + h + "米高。");
		System.out.println("第十次落地后总共经过了" + s + "米。");

	}

}
