package ch06;

import java.util.Stack;

public class Robot {
	
		public static int NUMDIRECTIONS = 4;  // 동,서,남,북 / 방향 4개
		public static int WIDTH = 8;
		public static int HEIGHT = 8;
		
		Stack<Move> stack = new Stack<Move>();
		Move move;  // 움직일 객체 생성
		Maze maze = new Maze(); // 미로 생성
		
		public int[][] DIRECTION_OFFSETS =
			{
					// {x, y}
					{0, -1},		// 위쪽으로 이동.     
					{1, 0},			// 오른쪽으로 이동.      // DIRECTION_OFFSETS = [4][2]
					{0, 1},			// 아래쪽으로 이동.    
					{-1, 0}			// 왼쪽으로 이동.     

			};
		
		// Maze에 있는 숫자를 변수로 표현한 것!
		public static int NOTVISIT = 0; 
		public static int WALL = 1;
		public static int VISIT = 2;
		int[][] markArray = new int[8][8];
		
	public void findPath ( int startX, int startY, int endX, int endY) {
		
		boolean isEmpty = false;
		boolean isFound = false;
		int i = 0;
		
		Move start = new Move(startX, startY);
		
		start.direction = 0;
		stack.push(start);
		
		// 만약 미로가 다 WALL로 되어있을 땐 Stack이 계속 비어있어서 True가 되므로, isEmpty 조건문도 있어야 한다!
		while(isEmpty == false && isFound == false) {  // 스택이 다 비워질 때까지 반복
			// curPos = current Position
			Move curPos = stack.pop();  // 동서남북을 다 돌았음에도 불구하고 아닌경우 값을 꺼냄
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;
			
			//
			while(isFound == false && direction < NUMDIRECTIONS) {  // 길을 못찾았을 경우, 동서남북 다 돌 때까지 반복
				 
				int newX = x + DIRECTION_OFFSETS[direction][0]; //  OFFSET의 2차원 배열 중, direction은 동서남북을 결정
				int newY = y + DIRECTION_OFFSETS[direction][1]; //  OFFSET의 배열 중 첫번째 요소는 x위치, 두번째 요소는 y위치를 가리키므로 x값은 [direction][0]번째 값이어야 하고, y값은 [direction][1]번째 값이어야 한다.
				
				if (newX >= 0 && newX < WIDTH          // 탐색하지 않은 곳일 경우, 탐색하지 않은 곳은 VISIT 표시
										&& newY >= 0 && newY < HEIGHT
										&& maze.myMaze[newY][newX] == NOTVISIT
										&& markArray[newY][newX] == NOTVISIT) // Maze는 이차원배열로, 이차원배열의 특성상 Y와 X가 바뀌어야 올바른 요소를 지정하게 된다.
				{
					
					Move newPosition = new Move(newX, newY);
					newPosition.direction = direction + 1; // 다시 오른 방향부터 탐색
					stack.push(newPosition); // 올바른 지점을 Stack에 집어 넣음 ; 나중에 경로를 출력하기 위해서!
					markArray[y][x] = VISIT;
					
					x = newX;    // Move의 위치를 새로 지정
					y = newY;
					direction = 0; // NONVISIT을 찾았을 경우, direction을 초기화; 다시 동서남북 탐색 준비
					
					// 탈출구를 찾았을 경우
					if (newX == endX && newY == endY) {
						isFound = true; // 두 while문을 빠져나오게 함
						newPosition.x = newX; // 도착점 좌표를 동기화함
						newPosition.y = newY; 
						newPosition.direction = 0; // 방향 리셋
						stack.push(newPosition); // 스택에 저장
						markArray[newY][newX] = VISIT; // 도착지점 방문 체크
					}
				}
				else direction++; // newX, newY가 WALL or VISIT을 갔을 경우, 그곳으로 가지 않고 방향전환 
			} // isFound = true로 인해 while문을 빠져나옴
		 isEmpty = stack.isEmpty(); // 반복문 종료 후, isEmpty 동기화
		} // isFound = true로 인해 while문을 빠져나옴
	}
	
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		
		for(int i =0; i< HEIGHT ; i++) {
			for(int j =0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		} // resultArray에 myMaze 미로 복사하기
		
		for(int i =0; i< HEIGHT; i++) {
			for (int j =0; j< WIDTH; j++) {
				if (maze.myMaze[i][j] == WALL) {
						System.out.print("*");
				}
				else if (markArray[i][j] == VISIT) {
						System.out.print("|");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
		
		int i =0;
		while(isEmpty == false) {
			Move move = stack.pop(); // Stack에 쌓여있는 도착지점 데이터를 하나씩 꺼내면서 출력; 위에서부터 꺼내기 때문에 도착지점이 먼저 출력된다.
			int x = move.x;  
			int y = move.y;
			resultArray[y][x] = VISIT;  
			
			if (i > 0) {
				System.out.print("<-");
			}
			System.out.print("(" + x + "," + y + ") ");
			i++;
			isEmpty = stack.isEmpty();
		}
		System.out.println();
		
		
	}
	
}
