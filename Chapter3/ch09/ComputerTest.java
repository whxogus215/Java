package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new Desktop();
		desktop.display();
		desktop.turnOff();  // �޼��尡 ������ �Ǿ����Ƿ� ���� �ν��Ͻ��� �޼��带 ������.
		
		
		NoteBook myNote = new MyNoteBook();
		myNote.display();
		myNote.typing();
	}

}
