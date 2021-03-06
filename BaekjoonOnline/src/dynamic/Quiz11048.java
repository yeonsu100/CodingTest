package dynamic;
import java.util.*;

public class Quiz11048 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(sc.next());
		int m=Integer.parseInt(sc.next());
		int[][] arr=new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				arr[i][j]=Integer.parseInt(sc.next());
			}
		}
		int[][] start=new int[n+1][m+1];
		start[1][1]=arr[1][1];		// 출발지점 
		
		// 경로 이동 
		int[] row= {0, -1};
		int[] col= {-1, 0};
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(!(i==1 && j==1)) {
					int[] temp= {0, 0};
					for(int z=0; z<row.length; z++) {
						int prev_x=i+row[z];
						int prev_y=j+col[z];
						if(prev_x>0 && prev_x <= n && prev_y>0 && prev_y <= m) {
							temp[z]=arr[i][j]+start[prev_x][prev_y];
						}
					}
					start[i][j]=Math.max(temp[0], temp[1]);
				}
			}
		}
		System.out.println(start[n][m]);
	}
}
