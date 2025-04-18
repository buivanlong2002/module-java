package panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import data.DummyDatabase;

public class TeacherListPanel extends JPanel {
    public TeacherListPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("👩‍🏫 Danh sách giáo viên", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tên giáo viên");

        for (String teacher : DummyDatabase.getTeachers()) {
            model.addRow(new Object[]{teacher});
        }

        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
