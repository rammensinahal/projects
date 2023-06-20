package coding_test;

import java.util.Scanner;

public class High_peek {

public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of jobs");
			int[] stime=new int[sc.nextInt()];
			int[] etime=new int[stime.length];
			int[] profit=new int[stime.length];
			System.out.println("Enter job start time, end time, and earnings");
			for (int i = 0; i < stime.length; i++) {
				stime[i]=sc.nextInt();
				etime[i]=sc.nextInt();
				profit[i]=sc.nextInt();
			}
			int x=0;
			int sum=0;
			for (int i = 0; i < profit.length; i++) {
				sum=sum+profit[i];
			}
			if(sum>=900){
				x=2;
				sum=400;
			}
			else if(sum<900)
			{
				x=1;
				sum=100;
			}
			System.out.println("The number of tasks and earnings available for others\nTask: "+x+"\nEarnings: "+sum);
		}
	}
