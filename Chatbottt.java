import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbottt {
    private static double balance = 1000.0;
    private static boolean cardBlocked = false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> showLoginScreen());
    }

    private static void showLoginScreen() {
        JFrame loginFrame = new JFrame("User Login");
        loginFrame.setSize(350, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        loginPanel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        loginPanel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        loginPanel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        loginPanel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 90, 80, 25);
        loginPanel.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());

            if (username.equals("user") && password.equals("password")) {
                loginFrame.dispose();
                createAndShowGUI();
            } else {
                JOptionPane.showMessageDialog(loginPanel, "Invalid credentials! Use Username: user, Password: password");
            }
        });

        loginFrame.add(loginPanel);
        loginFrame.setVisible(true);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Banking Chatbot");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel(" Bankbot!");
        welcomeLabel.setBounds(80, 10, 250, 25);
        panel.add(welcomeLabel);

        JButton balanceButton = new JButton("Check Balance");
        balanceButton.setBounds(100, 50, 200, 30);
        panel.add(balanceButton);

        JButton loanInfoButton = new JButton("Loan Info");
        loanInfoButton.setBounds(100, 90, 200, 30);
        panel.add(loanInfoButton);

        JButton roiButton = new JButton("Check Loan ROI");
        roiButton.setBounds(100, 130, 200, 30);
        panel.add(roiButton);

        JButton creditCardButton = new JButton("Credit Card Info");
        creditCardButton.setBounds(100, 170, 200, 30);
        panel.add(creditCardButton);

        JButton blockCardButton = new JButton("Block Debit Card");
        blockCardButton.setBounds(100, 210, 200, 30);
        panel.add(blockCardButton);

        JButton unblockCardButton = new JButton("Unblock Debit Card");
        unblockCardButton.setBounds(100, 250, 200, 30);
        panel.add(unblockCardButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(100, 290, 200, 30);
        panel.add(exitButton);

        balanceButton.addActionListener(e -> JOptionPane.showMessageDialog(panel, "Your balance is: Rs" + balance));

        loanInfoButton.addActionListener(e -> {
            String message = "Loan Types and Details:\n\n"
                           + "1. Personal Loan\n"
                           + "   - Documents: ID Proof, Address Proof, Income Proof\n"
                           + "   - ROI: 11% p.a.\n\n"
                           + "2. Home Loan\n"
                           + "   - Documents: Property Papers, ID Proof, Address Proof, Salary Slips\n"
                           + "   - ROI: 7% p.a.\n\n"
                           + "3. Car Loan\n"
                           + "   - Documents: Car Quotation, ID Proof, Address Proof, Bank Statement\n"
                           + "   - ROI: 9% p.a.\n\n"
                           + "4. Education Loan\n"
                           + "   - Documents: Admission Proof, ID Proof, Address Proof, Income Proof\n"
                           + "   - ROI: 8% p.a.";
            JOptionPane.showMessageDialog(panel, message);
        });

        roiButton.addActionListener(e -> {
            String message = "Loan ROI (Rate of Interest):\n"
                           + "- Personal Loan: 11% p.a.\n"
                           + "- Home Loan: 7% p.a.\n"
                           + "- Car Loan: 9% p.a.\n"
                           + "- Education Loan: 8% p.a.";
            JOptionPane.showMessageDialog(panel, message);
        });

        creditCardButton.addActionListener(e -> {
            String message = "Credit Card Types and Details:\n\n"
                           + "1. Silver Card\n"
                           + "   - Limit: Rs 50,000\n"
                           + "   - Annual Fee: Rs 500\n"
                           + "   - Benefits: Reward points, Dining discounts\n\n"
                           + "2. Gold Card\n"
                           + "   - Limit: Rs 1,00,000\n"
                           + "   - Annual Fee: Rs 1,000\n"
                           + "   - Benefits: Travel benefits, Cashback offers\n\n"
                           + "3. Platinum Card\n"
                           + "   - Limit: Rs 2,00,000\n"
                           + "   - Annual Fee: Rs 2,000\n"
                           + "   - Benefits: Lounge access, Exclusive offers, Higher rewards";
            JOptionPane.showMessageDialog(panel, message);
        });

        blockCardButton.addActionListener(e -> {
            if (!cardBlocked) {
                cardBlocked = true;
                JOptionPane.showMessageDialog(panel, "Your debit card has been blocked.");
            } else {
                JOptionPane.showMessageDialog(panel, "Your debit card is already blocked.");
            }
        });

        unblockCardButton.addActionListener(e -> {
            if (cardBlocked) {
                cardBlocked = false;
                JOptionPane.showMessageDialog(panel, "Your debit card has been unblocked.");
            } else {
                JOptionPane.showMessageDialog(panel, "Your debit card is not blocked.");
            }
        });

        exitButton.addActionListener(e -> System.exit(0));
    }
}