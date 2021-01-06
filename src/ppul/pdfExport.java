
package ppul;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.HorizontalAlignment;
import java.util.*;
import java.io.*;
import com.itextpdf.pdfa.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

public class pdfExport {
    String filePathAndName;
    JPanel reportTitlePanel;// holds the supplierDetailsPanel
    
    public pdfExport(JPanel title,List <JPanel> panelList, String filePathName){
        reportTitlePanel=title;
        filePathAndName=filePathName;
        pdfCreator(panelList);     
}
    
    private void pdfCreator (List <JPanel> panelList){
        reportTitlePanel.remove(3);// remove button from supplier details panel
        panelList.add(0,reportTitlePanel);
        for (int j=0;j<panelList.size();j++){
            panelList.get(j).setPreferredSize(new Dimension(800,800));
            
        }
        
        try {
            
            FileOutputStream fos = new FileOutputStream(filePathAndName+".pdf");
            System.out.println(filePathAndName);
            PdfWriter writer = new PdfWriter(fos);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document (pdfDoc);
            
            
            for (int i=0;i<panelList.size();i++){
                
               BufferedImage jImg = new BufferedImage(panelList.get(i).getWidth(),
                                      panelList.get(i).getHeight(),
                                      BufferedImage.TYPE_INT_ARGB);
                panelList.get(i).paint(jImg.createGraphics());
                Image itextImg;
                try {
                    itextImg = new Image(ImageDataFactory.create(jImg, null));
                    itextImg.scaleToFit(400.0f, 9999.9f); 
                    itextImg.setHorizontalAlignment(HorizontalAlignment.CENTER);
                    document.add(itextImg);
                    document.add(new Paragraph());
                    //document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                    //System.out.println("Exported");
                            
                } catch (IOException ex) {
                    Logger.getLogger(pdfExport.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pdfExport.class.getName()).log(Level.SEVERE, null, ex);
        }
       

}
   
   
    
}
