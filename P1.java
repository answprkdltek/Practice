package ps;

import java.util.Arrays;
import java.util.Scanner;


public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int tc;
		for(tc = 1; tc <= T; tc++) {
			String line = sc.nextLine();
			int[] tem = new int[10];
			for(int i = 0; i <= 9; i++) {
				if(line.substring(10-i, 20-(2*i)).contains(line.substring(0, 10-i))) {
					tem[i] = 10-i;
				}
			}
			Arrays.sort(tem);
			if(tem[9] == 10) {
				if(tem[8] == 5)
					System.out.println("#" + tc + " " + tem[8]);
				else if(tem[5] == 2)
					System.out.println("#" + tc + " " + tem[5]);
				else
					System.out.println("#" + tc + " " + tem[9]);
			}
			else if(tem[9] == 9) {
				if(tem[7] == 3)
					System.out.println("#" + tc + " " + tem[7]);
				else
					System.out.println("#" + tc + " " + tem[9]);
			}
			else if(tem[9] == 8) {
				if(tem[8] == 4)
					System.out.println("#" + tc + " " + tem[8]);
				else
					System.out.println("#" + tc + " " + tem[9]);
			}
			else
				System.out.println("#" + tc + " " + tem[9]);
		}
		sc.close();
	}
}