import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JsonReader {
    public String extractFromJson(String json,String value) throws IllegalArgumentException {
        JSONParser parser = new JSONParser();
        try{
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            if ((String) jsonObject.get(value) == null){
                throw new  IllegalArgumentException("attribute doesnt exist");

            }
            else {
                return (String) jsonObject.get(value);
            }
        }catch (Exception e){
            throw new IllegalArgumentException(e);
        }

    }

}
