import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Gui{
  
  public static void main(String args[]){
    JFrame frame = new JFrame();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,1000);
    
    JPanel panel = new JPanel();
    frame.add(panel);
    
    placeComponents(panel);
    
    frame.setVisible(true);
  }
  
  private static void placeComponents(JPanel panel){
    panel.setLayout(null);
    
    JLabel size = new JLabel("Enter the size of your hashtable");
    size.setBounds(100, 890, 100, 10);
    panel.add(size);
    
    JTextField sizeValue = new JTextField("10");
    sizeValue.setBounds(100, 920, 100, 50);
    panel.add(sizeValue);
    
    JLabel entry = new JLabel("Enter value to add to Hash Table");
    entry.setBounds(800, 890, 100, 10);
    panel.add(entry);
    
    JTextField entryValue = new JTextField("10");
    entryValue.setBounds(800, 920, 100, 50);
    panel.add(entryValue);
    
    String[][] data = {{"hello"}, {"hello"}};
    DefaultTableModel model = new DefaultTableModel(data,1);
    
    JTable hashTable = new JTable(model);
    hashTable.setBounds(50, 50, 100, 100);
    panel.add(hashTable);
    
    
  }
}