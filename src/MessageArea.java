import javax.swing.*;
import java.awt.*;

public class MessageArea extends JPanel{
    public MessageArea() {
        super(new BorderLayout());
        JButton button = new JButton("Send");
        add(button, BorderLayout.EAST);
        JTextField textField = new JTextField("Write your message...");
        add(textField, BorderLayout.CENTER);
    }
}
