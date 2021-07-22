package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		desktop.display();
		desktop.turnOff();  // 메서드가 재정의 되었으므로 원래 인스턴스의 메서드를 실행함.
		
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
		myNote.typing();
	}

}
