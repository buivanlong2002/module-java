package panels;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import data.DummyDatabase;

public class OverviewPanel extends JPanel {
    public OverviewPanel() {
        setLayout(new GridLayout(1, 3, 20, 20));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Dữ liệu
        List<String> classes = DummyDatabase.getClassList();
        int totalStudents = DummyDatabase.getStudentScores().size();
        int totalTeachers = DummyDatabase.getTeachers().size();

        // Panel thống kê lớp
        add(createStatCard("📚 Lớp học", String.valueOf(classes.size()), new Color(52, 152, 219)));

        // Panel thống kê sinh viên
        add(createStatCard("👨‍🎓 Sinh viên", String.valueOf(totalStudents), new Color(46, 204, 113)));

        // Panel thống kê giáo viên
        add(createStatCard("👩‍🏫 Giáo viên", String.valueOf(totalTeachers), new Color(155, 89, 182)));
    }

    private JPanel createStatCard(String title, String value, Color color) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(color);
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        panel.setPreferredSize(new Dimension(150, 100));

        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));

        JLabel valueLabel = new JLabel(value, JLabel.CENTER);
        valueLabel.setForeground(Color.WHITE);
        valueLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(valueLabel, BorderLayout.CENTER);

        return panel;
    }
}
