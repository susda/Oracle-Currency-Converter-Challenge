package MoneyConverter;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_KEY = "a7a9d3193c4f3d199b6d311c";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/";


    private HttpClient httpClient;

    public ApiClient() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public JsonObject getRates(String baseCurrency) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + baseCurrency))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("HTTP error: " + response.statusCode());
        }

        return JsonParser.parseString(response.body()).getAsJsonObject();
    }
}