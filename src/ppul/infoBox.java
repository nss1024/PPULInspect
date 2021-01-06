
package ppul;

import javax.swing.JOptionPane;


public class infoBox {
    
    public static void newInfoBox(String msg, String title){
        
        JOptionPane.showMessageDialog(null, msg, title,JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public static void newErrorBox(String msg, String title){
        
        JOptionPane.showMessageDialog(null, msg, title,JOptionPane.ERROR_MESSAGE);
        
    }
    
    public static int yesNoBox(String msg,String title){
        // result is the integer representation of the user's response Yes = 0 ; No = 1;
        int result = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION);
        System.out.println(result);
    return result;
    }
    
}
