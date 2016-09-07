/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
 * @author xudan
 *
 */
public class Count {

	public static void main(String[] args) {
		String test = "Ff vkv, I nvr iejg 8594. TY jgl: jkdf jk? 90.";
		count(test);

	}
	
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
		
	}

}
