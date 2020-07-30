package graph;

public class NumberOfIsland {
	// DFS (Depth First Search) algorithm
	public static void main(String[] args) {
		char[][] grid={
				{'1','1','1','0','1'},
				{'1','1','0','0','0'},
				{'1','1','0','0','1'},
				{'0','0','0','0','1'}
				};
		NumberOfIsland a=new NumberOfIsland();
		a.solve(grid);
	}
	
	public int solve(char[][] grid) {
		print(grid);
		
		// error handling
		if(grid==null || grid.length==0 || grid[0].length==0) return 0;
		
		// 00의 위치가 1인것부터 찾는다 
		int count=0;
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j]==1) {
					count++;
					dfs(grid, i, j);
				}
			}
		}
		return count;
	}
	
	public void dfs(char[][] grid, int i, int j) {
		int m=grid.length;
		int n=grid[0].length;
		
		if(i<0 || i>=m || j<0 || j>=n || grid[i][j]!='1') return;
		grid[i][j]='X';			// 임의의 값 X를 넣는다 	
		
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		
	}
	
	public void print(char[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
			//	System.out.print(" grid["+i+"]["+j+"] "+grid[i][j]);
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
