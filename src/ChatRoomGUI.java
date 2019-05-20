import javax.swing.*;
import java.awt.*;

public class ChatRoomGUI extends JFrame{
    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;

    public ChatRoomGUI() {
        super();
        this.setTitle(WINDOWS_TITLE);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);
        ChatArea chatBox = new ChatArea();
        this.add(new JScrollPane(chatBox), BorderLayout.CENTER);
        chatBox.addMessage("Parsa", "Are you working?");
        chatBox.addMessage("Program", "Why do I always have to do all the work, mr. \"Programmer\"???");
        this.setVisible(true);
    }
}
