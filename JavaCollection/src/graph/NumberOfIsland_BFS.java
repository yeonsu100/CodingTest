package graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {
	// BFS (Breadth First Search) algorithm - queue를 이용 
	// 								* DFS는 stack을 이용한다 
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
		if(grid==null || grid.length==0) return 0;
		int count=0;
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				if(grid[i][j]=='1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}
		return count;
	}
	
	// 좌표값 설정 
	int[][] dirs= {{-1,0}, {1,0}, {0,1}, {0,-1}};
	
	void bfs(char[][] grid, int x, int y) {
		Queue<int[]> queue=new LinkedList<>();
		queue.offer(new int[] {x,y});
		while(!queue.isEmpty()) {
			int size=queue.size();
			int[] point=queue.poll();
			for(int i=0; i<size; i++) {
				for(int[] dir : dirs) {
					int x1=point[0]+dir[0];
					int y1=point[1]+dir[1];
				}
			}
		}
	}
}
