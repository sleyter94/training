package training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FloatingRocks {
	
	static int MCD(int a , int b) {
		while(b!=0) {
			int t = b;
			b = a%b;
			a = t;
		}
		return a;
	}
	
	static int solve(int x1, int y1, int x2, int y2) {
		int sol = 0;
		if(x1 != x2) {
			if(y1 == y2) 
				return Math.abs(x1-x2)-1;
			int y3 = y2 - y1;
			int x3 = x2 - x1;
			int xy = MCD(Math.abs(x3),Math.abs(y3));
			y3 = y3 / xy;
			x3 = x3 / xy;
			if(x3>0) {
				if( Math.min(x1, x2) == x1) {
					do {
						x1 += x3;
						sol++;
					}while(x2 != x1);
				}else {
					do {
						x2 += x3;
						sol++;
					}while(x2 != x1);
				}
			}else {
				if( Math.min(x1, x2) == x1) {
					do {
						x2 += x3;
						sol++;
					}while(x2 != x1);
				}else {
					do {
						x1 += x3;
						sol++;
					}while(x2 != x1);
				}
			}
			sol--;
		}else {
			sol = Math.abs(y2-y1)-1;
		}
        return sol;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] x1Y1X2Y2 = scanner.nextLine().split(" ");

            int x1 = Integer.parseInt(x1Y1X2Y2[0]);

            int y1 = Integer.parseInt(x1Y1X2Y2[1]);

            int x2 = Integer.parseInt(x1Y1X2Y2[2]);

            int y2 = Integer.parseInt(x1Y1X2Y2[3]);

            int result = solve(x1, y1, x2, y2);

            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
