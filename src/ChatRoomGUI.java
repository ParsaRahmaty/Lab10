import javax.swing.*;

public class ChatRoomGUI extends JFrame{
    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;

    public ChatRoomGUI() {
        super();
        this.setTitle(WINDOWS_TITLE);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);
        this.setVisible(true);
    }
}
