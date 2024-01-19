package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostSendersTimeSeries200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostTemplatesAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesAddRequest;
import io.github.erkoristhein.mailchimp.model.PostTemplatesDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostTemplatesList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostTemplatesListRequest;
import io.github.erkoristhein.mailchimp.model.PostTemplatesPublish200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesRender200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesRenderRequest;
import io.github.erkoristhein.mailchimp.model.PostTemplatesTimeSeriesRequest;
import io.github.erkoristhein.mailchimp.model.PostTemplatesUpdate200Response;
import io.github.erkoristhein.mailchimp.model.PostTemplatesUpdateRequest;

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
public class TemplatesApi {
    private ApiClient apiClient;

    public TemplatesApi() {
        this(new ApiClient());
    }

    public TemplatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add template
     * Add a new template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesAdd200Response postTemplatesAdd(PostTemplatesAddRequest body) throws RestClientException {
        return postTemplatesAddWithHttpInfo(body).getBody();
    }

    /**
     * Add template
     * Add a new template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesAdd200Response> postTemplatesAddWithHttpInfo(PostTemplatesAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesAdd");
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

        ParameterizedTypeReference<PostTemplatesAdd200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesAdd200Response>() {};
        return apiClient.invokeAPI("/templates/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete template
     * Delete a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesDelete200Response postTemplatesDelete(PostTemplatesInfoRequest body) throws RestClientException {
        return postTemplatesDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete template
     * Delete a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesDelete200Response> postTemplatesDeleteWithHttpInfo(PostTemplatesInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesDelete");
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

        ParameterizedTypeReference<PostTemplatesDelete200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesDelete200Response>() {};
        return apiClient.invokeAPI("/templates/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get template info
     * Get the information for an existing template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesInfo200Response postTemplatesInfo(PostTemplatesInfoRequest body) throws RestClientException {
        return postTemplatesInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get template info
     * Get the information for an existing template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesInfo200Response> postTemplatesInfoWithHttpInfo(PostTemplatesInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesInfo");
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

        ParameterizedTypeReference<PostTemplatesInfo200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesInfo200Response>() {};
        return apiClient.invokeAPI("/templates/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List templates
     * Return a list of all the templates available to this user.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostTemplatesList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostTemplatesList200ResponseInner> postTemplatesList(PostTemplatesListRequest body) throws RestClientException {
        return postTemplatesListWithHttpInfo(body).getBody();
    }

    /**
     * List templates
     * Return a list of all the templates available to this user.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostTemplatesList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostTemplatesList200ResponseInner>> postTemplatesListWithHttpInfo(PostTemplatesListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesList");
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

        ParameterizedTypeReference<List<PostTemplatesList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostTemplatesList200ResponseInner>>() {};
        return apiClient.invokeAPI("/templates/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Publish template content
     * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesPublish200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesPublish200Response postTemplatesPublish(PostTemplatesInfoRequest body) throws RestClientException {
        return postTemplatesPublishWithHttpInfo(body).getBody();
    }

    /**
     * Publish template content
     * Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesPublish200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesPublish200Response> postTemplatesPublishWithHttpInfo(PostTemplatesInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesPublish");
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

        ParameterizedTypeReference<PostTemplatesPublish200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesPublish200Response>() {};
        return apiClient.invokeAPI("/templates/publish", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Render html template
     * Inject content and optionally merge fields into a template, returning the HTML that results.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesRender200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesRender200Response postTemplatesRender(PostTemplatesRenderRequest body) throws RestClientException {
        return postTemplatesRenderWithHttpInfo(body).getBody();
    }

    /**
     * Render html template
     * Inject content and optionally merge fields into a template, returning the HTML that results.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesRender200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesRender200Response> postTemplatesRenderWithHttpInfo(PostTemplatesRenderRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesRender");
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

        ParameterizedTypeReference<PostTemplatesRender200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesRender200Response>() {};
        return apiClient.invokeAPI("/templates/render", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get template history
     * Return the recent history (hourly stats for the last 30 days) for a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostSendersTimeSeries200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostSendersTimeSeries200ResponseInner> postTemplatesTimeSeries(PostTemplatesTimeSeriesRequest body) throws RestClientException {
        return postTemplatesTimeSeriesWithHttpInfo(body).getBody();
    }

    /**
     * Get template history
     * Return the recent history (hourly stats for the last 30 days) for a template.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostSendersTimeSeries200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostSendersTimeSeries200ResponseInner>> postTemplatesTimeSeriesWithHttpInfo(PostTemplatesTimeSeriesRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesTimeSeries");
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

        ParameterizedTypeReference<List<PostSendersTimeSeries200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostSendersTimeSeries200ResponseInner>>() {};
        return apiClient.invokeAPI("/templates/time-series", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update template
     * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostTemplatesUpdate200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostTemplatesUpdate200Response postTemplatesUpdate(PostTemplatesUpdateRequest body) throws RestClientException {
        return postTemplatesUpdateWithHttpInfo(body).getBody();
    }

    /**
     * Update template
     * Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostTemplatesUpdate200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostTemplatesUpdate200Response> postTemplatesUpdateWithHttpInfo(PostTemplatesUpdateRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postTemplatesUpdate");
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

        ParameterizedTypeReference<PostTemplatesUpdate200Response> localReturnType = new ParameterizedTypeReference<PostTemplatesUpdate200Response>() {};
        return apiClient.invokeAPI("/templates/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
