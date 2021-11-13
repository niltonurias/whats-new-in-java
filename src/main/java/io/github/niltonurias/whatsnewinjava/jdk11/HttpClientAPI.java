package io.github.niltonurias.whatsnewinjava.jdk11;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.niltonurias.whatsnewinjava.support.TitleUtil;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.niltonurias.whatsnewinjava.support.JsonReader.convertJsonToObject;
import static io.github.niltonurias.whatsnewinjava.support.JsonReader.convertObjectToJson;

public class HttpClientAPI {
    private static final HttpClient httpClient;

    static {
        httpClient = HttpClient.newBuilder().build();
    }

    public static void httpGet() throws IOException, InterruptedException {
        TitleUtil.makeTitle("httpGet feature");

        HttpRequest request = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("https://animechan.vercel.app/api/random"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.printf("(Response) code: %s, body: %s%n", response.statusCode(), convertJsonToObject(response.body(), AnimeResponse.class));
    }

    public static void httpPost() throws IOException, InterruptedException {
        TitleUtil.makeTitle("httpPost feature");

        HttpRequest request = HttpRequest
                .newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(convertObjectToJson(new Post("Test", "Body", 1, null))))
                .header("Content-type", "application/json")
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.printf("(Response) code: %s, body: %s%n", response.statusCode(), convertJsonToObject(response.body(), Post.class));
    }

    public static void httpPut() throws IOException, InterruptedException {
        TitleUtil.makeTitle("httpPut feature");

        String body = convertObjectToJson(new Post("Test", "Body", 1, 1));

        HttpRequest request = HttpRequest
                .newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        var post = convertJsonToObject(response.body(), Post.class);
        System.out.printf("(Response) code: %s, body: %s%n", response.statusCode(), post);
    }

    public static void httpDelete() throws IOException, InterruptedException {
        TitleUtil.makeTitle("httpPut feature");

        HttpRequest request = HttpRequest
                .newBuilder()
                .DELETE()
                .header("Content-type", "application/json")
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        var post = convertJsonToObject(response.body(), Post.class);
        System.out.printf("(Response) code: %s", response.statusCode());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        httpGet();
        httpPost();
        httpPut();
        httpDelete();
    }

    public record AnimeResponse(String anime, String character, String quote) {}
    public record Post(String title, String body, Integer userId, Integer id) {}
}
