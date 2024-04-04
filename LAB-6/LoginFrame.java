import javax.swing.*;
import java.awt.*;

public
class LoginFrame extends JFrame
{

private
    JTextField usernameTextField;
private
    JPasswordField passwordField;

public
    LoginFrame()
    {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameTextField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e->{
            String username = usernameTextField.getText();
            String password = new String(passwordField.getPassword());
            // Add your login logic here
            // For demonstration purposes, just printing the credentials
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        });

        panel.add(usernameLabel);
        panel.add(usernameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for layout purposes
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

public
    static void main(String[] args)
    {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
