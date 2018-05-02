package zuoye52;
import java.util.Scanner;
public class FenShu {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		System.out.println("请输入目前的成绩:  ");
		int score = scanner.nextInt();
		if(score>=90) {
			System.out.println("优秀");
		}
			else if(score>=80) {
				System.out.println("良好");
			}
			else if(score>=70) {
				System.out.println("中等");
			}
			else {    
	            System.out.println("差");
	        }
	}

}
