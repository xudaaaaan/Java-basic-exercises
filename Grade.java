/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
的用C表示。
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

运行结果：
grade:78.0  B
grade:89.5  B
grade:97.8  A
grade:60.1  B
grade:58.9  C
grade:21.0  C
grade:0.0  C
grade:100.0  A
grade:-21.0  error!
grade:108.0  error!

