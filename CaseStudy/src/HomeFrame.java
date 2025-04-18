import panels.*;

import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {
    private JPanel contentPanel;

    public HomeFrame() {
        setTitle("Hệ Thống Quản Lý Sinh Viên");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Menu bên trái
        JPanel menuPanel = new JPanel(new GridLayout(7, 1, 0, 10));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton btnOverview = new JButton("🏠 Tổng quan");
        JButton btnClassList = new JButton("📚 Danh sách lớp");
        JButton btnStudentsByClass = new JButton("👨‍🎓 Học sinh theo lớp");
        JButton btnScoreLookup = new JButton("📝 Tra cứu điểm");
        JButton btnTeacherList = new JButton("👩‍🏫 Danh sách giáo viên");
        JButton btnLogout = new JButton("🚪 Đăng xuất");

        menuPanel.add(btnOverview);
        menuPanel.add(btnClassList);
        menuPanel.add(btnStudentsByClass);
        menuPanel.add(btnScoreLookup);
        menuPanel.add(btnTeacherList);
        menuPanel.add(Box.createVerticalStrut(10));
        menuPanel.add(btnLogout);

        contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(new OverviewPanel(), BorderLayout.CENTER);

        add(menuPanel, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);

        // Sự kiện chuyển panel
        btnOverview.addActionListener(e -> switchPanel(new OverviewPanel()));
        btnClassList.addActionListener(e -> switchPanel(new ClassListPanel()));
        btnStudentsByClass.addActionListener(e -> switchPanel(new StudentsByClassPanel()));
        btnScoreLookup.addActionListener(e -> switchPanel(new ScoreLookupPanel()));
        btnTeacherList.addActionListener(e -> switchPanel(new TeacherListPanel()));
        btnLogout.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        setVisible(true);
    }

    private void switchPanel(JPanel newPanel) {
        contentPanel.removeAll();
        contentPanel.add(newPanel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
