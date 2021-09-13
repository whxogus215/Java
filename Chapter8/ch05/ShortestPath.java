package ch05;

class MyGraph{
	private int count;  // 노드 개수
	private int[][] vertexMatrix; 
	private int[] distance; // 노드 최단거리
	private boolean[] visited;
	private static int UNLIMIT = 99999999; // 초기값
	
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
		}  // 최단거리 초기값 설정 (무한대값)
		
		visited[from] = true;
		distance[from] = 0;
		
		for(int i =0; i<count; i++) {
			if(vertexMatrix[from][i] != 0) { 
				distance[i] = vertexMatrix[from][i]; // distance 갱신
			}
		}
		
		for( int k =1; k<count; k++) { // 출발(from) 노드로부터 최단 거리를 잴 나머지 노드 개수
			
			int min = UNLIMIT;  //update 할 최단거리 값
			int minIndex = -1;  //update 된 최단거리 노드 위치
			
			for(int i =0; i<count; i++) {
				if(!visited[i] && distance[i]!=UNLIMIT) { // 방문한적 없고, 거리가 무한 값이 아닐 때 까지
					if(distance[i] < min) {
						min = distance[i];  // 초기 최단거리 값 설정
						minIndex = i;
					}
				}
			}
			
			visited[minIndex] = true;
			for(int i =0; i<count; i++) {
				if(!visited[i] && vertexMatrix[minIndex][i]!=0) { // 방문한적 없고, 최소 근접 노드에서 부터 길이 있는 경우
					if(distance[i] > distance[minIndex]+vertexMatrix[minIndex][i]) {
						distance[i] = distance[minIndex]+vertexMatrix[minIndex][i];
					}
				}
			}
		}
	}

	public void showDistance(int from) {
		
		for (int i=0; i<count; i++) {
			
			System.out.println(from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
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
