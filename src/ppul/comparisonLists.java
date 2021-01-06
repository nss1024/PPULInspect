/* Use hashmap to store key value pairs for customers and their respective lists
* The map is base on a String from customerNames as a value and an arrayList<String> containing actives
*Database reading must return a String array for customer names and an Arraylist for actives
*/
package ppul;

import java.sql.*;
import java.util.*;


public class comparisonLists {
    
    
    private List <String> customerNamesList = new ArrayList <>();
    private List <String> mainChemicalsList = new ArrayList <>();
    private dbConnect dbconnect = new dbConnect();
    private Connection connection = dbconnect.getConnection();
    private Map<String,List<String>> amberMap = new HashMap<>();
    //private  List<String> amberList = new ArrayList<>();
    private Map<String,List<String>> redMap = new HashMap<>();
    //private  List<String> redList = new ArrayList<>();
    
            
    public comparisonLists(){
     loadCustomerList();
     loadChemicalsList();  
     loadAmberLists(customerNamesList); 
     loadRedLists(customerNamesList); 
    }
    
public void refresh(){
    mainChemicalsList.clear();
    customerNamesList.clear();
    amberMap.clear();
    redMap.clear();
     loadCustomerList();
     loadChemicalsList();  
     loadAmberLists(customerNamesList); 
     loadRedLists(customerNamesList); 
}

private void loadCustomerList(){
   
    String sql = "Select * From Customers";
    int i = 0;
     try (
             Statement stmt  = connection.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                customerNamesList.add(rs.getString("CustomerName"));
                //System.out.println(customerNamesList.get(i));
                i++;
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }

private void loadChemicalsList(){
   
    String sql = "Select * From ChemicalsMain";
    int i = 0;
     try (
             Statement stmt  = connection.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                
                mainChemicalsList.add(rs.getString("ChemicalName").toLowerCase().trim());
                //System.out.println(mainChemicalsList.get(i));
                i++;
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }

private void loadAmberLists(List<String> customerNames){

    for(int i =0;i<customerNames.size();i++){
        String sql = "SELECT ChemicalName FROM CustomerLists WHERE CustomerName =\""+customerNames.get(i)+"\" AND RAGStatus=\"Amber\"";
       // System.out.println(sql);
        amberMap.put(customerNames.get(i), new ArrayList<String>());
        int j =0;
        try (
             Statement stmt  = connection.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                
                amberMap.get(customerNames.get(i)).add(rs.getString("ChemicalName").toLowerCase());
               
                j++;
            }
           //System.out.println(amberMap.get(customerNames.get(i))); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }   
    }
}

private void loadRedLists(List<String> customerNames){

    for(int i =0;i<customerNames.size();i++){
        String sql = "SELECT ChemicalName FROM CustomerLists WHERE CustomerName =\""+customerNames.get(i)+"\" AND RAGStatus=\"Red\"";
       // System.out.println(sql);
        redMap.put(customerNames.get(i), new ArrayList<String>());
        int j =0;
        try (
             Statement stmt  = connection.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                
                redMap.get(customerNames.get(i)).add(rs.getString("ChemicalName").toLowerCase());
               
                j++;
            }
           //System.out.println(redMap.get(customerNames.get(i))); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }   
    }
}

public List<String> getCustomerNamesList(){
return customerNamesList;
}

public List<String> getmainChemicalsList(){
return mainChemicalsList;

}

public Map<String,List<String>> getAmberLists (){
return amberMap;
}

public Map<String,List<String>> getRedLists (){
return redMap;
}

}