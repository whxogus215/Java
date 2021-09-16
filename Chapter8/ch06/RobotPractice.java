package ch06;

import java.util.Stack;

public class RobotPractice {
	
	public static int NUMDIRECTIONS = 4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move move;
	Maze maze = new Maze();
	
	public int[][] DIRECTION_OFFSETS = {
			{0, -1},
			{1, 0},
			{0, 1},
			{-1, 0}
	};
	
	public static int NOTVISIT = 0;
	public static int WALL = 1;
	public static int VISIT = 2;
	int[][] markArray = new int[8][8];
	
	public void findPath( int startX, int startY, int endX, int endY) {
		
		boolean isEmpty = false;
		boolean isFound = false;
		int i = 0;
		
		Move start = new Move(startX, startY);
		
		start.direction = 0;
		stack.push(start);
		
		while(isEmpty == false && isFound == false) {
			
			Move curPos = stack.pop();
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;
			
			while(isFound == false && direction < NUMDIRECTIONS) {
				
				int newX = x + DIRECTION_OFFSETS[direction][0];
				int newY = y + DIRECTION_OFFSETS[direction][1];
				
				if (newX >=0 && newX < WIDTH
									&& newY >= 0 && newY < HEIGHT
									&& maze.myMaze[newY][newX] == NOTVISIT
									&& markArray[newY][newX] == NOTVISIT) {
					
					Move newPosition = new Move(newX, newY);
					newPosition.direction = direction + 1;
					stack.push(newPosition);
					markArray[y][x] = VISIT;
					
					x = newX;
					y = newY;
					direction = 0;
					
					if (newX == endX && newY == endY) {
						isFound = true;
						newPosition.x = newX;
						newPosition.y = newY;
						newPosition.direction = 0;
						stack.push(newPosition);
						markArray[newY][newX] = VISIT;
					}
				}
				else direction++;
			}
			isEmpty = stack.isEmpty();
		}
	}
	
	

}
