package com.andy.http;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 23:53
 **/
public class Http2Examples {

    public static void main(String[] args) throws Exception {
        test2();
    }

    public static void test1() throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse httpResponse = httpClient.send(HttpRequest.newBuilder(new URI("http://www.baidu.com")).GET().build(),
                HttpResponse.BodyHandler.asString()
        );
        int code = httpResponse.statusCode();
        System.out.println(code);
        System.out.println(httpResponse.body().toString());
    }

    public static void test2() throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.baidu.com"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
        System.out.println(resp.body());
    }

}
