

# PostMessagesContent200Response

the content of the message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ts** | **Integer** | the Unix timestamp from when this message was sent |  [optional] |
|**id** | **String** | the message&#39;s unique id |  [optional] |
|**fromEmail** | **String** | the email address of the sender |  [optional] |
|**fromName** | **String** | the alias of the sender (if any) |  [optional] |
|**subject** | **String** | the message&#39;s subject line |  [optional] |
|**to** | [**PostMessagesContent200ResponseTo**](PostMessagesContent200ResponseTo.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | list of tags on this message |  [optional] |
|**headers** | **Object** | the key-value pairs of the custom MIME headers for the message&#39;s main document |  [optional] |
|**text** | **String** | the text part of the message, if any |  [optional] |
|**html** | **String** | the HTML part of the message, if any |  [optional] |
|**attachments** | [**List&lt;PostMessagesContent200ResponseAttachmentsInner&gt;**](PostMessagesContent200ResponseAttachmentsInner.md) | an array of any attachments that can be found in the message |  [optional] |



