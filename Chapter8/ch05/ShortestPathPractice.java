package ch05;

class MyGraph2{
	
	private int count;
	private int[][] vertexMatrix;
	private int[] distance;
	private boolean[] visited;
	private static int UNLIMIT = 999999999;
	
	public MyGraph2(int count) {
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
		
		for(int i =0; i<count; i++) {
			distance[i] = UNLIMIT;
		}
		
		visited[from] = true;
		distance[from] = 0;
		
		for(int i =0; i< count; i++) {
			if(vertexMatrix[from][i] != 0) {
				distance[i] = vertexMatrix[from][i];
			}
		} // from으로부터 i 노드까지의 distance[] 값 생성 (matrix에 근거하여), 없는 경우 UNLIMIT 값 유지 
		
		for (int k =1; k <count; k++) {
			
			int min = UNLIMIT;
			int minIndex = -1;
			
			for(int i =0; i< count; i++) {
				if(!visited[i] && distance[i] != UNLIMIT) {
					if(distance[i] < min) {  // from:0인 경우에, i는 노드 1,2가 있지만 이 중 min 값은 가장 작은 값으로 측정됨!; 노드 2의 거리는 최솟값(노드 1 거리)보다 크므로 저 반복문을 빠져나옴! 
						min = distance[i];
						minIndex = i;     
					}
				}
			}
			
			visited[minIndex] = true;
			for(int i =0; i<count; i++) {
				if(!visited[i] && vertexMatrix[minIndex][i] != 0) {
					if(distance[i]>distance[minIndex]+vertexMatrix[minIndex][i]) {
						distance[i] = distance[minIndex]+vertexMatrix[minIndex][i];
					}
				}
			}
			
		}
	}
	
	public void showDistance(int from) {
		for(int i = 0; i<count; i++) {
    		
    		System.out.println("연습용 코드 " + from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
    	}
    }
}

public class ShortestPathPractice {

	public static void main(String[] args) {
		
		MyGraph2 graph = new MyGraph2(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);

		graph.calcShortestPath(2);
		graph.showDistance(2);

		
	}

}
