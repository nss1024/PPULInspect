
package ppul;
import java.awt.Color;
import java.awt.Dimension;
import java.util.*;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.*;


public class report {
    
    private List <JPanel> panelList = new ArrayList<>();
    private List <reportData> reportDataList;
    
    
    public report (List <reportData> rdl){
    reportDataList = rdl;
    
    createReport(reportDataList);
    
    
    }
    
    public void createReport( List <reportData> dataList){
         
        for (int i=0;i<dataList.size();i++){
            //TODO call methods for panel creation, chart creation and table creation
            panelList.add(new JPanel());
            panelList.get(i).setLayout(new BoxLayout(panelList.get(i),BoxLayout.X_AXIS));
            panelList.get(i).add(createChart(dataList.get(i).customerRedList.size(),dataList.get(i).customerAmberList.size(),dataList.get(i).customerGreenList.size(),dataList.get(i).customerName));
            panelList.get(i).add(new JScrollPane(createTable(dataList.get(i).customerRedList,dataList.get(i).customerAmberList,dataList.get(i).customerGreenList)));
        }
        System.out.println("paneList created and loaded " + panelList.size());
    }
    
    
    
    private ChartPanel createChart(int redData,int amberData, int greenData,String customerName){
            
            DefaultPieDataset pieDataset = new DefaultPieDataset();            
            pieDataset.setValue("Red", new Integer(redData));
            pieDataset.setValue("Amber", new Integer(amberData));          
            pieDataset.setValue("Green", new Integer(greenData));
            JFreeChart chart2 = ChartFactory.createPieChart(customerName,pieDataset,true,true,false);            
            ChartPanel pieChartPanel = new ChartPanel(chart2);
            PiePlot plot = (PiePlot) chart2.getPlot();
            plot.setLabelGenerator(null);
            plot.setSectionPaint("Red", Color.RED);
            plot.setSectionPaint("Amber", Color.ORANGE);
            plot.setSectionPaint("Green", Color.GREEN);
            pieChartPanel.setPreferredSize(new Dimension(400,800));
            System.out.println("Charts created");
        return pieChartPanel;
    }
    
    private JTable createTable (List redData, List amberData, List greenData){
        
        Object [] red = redData.toArray();
        Object [] amber = amberData.toArray();
        Object [] green = greenData.toArray();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("RED", red);
        tableModel.addColumn("AMBER", amber);
        tableModel.addColumn("GREEN", green);
        JTable ragData = new JTable(tableModel);   
        ragData.setEnabled(false);//make table not editable -> unresponsive to user input   
        //ragData.setPreferredSize(new Dimension(400,800));
        System.out.println("Tables created");
        return ragData;
    }
    
    public List <JPanel> getPanelList(){

return panelList;
}
  
}
