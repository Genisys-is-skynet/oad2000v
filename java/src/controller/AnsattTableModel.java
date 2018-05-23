package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Ansatt;

public class AnsattTableModel extends AbstractTableModel
{
    private final List<Ansatt> ansattList;

    private final String[] columnNames = new String[] {
            "Id", "Navn", "Timelønn", "Avdeling"
    };
    private final Class[] columnClass = new Class[] {
            Integer.class, String.class, Double.class, Boolean.class
    };

    public EmployeeTableModel(List<Ansatt> employeeList)
    {
        this.employeeList = employeeList;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return employeeList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Employee row = employeeList.get(rowIndex);
        if(0 == columnIndex) {
            return row.getId();
        }
        else if(1 == columnIndex) {
            return row.getName();
        }
        else if(2 == columnIndex) {
            return row.getHourlyRate();
        }
        else if(3 == columnIndex) {
            return row.isPartTime();
        }
        return null;
    }
}