package panels;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import data.DummyDatabase;

public class ScoreLookupPanel extends JPanel {
    private JComboBox<String> classCombo;
    private DefaultTableModel tableModel;

    public ScoreLookupPanel() {
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
        tableModel.addColumn("Điểm");

        JTable table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        classCombo.addActionListener(e -> updateTable());
        updateTable(); // load lần đầu
    }

    private void updateTable() {
        String selectedClass = (String) classCombo.getSelectedItem();
        List<String> students = DummyDatabase.getStudentsByClass().get(selectedClass);

        tableModel.setRowCount(0);
        for (String student : students) {
            int score = DummyDatabase.getStudentScores().getOrDefault(student, 0);
            tableModel.addRow(new Object[]{student, score});
        }
    }
}
