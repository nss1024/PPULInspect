
package ppul;
import java.util.*;

public class reportData {
    public String customerName;
    ArrayList <String> customerAmberList;
    ArrayList <String> customerRedList;
    List <String> customerGreenList;
    //List <String> customerOtherList;
    
    reportData(){
    
        customerAmberList = new ArrayList<>();
        customerRedList = new ArrayList<>();
        customerGreenList = new ArrayList<>();
        //customerOtherList = ppulUI.otherChemicalsAList;
        //getGreenlist();
        
        
    }
    

    //remove amber and red elements to get the green list
    private void getGreenlist(){
        //remove all Amber elements form the green list
        for(int i = 0; i<customerAmberList.size();i++){
            if(customerGreenList.contains(customerAmberList.get(i))) {customerGreenList.remove(customerAmberList.get(i));}
        }
        
        //remove all Red elements form the green list
        for (int j=0;j<customerRedList.size();j++){
            if(customerGreenList.contains(customerRedList.get(j))){customerGreenList.remove(customerRedList.get(j));}
        }
    } 
}
