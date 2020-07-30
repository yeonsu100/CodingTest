package graph;

public class NumberOfIsland_BFS {
	// BFS (Breadth First Search) algorithm
	public static void main(String[] args) {
		char[][] grid={
				{'1','1','0','0','1'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'},
				{'0','0','0','1','1'}
				};
		NumberOfIsland_BFS a=new NumberOfIsland_BFS();
		System.out.println(a.numberOfIsland(grid));
	}
	
	int numberOfIsland(char[][] grid) {

	}
}
