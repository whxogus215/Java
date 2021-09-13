package ch05;

class MyGraph{
	private int count;  // ��� ����
	private int[][] vertexMatrix; 
	private int[] distance; // ��� �ִܰŸ�
	private boolean[] visited;
	private static int UNLIMIT = 99999999; // �ʱⰪ
	
	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	public void calcShortestPath(int from) {
		
		for(int i =0;i<count;i++) {
			distance[i] = UNLIMIT;
		}  // �ִܰŸ� �ʱⰪ ���� (���Ѵ밪)
		
		visited[from] = true;
		distance[from] = 0;
		
		for(int i =0; i<count; i++) {
			if(vertexMatrix[from][i] != 0) { 
				distance[i] = vertexMatrix[from][i]; // distance ����
			}
		}
		
		for( int k =1; k<count; k++) { // ���(from) ���κ��� �ִ� �Ÿ��� �� ������ ��� ����
			
			int min = UNLIMIT;  //update �� �ִܰŸ� ��
			int minIndex = -1;  //update �� �ִܰŸ� ��� ��ġ
			
			for(int i =0; i<count; i++) {
				if(!visited[i] && distance[i]!=UNLIMIT) { // �湮���� ����, �Ÿ��� ���� ���� �ƴ� �� ����
					if(distance[i] < min) {
						min = distance[i];  // �ʱ� �ִܰŸ� �� ����
						minIndex = i;
					}
				}
			}
			
			visited[minIndex] = true;
			for(int i =0; i<count; i++) {
				if(!visited[i] && vertexMatrix[minIndex][i]!=0) { // �湮���� ����, �ּ� ���� ��忡�� ���� ���� �ִ� ���
					if(distance[i] > distance[minIndex]+vertexMatrix[minIndex][i]) {
						distance[i] = distance[minIndex]+vertexMatrix[minIndex][i];
					}
				}
			}
		}
	}

	public void showDistance(int from) {
		
		for (int i=0; i<count; i++) {
			
			System.out.println(from + " ���κ��� " + i + " ����� �ִ� �Ÿ��� : " + distance[i]);
		}
	}

	
	
	}
public class ShortestPath {

	public static void main(String[] args) {
		
		MyGraph graph = new MyGraph(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);

		graph.calcShortestPath(0);
		graph.showDistance(0);
		
	}

}
