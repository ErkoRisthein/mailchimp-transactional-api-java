

# PostInboundSendRawRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**rawMessage** | **String** | the full MIME document of an email message |  |
|**to** | **List&lt;String&gt;** | optionally define the recipients to receive the message - otherwise we&#39;ll use the To, Cc, and Bcc headers provided in the document |  [optional] |
|**mailFrom** | **String** | the address specified in the MAIL FROM stage of the SMTP conversation. Required for the SPF check. |  [optional] |
|**helo** | **String** | the identification provided by the client mta in the MTA state of the SMTP conversation. Required for the SPF check. |  [optional] |
|**clientAddress** | **String** | the remote MTA&#39;s ip address. Optional; required for the SPF check. |  [optional] |



