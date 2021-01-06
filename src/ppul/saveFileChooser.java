
package ppul;

import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class saveFileChooser {
    
    public static String newSaveFileChooser(String dialogTitle, JFrame targetFrame){
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(dialogTitle);
        int result = chooser.showSaveDialog(targetFrame);
        String path = chooser.getSelectedFile().getAbsolutePath();
        String name = chooser.getSelectedFile().getName();
        
        String fileNameAndPatn = path;
        System.out.println(fileNameAndPatn);
        
        
    return fileNameAndPatn;
    }
    
}
