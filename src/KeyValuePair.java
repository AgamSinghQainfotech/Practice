import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValuePair {
	
    public static Map getKeyValuesMap(String[] keyArray, String[]...values){
        List<String> valueList;
        
        Map<String,List> keyValuesMap = new HashMap<String, List>();
       
        int len = values.length;
        int a=0;
        
        for(String key : keyArray)    {
            valueList = new ArrayList();
           for(int i=0;i<len;i++){
               valueList.add(values[i][a].trim());
           }
           keyValuesMap.put( key.trim(),valueList);
        a++;
        }
        return keyValuesMap;
    }

	
    public static void main(String[] args) {
		String[] id = {"1","2","3","4"};
		String[] name = {"Abc","Xyz","Mno","Pqr"};
		String[] address = {"A","B","C","D"};
		Map myData = getKeyValuesMap(id,name,address);
		System.out.println(myData);

	}

}
