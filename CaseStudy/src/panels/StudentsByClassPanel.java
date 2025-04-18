package panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import data.DummyDatabase;

public class StudentsByClassPanel extends JPanel {
    private JComboBox<String> classCombo;
    private DefaultTableModel tableModel;

    public StudentsByClassPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(new JLabel("Chọn lớp:"));

        classCombo = new JComboBox<>();
        for (String cls : DummyDatabase.getClassList()) {
            classCombo.addItem(cls);
        }
        topPanel.add(classCombo);

        add(topPanel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Tên sinh viên");

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        classCombo.addActionListener(e -> updateTable());

        updateTable(); // load lúc đầu
    }

    private void updateTable() {
        String selectedClass = (String) classCombo.getSelectedItem();
        List<String> students = DummyDatabase.getStudentsByClass().get(selectedClass);

        tableModel.setRowCount(0); // clear table
        for (String student : students) {
            tableModel.addRow(new Object[]{student});
        }
    }
}
