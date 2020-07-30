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
		return 0;
	}
	
	public void print(char[][] grid) {
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(" grid["+i+"]["+j+"] "+grid[i][j]);
			}
			System.out.println();
		}
	}
}
