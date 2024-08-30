package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginWithClock extends JFrame {
    private JLabel titleHeading, userNameLabel, passwordLabel;
    private Font headingFont = new Font("Menlo", Font.BOLD, 28);
    private Font textFont = new Font("Menlo", Font.PLAIN, 25);
    private JLabel clockLabel, timerLabel;
    private JButton startTimerButton, resetTimerButton, LoginButton, resetButton;
    private JPanel southPanel, centrPanel;
    private JTextField userName;
    private JPasswordField pass;

    public LoginWithClock(String title) {
        setTitle(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private void createComponents() {
        // this--- border layout
        this.setLayout(new BorderLayout());
        // init components
        titleHeading = new JLabel("Login with clock");
        timerLabel = new JLabel("00:00:00");
        clockLabel = new JLabel("01:25 AM");
        startTimerButton = new JButton("START");
        resetTimerButton = new JButton("RESET");
        centrPanel = new JPanel();

        userName = new JTextField();
        userNameLabel = new JLabel("UserName");
        passwordLabel = new JLabel("password");
        pass = new JPasswordField();
        LoginButton = new JButton("Login");
        resetButton = new JButton("RESET FORM");

        // this -- north

        // title size --bold centre
        titleHeading.setIcon(new ImageIcon("D:\\Java Basic\\GUI\\log-in.png"));
        titleHeading.setFont(headingFont);
        titleHeading.setHorizontalTextPosition(SwingConstants.CENTER);
        titleHeading.setVerticalTextPosition(SwingConstants.BOTTOM);
        // setting the text position
        // titleHeading.setHorizontalTextPosition(SwingConstants.CENTER);
        titleHeading.setHorizontalAlignment(JLabel.CENTER);
        titleHeading.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // this --- centre
        // TitledBorder titledBorder=BorderFactory.createTitledBorder("Fill Details
        // Correctly");
        // titledBorder.setTitlePosition(TitledBorder.CENTER);
        // centrPanel.setBorder(titledBorder);
        // centrPanel.setBorder(BorderFactory.createDashedBorder(Color.RED,5,10));

        centrPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20),
                BorderFactory.createTitledBorder("Fill Form")));

        centrPanel.setLayout(new GridLayout(3, 2));
        userNameLabel.setFont(textFont);
        userName.setFont(textFont);
        pass.setFont(textFont);
        passwordLabel.setFont(textFont);
        LoginButton.setFont(textFont);
        resetButton.setFont(textFont);
        userNameLabel.setHorizontalAlignment(JLabel.CENTER);
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        centrPanel.add(userNameLabel);
        centrPanel.add(userName);
        centrPanel.add(passwordLabel);
        centrPanel.add(pass);
        centrPanel.add(LoginButton);
        centrPanel.add(resetButton);

        // this --- south
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        southPanel.add(clockLabel);
        southPanel.add(timerLabel);
        southPanel.add(startTimerButton);
        southPanel.add(resetTimerButton);

        this.add(titleHeading, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(centrPanel);
    }

}
