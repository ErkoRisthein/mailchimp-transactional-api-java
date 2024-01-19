

# PostMessagesParse200Response

the parsed message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | the subject of the message |  [optional] |
|**fromEmail** | **String** | the email address of the sender |  [optional] |
|**fromName** | **String** | the alias of the sender (if any) |  [optional] |
|**to** | [**List&lt;PostMessagesParse200ResponseToInner&gt;**](PostMessagesParse200ResponseToInner.md) | an array of any recipients in the message |  [optional] |
|**headers** | **Object** | the key-value pairs of the MIME headers for the message&#39;s main document |  [optional] |
|**text** | **String** | the text part of the message, if any |  [optional] |
|**html** | **String** | the HTML part of the message, if any |  [optional] |
|**attachments** | [**List&lt;PostMessagesParse200ResponseAttachmentsInner&gt;**](PostMessagesParse200ResponseAttachmentsInner.md) | an array of any attachments that can be found in the message |  [optional] |
|**images** | [**List&lt;PostMessagesParse200ResponseImagesInner&gt;**](PostMessagesParse200ResponseImagesInner.md) | an array of any embedded images that can be found in the message |  [optional] |



