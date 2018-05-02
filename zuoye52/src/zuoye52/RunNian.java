package zuoye52;
import java.util.Scanner;
public class RunNian {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		System.out.println("请输入目前的年份:  ");
		int year = scanner.nextInt();
		if (year % 400 == 0 || year % 4 == 0) {
			System.out.println("是闰年");
		} else if (year % 100 != 0) {
			System.out.println("不是闰年");
		}
	}

}
