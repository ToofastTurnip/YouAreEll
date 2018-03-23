import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

import java.io.IOException;

public class YouAreEll {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private final String baseUrl = "http://zipcode.rocks:8085";
    private OkHttpClient client;
    private ObjectMapper mapper;
    private String fromId;

    YouAreEll() {
        client = new OkHttpClient();
        mapper = new ObjectMapper();
        fromId = "someone";
    }

    public static void main(String[] args) {
        YouAreEll urlHandler = new YouAreEll();
        ObjectMapper mapper = new ObjectMapper();
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String mainUrl, String method, String jpayload) {
        String fullUrl = baseUrl + mainUrl;
        Request request = null;
        if (method.equalsIgnoreCase("GET")) {
            request = new Request.Builder()
                    .url(fullUrl)
                    .build();
        }
        if (method.equalsIgnoreCase("POST")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            request = new Request.Builder()
                    .url(fullUrl)
                    .post(body)
                    .build();
        }
        if (method.equalsIgnoreCase("PUT")) {
            RequestBody body = RequestBody.create(JSON, jpayload);
            request = new Request.Builder()
                    .url(fullUrl)
                    .put(body)
                    .build();
        }
        if (request != null) {
            try (Response response = client.newCall(request).execute()) {
                return response.body().toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "error: bad method " + method;
    }

}
