package ch04;

public class UndirectedGraph {
	private int count; // 그래프 크기
	private int[][] vertexMatrix;
	
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;  // UndirectedGraph이므로 weight(가중치)가 같음
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
