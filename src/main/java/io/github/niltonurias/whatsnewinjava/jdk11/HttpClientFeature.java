package io.github.niltonurias.whatsnewinjava.jdk11;

import io.github.niltonurias.whatsnewinjava.support.TitleUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.niltonurias.whatsnewinjava.support.JsonReader.convertJsonToObject;
import static io.github.niltonurias.whatsnewinjava.support.JsonReader.convertObjectToJson;

/**
 * The new HTTP client from the java.net.http package was introduced in Java 9. <br>It has now become a standard feature in Java 11.
 * <br><br>
 * @since 11
 * @see java.net.http.HttpClient
 */
public class HttpClientFeature {
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
                .POST(HttpRequest.BodyPublishers.ofString(convertObjectToJson(new Post(null, "Test", "Body", 1))))
                .header("Content-type", "application/json")
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.printf("(Response) code: %s, body: %s%n", response.statusCode(), convertJsonToObject(response.body(), Post.class));
    }

    public static void httpPut() throws IOException, InterruptedException {
        TitleUtil.makeTitle("httpPut feature");

        String body = convertObjectToJson(new Post(1, "Test", "Body", 1));

        HttpRequest request = HttpRequest
                .newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        Post post = convertJsonToObject(response.body(), Post.class);
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

    @Data
    static class AnimeResponse {
        private String anime;
        private String character;
        private String quote;
    }

    @Data
    @AllArgsConstructor
    static class Post {
        private Integer id;
        private String title;
        private String body;
        private Integer userId;
    }
}
