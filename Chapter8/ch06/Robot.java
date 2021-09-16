package ch06;

import java.util.Stack;

public class Robot {
	
		public static int NUMDIRECTIONS = 4;  // ��,��,��,�� / ���� 4��
		public static int WIDTH = 8;
		public static int HEIGHT = 8;
		
		Stack<Move> stack = new Stack<Move>();
		Move move;  // ������ ��ü ����
		Maze maze = new Maze(); // �̷� ����
		
		public int[][] DIRECTION_OFFSETS =
			{
					// {x, y}
					{0, -1},		// �������� �̵�.     
					{1, 0},			// ���������� �̵�.      // DIRECTION_OFFSETS = [4][2]
					{0, 1},			// �Ʒ������� �̵�.    
					{-1, 0}			// �������� �̵�.     

			};
		
		// Maze�� �ִ� ���ڸ� ������ ǥ���� ��!
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
		
		// ���� �̷ΰ� �� WALL�� �Ǿ����� �� Stack�� ��� ����־ True�� �ǹǷ�, isEmpty ���ǹ��� �־�� �Ѵ�!
		while(isEmpty == false && isFound == false) {  // ������ �� ����� ������ �ݺ�
			// curPos = current Position
			Move curPos = stack.pop();  // ���������� �� ���������� �ұ��ϰ� �ƴѰ�� ���� ����
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;
			
			//
			while(isFound == false && direction < NUMDIRECTIONS) {  // ���� ��ã���� ���, �������� �� �� ������ �ݺ�
				 
				int newX = x + DIRECTION_OFFSETS[direction][0]; //  OFFSET�� 2���� �迭 ��, direction�� ���������� ����
				int newY = y + DIRECTION_OFFSETS[direction][1]; //  OFFSET�� �迭 �� ù��° ��Ҵ� x��ġ, �ι�° ��Ҵ� y��ġ�� ����Ű�Ƿ� x���� [direction][0]��° ���̾�� �ϰ�, y���� [direction][1]��° ���̾�� �Ѵ�.
				
				if (newX >= 0 && newX < WIDTH          // Ž������ ���� ���� ���, Ž������ ���� ���� VISIT ǥ��
										&& newY >= 0 && newY < HEIGHT
										&& maze.myMaze[newY][newX] == NOTVISIT
										&& markArray[newY][newX] == NOTVISIT) // Maze�� �������迭��, �������迭�� Ư���� Y�� X�� �ٲ��� �ùٸ� ��Ҹ� �����ϰ� �ȴ�.
				{
					
					Move newPosition = new Move(newX, newY);
					newPosition.direction = direction + 1; // �ٽ� ���� ������� Ž��
					stack.push(newPosition); // �ùٸ� ������ Stack�� ���� ���� ; ���߿� ��θ� ����ϱ� ���ؼ�!
					markArray[y][x] = VISIT;
					
					x = newX;    // Move�� ��ġ�� ���� ����
					y = newY;
					direction = 0; // NONVISIT�� ã���� ���, direction�� �ʱ�ȭ; �ٽ� �������� Ž�� �غ�
					
					// Ż�ⱸ�� ã���� ���
					if (newX == endX && newY == endY) {
						isFound = true; // �� while���� ���������� ��
						newPosition.x = newX; // ������ ��ǥ�� ����ȭ��
						newPosition.y = newY; 
						newPosition.direction = 0; // ���� ����
						stack.push(newPosition); // ���ÿ� ����
						markArray[newY][newX] = VISIT; // �������� �湮 üũ
					}
				}
				else direction++; // newX, newY�� WALL or VISIT�� ���� ���, �װ����� ���� �ʰ� ������ȯ 
			} // isFound = true�� ���� while���� ��������
		 isEmpty = stack.isEmpty(); // �ݺ��� ���� ��, isEmpty ����ȭ
		} // isFound = true�� ���� while���� ��������
	}
	
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		
		for(int i =0; i< HEIGHT ; i++) {
			for(int j =0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		} // resultArray�� myMaze �̷� �����ϱ�
		
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
			Move move = stack.pop(); // Stack�� �׿��ִ� �������� �����͸� �ϳ��� �����鼭 ���; ���������� ������ ������ ���������� ���� ��µȴ�.
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
