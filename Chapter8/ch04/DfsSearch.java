package ch04;

import java.util.Stack;

public class DfsSearch {
	
	
	int count;
	boolean[] visited; // 방문한 노드에 대해 필요한 정보를 주기 위한 배열
	Stack<Integer> stack; // DFS는 Stack 으로 구현
	int [][] matrix;
	
	public DfsSearch(int count) {
		  this.count = count;
		  visited = new boolean[count];
		  stack = new Stack<Integer>();
	}
	
	public void dfsTraversal() {
		
		stack.push(0); // 0부터 시작
		visited[0] = true;
		
		
		while( stack.isEmpty() == false) { // Stack이 비어있기 전까지 (비어있으면 true)
			 int node = stack.pop(); // Stack에서 꺼낸 node 값
			 
			 System.out.print( node + " ");
			 
			 for( int j = 0; j<count; j++) {
				 
				 // 맨처음 node = 0과 인접해있는 node를 탐색 후 push - pop
				 if (matrix[node][j] != 0 && visited[j] == false) {
					 // node가 서로 연결되어 있다면 0이 아님, visited가 false이면 들어간적이 없는 node임
					 stack.push(j);
					 visited[j] = true;
				 }
			 }
		}
	}

	public static void main(String[] args) {
		
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdges(0, 2, 1);
		graph.addEdges(0, 1, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = graph.getMatrix();
		
		dfs.dfsTraversal();
		
		
	}

}
