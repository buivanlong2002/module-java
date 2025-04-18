package panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import data.DummyDatabase;

public class ClassListPanel extends JPanel {
    public ClassListPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("📚 Danh sách lớp học", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tên lớp");
        model.addColumn("Số sinh viên");

        for (String className : DummyDatabase.getClassList()) {
            int count = DummyDatabase.getStudentsByClass().get(className).size();
            model.addRow(new Object[]{className, count});
        }

        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
