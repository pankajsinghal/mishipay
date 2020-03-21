package com.mishipay.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class JSONResponseHandler<T> implements ResponseHandler<T>{
    private static final Logger logger = LoggerFactory.getLogger(JSONResponseHandler.class);
    private Gson gson;
    private Class<T> responseClass;

    public JSONResponseHandler(Class<T> responseClass) {
        this.gson = new GsonBuilder().setDateFormat("MM-dd-yyyy HH:mm:ss").create();

        this.responseClass = responseClass;
    }

    @Override
    public T handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

        StatusLine statusLine = response.getStatusLine();
        final HttpEntity entity = response.getEntity();
        if (statusLine.getStatusCode() >= 300) {
            String error = EntityUtils.toString(entity);
            logger.error("error" + error);
            throw new HttpResponseException(statusLine.getStatusCode(), error);
        }

        String responseString = EntityUtils.toString(entity);
        logger.debug("JSONResponseHandler.handleResponse.responseString : " +responseString);
        if (responseString == null || "".equals(responseString)) {
            throw new HttpResponseException(statusLine.getStatusCode(), "received null or empty response");
        }

        T parsedResponse = gson.fromJson(responseString, responseClass);
        return parsedResponse;

    }

}