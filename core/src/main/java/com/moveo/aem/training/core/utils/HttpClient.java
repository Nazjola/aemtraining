package com.moveo.aem.training.core.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;


public class HttpClient {

    public static String execute( String url ) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet(url);

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    String result = EntityUtils.toString(entity);
//                    System.out.println(result);
                    return result;
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
        return null;
    }

    public static String executeUri( String uri,String apiKey ) throws URISyntaxException,IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            URIBuilder query = new URIBuilder(uri);
            HttpGet request = new HttpGet(query.build());
            request.setHeader(HttpHeaders.ACCEPT, "application/json");
            request.addHeader("X-CMC_PRO_API_KEY", apiKey);

            CloseableHttpResponse responsecoin = httpClient.execute(request);

            try {

                HttpEntity entity = responsecoin.getEntity();
                if (entity != null) {
                    // return it as a String
                    String result = EntityUtils.toString(entity);
//                    System.out.println(result);
                    return result;
                }

            } finally {
                responsecoin.close();
            }
        } finally {
            httpClient.close();
        }
        return null;
    }


}
