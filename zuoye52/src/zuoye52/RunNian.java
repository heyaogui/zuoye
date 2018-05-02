package zuoye52;

public class RunNian {

	public static void main(String[] args) {
		int year = 2008;
		if (year % 400 == 0 || year % 4 == 0) {
			System.out.println("是闰年");
		} else if (year % 100 != 0) {
			System.out.println("不是闰年");
		}
	}

}
