題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？


package com.xudan;

public class Rabbit {

	public static void main(String[] args) {
		int[] testCase = {1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i = 0; i < testCase.length; i ++){
			System.out.println("第" + testCase[i] +"个月有兔子： " + rabbit(testCase[i]) + "对，兔子总数为：" + 2*rabbit(testCase[i]));
		}

	}
	
	public static int rabbit(int n){
		int[] rb = new int[n+1];
		rb[0] = 0; 
		rb[1] = 1;
		for(int i = 2; i <= n; i++){
			rb[i] = rb[i-1] + rb[i-2];
		}
		return rb[n];
	}

}
