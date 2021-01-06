
package ppul;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;


public class tsvExport {
        
    
    public static void exportTableToFile( JTable tableToExport, String fileNameAndPath){
    
        try{
            TableModel model = tableToExport.getModel();
            FileWriter writer = new FileWriter(new File(fileNameAndPath+".tsv"));
            
            for(int i = 0; i < model.getColumnCount(); i++){
            writer.write(model.getColumnName(i) + "\t");
        }

        writer.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                writer.write(model.getValueAt(i,j).toString()+"\t");
            }
            writer.write("\n");
        }

        writer.close();
        infoBox.newInfoBox("Export completed successfully!", "Export");
        } catch(Exception e){
            infoBox.newErrorBox("Export failed!", "Table export eror");
        }
        
    
    }
    
}
