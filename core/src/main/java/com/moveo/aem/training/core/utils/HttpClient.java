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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HttpClient {

    public static String execute( String url ) throws IOException{
        return executeUri(url,new HashMap<>());
    }

    public static String executeUri(String uri, Map<String,String> headerMap) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse responsecoin = null;
        try {
            HttpGet request = new HttpGet(uri);
            if(!headerMap.isEmpty()){
                Iterator<Map.Entry<String, String>> iterator = headerMap.entrySet().iterator();

                while(iterator.hasNext()) {
                    Map.Entry<String, String> entry = iterator.next();
                    String key   = entry.getKey();
                    String value = entry.getValue();
                    request.addHeader(key,value);
                }
            }
            try {
                responsecoin = httpClient.execute(request);
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
