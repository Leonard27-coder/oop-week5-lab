package com.zut;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ContactAPI {


public static void main(String[] args) {

    try {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://jsonplaceholder.typicode.com/users/1"
                ))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );

        System.out.println("HTTP Status: "
                + response.statusCode());

        System.out.println("Contact from API:");

        System.out.println(response.body());

    } catch (Exception e) {
        System.out.println(
                "API request failed: " + e.getMessage()
        );
    }
}


}
