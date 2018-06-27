import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONORG {
	public void demoRead() throws FileNotFoundException, IOException, ParseException

	{

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("src/demofile.json"));

		JSONObject jsonObject = (JSONObject) obj;
		System.out.println(jsonObject);


		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("age"));

		JSONArray jsonarray = (JSONArray) jsonObject.get("cars");
		System.out.println(jsonarray);

		JSONObject JsonInnerObj1 = (JSONObject)jsonarray.get(0);
		System.out.println(JsonInnerObj1);

		System.out.println(JsonInnerObj1.get("name"));

		System.out.println(JsonInnerObj1.get("models"));
		System.out.println(((JSONArray) JsonInnerObj1.get("models")).get(0));
		System.out.println(((JSONArray) JsonInnerObj1.get("models")).get(1));
		System.out.println(((JSONArray) JsonInnerObj1.get("models")).get(2));


		JSONObject JsonInnerObj2 = (JSONObject)jsonarray.get(1);
		System.out.println(JsonInnerObj2);

		System.out.println(JsonInnerObj2.get("name"));

		System.out.println(JsonInnerObj2.get("models"));
		System.out.println(((JSONArray) JsonInnerObj2.get("models")).get(0));
		System.out.println(((JSONArray) JsonInnerObj2.get("models")).get(1));
		System.out.println(((JSONArray) JsonInnerObj2.get("models")).get(2));

		
		JSONObject JsonInnerObj3 = (JSONObject)jsonarray.get(2);
		System.out.println(JsonInnerObj3);

		System.out.println(JsonInnerObj3.get("name"));

		System.out.println(JsonInnerObj3.get("models"));
		System.out.println(((JSONArray) JsonInnerObj3.get("models")).get(0));
		System.out.println(((JSONArray) JsonInnerObj3.get("models")).get(1));
		

		
	



	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	
		ReadJSONORG obj = new ReadJSONORG();
		obj.demoRead();
	}

}
