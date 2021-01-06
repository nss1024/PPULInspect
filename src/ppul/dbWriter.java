//TODO create the delete method + add actionlistener connected to delete method 

package ppul;

import java.sql.*;


public class dbWriter {
    private dbConnect dbconnect = new dbConnect();
    private Connection connection = dbconnect.getConnection();
    
    public void insertOneValue(String tableName,String columnName,String value){
      if(!value.trim().equalsIgnoreCase("")){
        String sql = "INSERT INTO "+ tableName+"("+columnName+")"+" VALUES(?)";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql); 
            pstmt.setString(1, value.trim());            
            pstmt.executeUpdate();
            infoBox.newInfoBox(value +" was added to "+tableName+" table", "New value added");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
             infoBox.newErrorBox("Operation could not be executed!", "DB write error"+"/n"+ e.getMessage());
        }}else{
          infoBox.newErrorBox("Cannot insert blank value to database, please enter a vlaue", "Null insertion error");
      }
    
    }
    
    public void insertRagValue(String tableName,String columnCustomer,String columnChemical, String columnRag,String customer,String chemical,String rag){
        
        String sql = "INSERT INTO "+ tableName+"("+columnCustomer+","+columnChemical+","+columnRag+")"+" VALUES(?,?,?)";
        System.out.println(sql);
        System.out.println(customer);
        System.out.println(chemical);
        System.out.println(rag);
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql); 
            pstmt.setString(1, customer.trim());
            pstmt.setString(2, chemical.trim());
            pstmt.setString(3, rag.trim());
            pstmt.executeUpdate();
            String msg = chemical + " has been added to the list as an" + rag +" active for " + customer;
            infoBox.newInfoBox(msg, "New RAG Active added");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
             infoBox.newErrorBox("Operation could not be executed!", "DB write error"+"/n"+ e.getMessage());
        }
    
    }
    
    public void updateRagValue(String tableName,String columnCustomer,String columnChemical, String columnRag,String customer,String chemical,String rag){
        
        String sql = "UPDATE "+ tableName+" SET "+columnCustomer+"= ?,"+columnChemical+"= ?,"+columnRag+"= ?"+"WHERE CustomerName = ? AND ChemicalName = ? COLLATE NOCASE";
        
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql); 
            pstmt.setString(1, customer);
            pstmt.setString(2, chemical);
            pstmt.setString(3, rag);
            pstmt.setString(4, customer);
            pstmt.setString(5, chemical);
            pstmt.executeUpdate();
            String msg =chemical+ " for "+ customer + " updated to " + rag;
            infoBox.newInfoBox(msg, "RAG status update");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            infoBox.newErrorBox("Operation could not be executed!", "DB write error" +"/n"+ e.getMessage());
        }
    
    }
    
    public void deleteRag(String tableName,String customer,String chemical,String rag){
        
    String sql = "DELETE FROM "+ tableName+" WHERE CustomerName = ? AND ChemicalName = ? AND RAGStatus=? COLLATE NOCASE";
        if(infoBox.yesNoBox("Are you sure you want to remove "+customer+" "+chemical+" "+rag+ " from " + tableName, "Confirmation")==0){
        try{
            PreparedStatement pstmt = connection.prepareStatement(sql); 
            pstmt.setString(1, customer);
            pstmt.setString(2, chemical);
            pstmt.setString(3, rag);           
            pstmt.executeUpdate();
            String msg = customer+" "+chemical+" "+rag+" has been removed from the database";
            infoBox.newInfoBox(msg, "Rag record deleted");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            infoBox.newErrorBox("Operation could not be executed!", "DB write error" +"/n"+ e.getMessage());
        }
        }else{
            infoBox.newInfoBox("Operation has been cancelled", "Operation cancelled");
        }
    }   
    
    public void deletOneValue(String tableName,String columnName,String value){
        String sql = "DELETE FROM "+ tableName+" WHERE "+ columnName+ "= ? COLLATE NOCASE";
        if(infoBox.yesNoBox("Are you sure you want to remove "+value +" from " + tableName, "Confirmation")==0){
        try{            
            PreparedStatement pstmt = connection.prepareStatement(sql); 
            pstmt.setString(1, value);
                       
            pstmt.executeUpdate();
            String msg = value+" has been removed from the database";
            infoBox.newInfoBox(msg, "Record deleted");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            infoBox.newErrorBox("Operation could not be executed!", "DB write error" +"/n"+ e.getMessage());
        }
        }else{
            infoBox.newInfoBox("Operation has been cancelled", "Operation cancelled");
        }
    }
}

