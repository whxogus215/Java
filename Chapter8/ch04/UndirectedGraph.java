package ch04;

public class UndirectedGraph {
	private int count; // �׷��� ũ��
	private int[][] vertexMatrix;
	
	
	public UndirectedGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
	}
	
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;  // UndirectedGraph�̹Ƿ� weight(����ġ)�� ����
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
