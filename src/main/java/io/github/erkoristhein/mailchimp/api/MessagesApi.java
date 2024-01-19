package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostMessagesCancelScheduledRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesContent200Response;
import io.github.erkoristhein.mailchimp.model.PostMessagesInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostMessagesInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesListScheduled200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesListScheduledRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesParse200Response;
import io.github.erkoristhein.mailchimp.model.PostMessagesParseRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesRescheduleRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesSearch200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSearchRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesSearchTimeSeries200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSearchTimeSeriesRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesSend200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRawRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendRequest;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendTemplate200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMessagesSendTemplateRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class MessagesApi {
    private ApiClient apiClient;

    public MessagesApi() {
        this(new ApiClient());
    }

    public MessagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel scheduled email
     * Cancels a scheduled email.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesListScheduled200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesListScheduled200ResponseInner> postMessagesCancelScheduled(PostMessagesCancelScheduledRequest body) throws RestClientException {
        return postMessagesCancelScheduledWithHttpInfo(body).getBody();
    }

    /**
     * Cancel scheduled email
     * Cancels a scheduled email.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesListScheduled200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesListScheduled200ResponseInner>> postMessagesCancelScheduledWithHttpInfo(PostMessagesCancelScheduledRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesCancelScheduled");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/cancel-scheduled", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get message content
     * Get the full content of a recently sent message.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMessagesContent200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMessagesContent200Response postMessagesContent(PostMessagesInfoRequest body) throws RestClientException {
        return postMessagesContentWithHttpInfo(body).getBody();
    }

    /**
     * Get message content
     * Get the full content of a recently sent message.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMessagesContent200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMessagesContent200Response> postMessagesContentWithHttpInfo(PostMessagesInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesContent");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostMessagesContent200Response> localReturnType = new ParameterizedTypeReference<PostMessagesContent200Response>() {};
        return apiClient.invokeAPI("/messages/content", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get message info
     * Get the information for a single recently sent message.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMessagesInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMessagesInfo200Response postMessagesInfo(PostMessagesInfoRequest body) throws RestClientException {
        return postMessagesInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get message info
     * Get the information for a single recently sent message.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMessagesInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMessagesInfo200Response> postMessagesInfoWithHttpInfo(PostMessagesInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesInfo");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostMessagesInfo200Response> localReturnType = new ParameterizedTypeReference<PostMessagesInfo200Response>() {};
        return apiClient.invokeAPI("/messages/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List scheduled emails
     * Queries your scheduled emails.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesListScheduled200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesListScheduled200ResponseInner> postMessagesListScheduled(PostMessagesListScheduledRequest body) throws RestClientException {
        return postMessagesListScheduledWithHttpInfo(body).getBody();
    }

    /**
     * List scheduled emails
     * Queries your scheduled emails.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesListScheduled200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesListScheduled200ResponseInner>> postMessagesListScheduledWithHttpInfo(PostMessagesListScheduledRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesListScheduled");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/list-scheduled", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Parse mime document
     * Parse the full MIME document for an email message, returning the content of the message broken into its constituent pieces.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMessagesParse200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMessagesParse200Response postMessagesParse(PostMessagesParseRequest body) throws RestClientException {
        return postMessagesParseWithHttpInfo(body).getBody();
    }

    /**
     * Parse mime document
     * Parse the full MIME document for an email message, returning the content of the message broken into its constituent pieces.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMessagesParse200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMessagesParse200Response> postMessagesParseWithHttpInfo(PostMessagesParseRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesParse");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostMessagesParse200Response> localReturnType = new ParameterizedTypeReference<PostMessagesParse200Response>() {};
        return apiClient.invokeAPI("/messages/parse", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reschedule email
     * Reschedules a scheduled email.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesListScheduled200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesListScheduled200ResponseInner> postMessagesReschedule(PostMessagesRescheduleRequest body) throws RestClientException {
        return postMessagesRescheduleWithHttpInfo(body).getBody();
    }

    /**
     * Reschedule email
     * Reschedules a scheduled email.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesListScheduled200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesListScheduled200ResponseInner>> postMessagesRescheduleWithHttpInfo(PostMessagesRescheduleRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesReschedule");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesListScheduled200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/reschedule", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search messages by date
     * Search recently sent messages and optionally narrow by date range, tags, senders, and API keys. If no date range is specified, results within the last 7 days are returned. This method may be called up to 20 times per minute. If you need the data more often, you can use /messages/info.json to get the information for a single message, or webhooks to push activity to your own application for querying.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesSearch200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesSearch200ResponseInner> postMessagesSearch(PostMessagesSearchRequest body) throws RestClientException {
        return postMessagesSearchWithHttpInfo(body).getBody();
    }

    /**
     * Search messages by date
     * Search recently sent messages and optionally narrow by date range, tags, senders, and API keys. If no date range is specified, results within the last 7 days are returned. This method may be called up to 20 times per minute. If you need the data more often, you can use /messages/info.json to get the information for a single message, or webhooks to push activity to your own application for querying.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesSearch200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesSearch200ResponseInner>> postMessagesSearchWithHttpInfo(PostMessagesSearchRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesSearch");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesSearch200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesSearch200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search messages by hour
     * Search the content of recently sent messages and return the aggregated hourly stats for matching messages.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesSearchTimeSeries200ResponseInner> postMessagesSearchTimeSeries(PostMessagesSearchTimeSeriesRequest body) throws RestClientException {
        return postMessagesSearchTimeSeriesWithHttpInfo(body).getBody();
    }

    /**
     * Search messages by hour
     * Search the content of recently sent messages and return the aggregated hourly stats for matching messages.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesSearchTimeSeries200ResponseInner>> postMessagesSearchTimeSeriesWithHttpInfo(PostMessagesSearchTimeSeriesRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesSearchTimeSeries");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesSearchTimeSeries200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesSearchTimeSeries200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/search-time-series", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send new message
     * Send a new transactional message through the Transactional API.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesSend200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesSend200ResponseInner> postMessagesSend(PostMessagesSendRequest body) throws RestClientException {
        return postMessagesSendWithHttpInfo(body).getBody();
    }

    /**
     * Send new message
     * Send a new transactional message through the Transactional API.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesSend200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesSend200ResponseInner>> postMessagesSendWithHttpInfo(PostMessagesSendRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesSend");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesSend200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesSend200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/send", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send mime document
     * Take a raw MIME document for a message, and send it exactly as if it were sent through the Transactional API&#39;s SMTP servers.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postMessagesSendRaw(PostMessagesSendRawRequest body) throws RestClientException {
        return postMessagesSendRawWithHttpInfo(body).getBody();
    }

    /**
     * Send mime document
     * Take a raw MIME document for a message, and send it exactly as if it were sent through the Transactional API&#39;s SMTP servers.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postMessagesSendRawWithHttpInfo(PostMessagesSendRawRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesSendRaw");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/messages/send-raw", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send using message template
     * Send a new transactional message through the Transactional API using a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMessagesSendTemplate200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMessagesSendTemplate200ResponseInner> postMessagesSendTemplate(PostMessagesSendTemplateRequest body) throws RestClientException {
        return postMessagesSendTemplateWithHttpInfo(body).getBody();
    }

    /**
     * Send using message template
     * Send a new transactional message through the Transactional API using a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMessagesSendTemplate200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMessagesSendTemplate200ResponseInner>> postMessagesSendTemplateWithHttpInfo(PostMessagesSendTemplateRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMessagesSendTemplate");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostMessagesSendTemplate200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMessagesSendTemplate200ResponseInner>>() {};
        return apiClient.invokeAPI("/messages/send-template", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
