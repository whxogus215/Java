package ch04;

import java.util.Stack;

public class DfsSearch {
	
	
	int count;
	boolean[] visited; // �湮�� ��忡 ���� �ʿ��� ������ �ֱ� ���� �迭
	Stack<Integer> stack; // DFS�� Stack ���� ����
	int [][] matrix;
	
	public DfsSearch(int count) {
		  this.count = count;
		  visited = new boolean[count];
		  stack = new Stack<Integer>();
	}
	
	public void dfsTraversal() {
		
		stack.push(0); // 0���� ����
		visited[0] = true;
		
		
		while( stack.isEmpty() == false) { // Stack�� ����ֱ� ������ (��������� true)
			 int node = stack.pop(); // Stack���� ���� node ��
			 
			 System.out.print( node + " ");
			 
			 for( int j = 0; j<count; j++) {
				 
				 // ��ó�� node = 0�� �������ִ� node�� Ž�� �� push - pop
				 if (matrix[node][j] != 0 && visited[j] == false) {
					 // node�� ���� ����Ǿ� �ִٸ� 0�� �ƴ�, visited�� false�̸� ������ ���� node��
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
