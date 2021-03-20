package HTTP;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class RequestHandler{
    private final CloseableHttpClient httpClient;
    final static Logger logger = LoggerFactory.getLogger(RequestHandler.class);

    public RequestHandler() {
        this.httpClient = HttpClients.createDefault();
    }

    public String HTTPGetRequestJSONString(String url) {
        HttpGet request = new HttpGet(url);

        String jsonStringBody = null;

        try (CloseableHttpResponse response = this.httpClient.execute(request)) {
            jsonStringBody = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            logger.error("Se produjo un error", e);
        }
        return jsonStringBody;
    }

}
