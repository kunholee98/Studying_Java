package AbstractClass;

public class ComputerTest {
    public static void main (String[] args) {
        Computer desktop = new Desktop();
        Computer myNoteBook = new MyNoteBook();
        desktop.display();
        desktop.typing();
        myNoteBook.display();
        myNoteBook.typing();
    }
    
}
