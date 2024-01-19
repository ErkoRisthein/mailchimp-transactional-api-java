/*
 * Mailchimp Transactional API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.model.PostAllowlistsAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsAddRequest;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsListRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllowlistsApi
 */
@Ignore
public class AllowlistsApiTest {

    private final AllowlistsApi api = new AllowlistsApi();

    
    /**
     * Add email to allowlist
     *
     * Adds an email to your email rejection allowlist. If the address is currently on your denylist, that denylist entry will be removed automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAllowlistsAddTest() {
        PostAllowlistsAddRequest body = null;

        PostAllowlistsAdd200Response response = api.postAllowlistsAdd(body);

        // TODO: test validations
    }
    
    /**
     * Remove email from allowlist
     *
     * Removes an email address from the allowlist.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAllowlistsDeleteTest() {
        PostAllowlistsDeleteRequest body = null;

        PostAllowlistsDelete200Response response = api.postAllowlistsDelete(body);

        // TODO: test validations
    }
    
    /**
     * List allowlisted emails
     *
     * Retrieves your email rejection allowlist. You can provide an email address or search prefix to limit the results. Returns up to 1000 results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAllowlistsListTest() {
        PostAllowlistsListRequest body = null;

        List<PostAllowlistsList200ResponseInner> response = api.postAllowlistsList(body);

        // TODO: test validations
    }
    
}
