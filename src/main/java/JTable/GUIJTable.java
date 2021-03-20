package JTable;
import javax.swing.*;

public class GUIJTable {
    private String[] columns;
        private String[][] data;
        public GUIJTable(){
        }

    public String[] getColumns() {
        return columns;
    }

    public GUIJTable setColumns(String[] columns) {
        this.columns = columns;
        return this;
    }

    public String[][] getData() {
        return data;
    }

    public GUIJTable setData(String[][] data) {
        this.data = data;
        return this;
    }
    public void display(int width, int height){
        JFrame f = new JFrame();
        JTable jt=new JTable(data, columns);
        jt.setBounds(30,40,width - 100,height - 100);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(width,height);
        f.setVisible(true);
    }
}
