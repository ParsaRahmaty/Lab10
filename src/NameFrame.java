import javax.swing.*;
import java.awt.*;

public class NameFrame extends JFrame {
    private static final String BTN_TXT = " Start Chatting ...";
    private static final String LABEL_TXT = " Choose Your UserName ";
    private static final int WIDTH = 300, HEIGHT = 100;
    JTextField textField;
    JButton btn;

    public NameFrame() throws HeadlessException {
        super();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setTitle("Login");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((dim.width / 2) - (getWidth() / 2), (dim.height / 2) - (getHeight() / 2));
        JLabel label = new JLabel("Choose Your UserName");
        add(label, BorderLayout.PAGE_START);
        textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        btn = new JButton(LABEL_TXT);
        add(btn, BorderLayout.PAGE_END);
        setVisible(true);
    }
}