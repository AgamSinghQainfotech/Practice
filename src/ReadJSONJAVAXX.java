import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class JSONDemoJAVAX {

	public void readJSONNN () throws FileNotFoundException, IOException, ParseException
	{

		Object obj = new JSONParser().parse(new FileReader("src/demofile.json"));

		/*
		JSONObject jo = (JSONObject) obj;

		//System.out.println(jo);
		String firstName = (String) jo.get("name");

		String arrayData [] = jo.
				System.out.println(firstName);




		long age = (long) jo.get("age");
		System.out.println(age);

		 */
		File jsonInputFile = new File("src/demofile.json");
		InputStream is = null;
		is = new FileInputStream(jsonInputFile);
		JsonReader reader = Json.createReader(is);
		// Get the JsonObject structure from JsonReader.
		JsonObject empObj = reader.readObject();
		reader.close();
		// read string data
		System.out.println("NameIS: " + empObj.getString("name"));
		// read json array
		JsonArray arrObj = empObj.getJsonArray("cars");
		//System.out.println("\nDirect Reports:");
		for(JsonValue value : arrObj){
			System.out.println(value.toString());





		}}
	// getting address
	/*  Map address = ((Map)jo.get("address"));

     // iterating address Map
     Iterator<Map.Entry> itr1 = address.entrySet().iterator();
     while (itr1.hasNext()) {
         Map.Entry pair = itr1.next();
         System.out.println(pair.getKey() + " : " + pair.getValue());
     }
	 */
	// getting phoneNumbers
	/* JSONArray ja = (JSONArray) jo.get("phoneNumbers");

     // iterating phoneNumbers
     Iterator itr2 = ja.iterator();

     while (itr2.hasNext()) 
     {
         itr1 = ((Map) itr2.next()).entrySet().iterator();
         while (itr1.hasNext()) {
             Map.Entry pair = itr1.next();
             System.out.println(pair.getKey() + " : " + pair.getValue());
         }
     }*/




}
	public class ReadJSONJAVAXX {

		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
			// TODO Auto-generated method stub

			JSONDemoJAVAX obj = new JSONDemoJAVAX();
			obj.readJSONNN();
		}

	}
