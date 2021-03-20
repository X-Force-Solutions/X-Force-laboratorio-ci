import HTTP.RequestHandler;
import JTable.GUIJTable;
import Model.StarWarsPeopleRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    final static Logger logger = LoggerFactory.getLogger(MainClass.class);
    public static void main(String[] args)  {
        logger.info("Inicia la aplicacion con dificultad");
        System.out.println("hola mundo papi");
        RequestHandler  requestHandler = new RequestHandler();
        var string = requestHandler.HTTPGetRequestJSONString("https://swapi.dev/api/people/");
        ObjectMapper objectMapper = new ObjectMapper();
        StarWarsPeopleRequest starWarsPeopleRequest = null;
        try {
            starWarsPeopleRequest = objectMapper.readValue(string, StarWarsPeopleRequest.class);
        } catch (JsonProcessingException e) {
            logger.error("Se produjo un error", e);
        }

        var guijTable = new GUIJTable();
        var columns = new String[]{"NAME", "HEIGHT", "BIRTH YEAR"};
        guijTable.setColumns(columns);
        guijTable.setData(starWarsPeopleRequest.convertToStringArray());
        guijTable.display(500, 250);
        logger.info("Finaliza la aplicacion con facilidad");

    }
}
