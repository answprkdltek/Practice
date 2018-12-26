package ps;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int tc;
		for(tc = 1; tc <= T; tc++) {
			int down = Integer.parseInt(sc.nextLine());
			System.out.println("#" + tc);
			if(down == 1) {
				System.out.println(1);
			}
			else {
				int[][] num = new int[down][];
				for(int i = 0; i < down; i ++) {
					num[i] = new int[i+1];
				}
				num[0][0] = 1;
				for(int i = 0; i < num.length; i++) {
					for(int j = 0; j < num[i].length; j++) {
						if(j==0 || j==i)
							num[i][j] = 1;
						else
							num[i][j] = num[i-1][j-1] + num[i-1][j];
						System.out.print(num[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
