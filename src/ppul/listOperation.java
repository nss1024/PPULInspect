
package ppul;

import java.util.*;


public class listOperation {
    
  private List<reportData> dataList = new ArrayList<>();
    
  public void compareList (List <String> customers ,List <String> listToCheck, Map<String,List<String>> amberList, Map<String,List<String>> redList ){
  //loop through the customers array list. Use the customer names to get relevant arrayList from hashmaps and check listToCheck againts the retrieved
  //lists in the hashmap. 
  //Create new report data object for each customer and fill in data to it's variables.
  for (int i=0;i<customers.size();i++){
      dataList.add(new reportData());
      dataList.get(i).customerName =customers.get(i);
      //loop through list to check looking for amber chemicals
      for (int j=0;j<listToCheck.size();j++){
          if (amberList.get(customers.get(i)).contains(listToCheck.get(j).toLowerCase().trim())){
              dataList.get(i).customerAmberList.add(listToCheck.get(j));
              
          }
      }// end of Amber for loop
      
      //loop through list to check looking for red chemicals
      for (int k=0;k<listToCheck.size();k++){
          if (redList.get(customers.get(i)).contains(listToCheck.get(k).toLowerCase().trim())){
              dataList.get(i).customerRedList.add(listToCheck.get(k));
              
          }
      }// end of Red for loop
     
      // TODO greenlist must be listToCheck - dataList.get(i).cutomerAmberList+dataList.get(i).cutomerRdeList, consider doing it in the reportdata constructor.
      //System.out.println(listToCheck);
      for (int l=0; l< listToCheck.size();l++){
          //System.out.println(listToCheck.get(l) + " added to green list");
          if(!redList.get(customers.get(i)).contains(listToCheck.get(l).toLowerCase().trim())&&!amberList.get(customers.get(i)).contains(listToCheck.get(l).toLowerCase().trim()) ){
          dataList.get(i).customerGreenList.add(listToCheck.get(l));
          }
      }
      
     
      
      
  }
  
  for(int m=0;m<dataList.size();m++){
    System.out.println("--------------------------------------------------------");
    System.out.println(dataList.get(m).customerName);
    System.out.println("Banned :" +dataList.get(m).customerRedList);
    System.out.println("Derogation required: "+dataList.get(m).customerAmberList);
    System.out.println("Green: "+dataList.get(m).customerGreenList);
    System.out.println("--------------------------------------------------------");
  }
      
  
  }
    
public List <reportData> getDataList(){

    return dataList;
    
}

}
