import java.io.IOException;

public class Main {
    public static void main(String[] args){
        APIFacade norrisAPI = new APIFacade();
        APIFacade exchangeAPI = new APIFacade();
        String norrisURL = "https://api.chucknorris.io/jokes/random";
        String norrisValue = "value";
        String exchangeURL = "https://uselessfacts.jsph.pl/api/v2/facts/random";
        String exchangeValue = "text";
        try {
            System.out.println(norrisAPI.getAttributeValueFromJson(norrisURL,norrisValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println(exchangeAPI.getAttributeValueFromJson(exchangeURL,exchangeValue));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
