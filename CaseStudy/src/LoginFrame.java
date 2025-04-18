import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("Đăng Nhập Hệ Thống");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // ===== Header =====
        JLabel titleLabel = new JLabel("Quản Lý Học Sinh", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        add(titleLabel, BorderLayout.NORTH);

        // ===== Form Panel =====
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Tên đăng nhập
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Tên đăng nhập:"), gbc);
        gbc.gridx = 1;
        usernameField = new JTextField(15);
        formPanel.add(usernameField, gbc);

        // Mật khẩu
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Mật khẩu:"), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        formPanel.add(passwordField, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ===== Nút đăng nhập =====
        JPanel buttonPanel = new JPanel();
        loginButton = new JButton("Đăng nhập");
        loginButton.setPreferredSize(new Dimension(120, 30));
        buttonPanel.add(loginButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // ===== Action =====
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("123")) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Đăng nhập thành công!");
                    dispose(); // Đóng login
                    SwingUtilities.invokeLater(HomeFrame::new); // Mở giao diện chính
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Sai tài khoản hoặc mật khẩu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hiện cửa sổ
        setVisible(true);
    }

    public static void main(String[] args) {
        // Đặt Look and Feel hệ thống
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
