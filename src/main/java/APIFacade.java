import java.io.IOException;

public class APIFacade {

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        Connector connector = new Connector();
        JsonReader jsonReader = new JsonReader();
        return jsonReader.extractFromJson(connector.getJsonFromApi(urlString), attributeName);


    }
}
