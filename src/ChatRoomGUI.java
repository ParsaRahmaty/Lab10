import javax.swing.*;
import java.awt.*;

public class ChatRoomGUI extends JFrame{
    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;
    private ChatArea chatBox = new ChatArea();
    private MessageArea messageArea = new MessageArea();
    private ParticipantsArea participantsArea = new ParticipantsArea();

    public ChatRoomGUI() {
        super();
        this.setTitle(WINDOWS_TITLE);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);
        this.add(new JScrollPane(chatBox), BorderLayout.CENTER);
        chatBox.addMessage("Parsa", "Are you working?");
        chatBox.addMessage("Program", "Why do I always have to do all the work, mr. \"Programmer\"??? huh? huh? huh??????????????????? HUUUUUH????");
        this.add(messageArea, BorderLayout.PAGE_END);
        this.add(participantsArea, BorderLayout.WEST);
        participantsArea.addUser("Parsa");
        participantsArea.addUser("Pedram");
        this.setVisible(true);
    }

    public void addNewMessage(String username, String message) {
        chatBox.addMessage(username, message);
    }

    public void  addNewParticipant(String username) {
        participantsArea.addUser(username);
    }

    public void removeParticipant(String username) {
        participantsArea.getModel().removeElement(username);
    }
}
