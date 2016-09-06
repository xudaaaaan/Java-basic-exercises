/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * @author xudan
 *
 */
public class Gcd_Lcm {

	public static void main(String[] args) {
		int[][] testCases = {{3,6},{4,7},{45,67},{56,78},{100,320}};
		for(int i = 0; i < testCases.length; i++){
			System.out.println(testCases[i][0] + " " + testCases[i][1] + " : " + "greatest commom divisor : " + 
		gcd(testCases[i][0],testCases[i][1]) + "  least commom multiple : " + lcm(testCases[i][0],testCases[i][1]));	
		}
		

	}
	
	public static int gcd(int m, int n){
		int i = m < n ? m : n ;
		for(;m % i != 0 || n % i != 0 ; i--){}
		return i;	
	}
	
	public static int lcm(int m, int n){
		int j = m > n ? m : n;
		for(;j % m != 0 || j % n != 0;j++){}
		return j;
	}

}
