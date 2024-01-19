

# PostMessagesSendTemplateRequestMessage

the other information on the message to send - same as /messages/send, but without the html content

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**html** | **String** | optional full HTML content to be sent if not in template |  [optional] |
|**text** | **String** | optional full text content to be sent |  [optional] |
|**subject** | **String** | the message subject |  [optional] |
|**fromEmail** | **String** | the sender email address |  [optional] |
|**fromName** | **String** | optional from name to be used |  [optional] |
|**to** | [**List&lt;PostMessagesSendRequestMessageToInner&gt;**](PostMessagesSendRequestMessageToInner.md) | an array of recipient information. |  [optional] |
|**headers** | **Object** | optional extra headers to add to the message (most headers are allowed) |  [optional] |
|**important** | **Boolean** | whether or not this message is important, and should be delivered ahead of non-important messages |  [optional] |
|**trackOpens** | **Boolean** | whether or not to turn on open tracking for the message |  [optional] |
|**trackClicks** | **Boolean** | whether or not to turn on click tracking for the message |  [optional] |
|**autoText** | **Boolean** | whether or not to automatically generate a text part for messages that are not given text |  [optional] |
|**autoHtml** | **Boolean** | whether or not to automatically generate an HTML part for messages that are not given HTML |  [optional] |
|**inlineCss** | **Boolean** | whether or not to automatically inline all CSS styles provided in the message HTML - only for HTML documents less than 256KB in size |  [optional] |
|**urlStripQs** | **Boolean** | whether or not to strip the query string from URLs when aggregating tracked URL data |  [optional] |
|**preserveRecipients** | **Boolean** | whether or not to expose all recipients in to \&quot;To\&quot; header for each email |  [optional] |
|**viewContentLink** | **Boolean** | set to false to remove content logging for sensitive emails |  [optional] |
|**bccAddress** | **String** | an optional address to receive an exact copy of each recipient&#39;s email |  [optional] |
|**trackingDomain** | **String** | a custom domain to use for tracking opens and clicks instead of mandrillapp.com |  [optional] |
|**signingDomain** | **String** | a custom domain to use for SPF/DKIM signing instead of mandrill (for \&quot;via\&quot; or \&quot;on behalf of\&quot; in email clients) |  [optional] |
|**returnPathDomain** | **String** | a custom domain to use for the messages&#39;s return-path |  [optional] |
|**merge** | **Boolean** | whether to evaluate merge tags in the message. Will automatically be set to true if either merge_vars or global_merge_vars are provided. |  [optional] |
|**mergeLanguage** | [**MergeLanguageEnum**](#MergeLanguageEnum) | the merge tag language to use when evaluating merge tags, either mailchimp or handlebars |  [optional] |
|**globalMergeVars** | [**List&lt;PostMessagesSendRequestMessageGlobalMergeVarsInner&gt;**](PostMessagesSendRequestMessageGlobalMergeVarsInner.md) | global merge variables to use for all recipients. You can override these per recipient. |  [optional] |
|**mergeVars** | [**List&lt;PostMessagesSendRequestMessageMergeVarsInner&gt;**](PostMessagesSendRequestMessageMergeVarsInner.md) | per-recipient merge variables, which override global merge variables with the same name. |  [optional] |
|**tags** | **List&lt;String&gt;** | an array of string to tag the message with. Stats are accumulated using tags, though we only store the first 100 we see, so this should not be unique or change frequently. Tags should be 50 characters or less. Any tags starting with an underscore are reserved for internal use and will cause errors. |  [optional] |
|**subaccount** | **String** | the unique id of a subaccount for this message - must already exist or will fail with an error |  [optional] |
|**googleAnalyticsDomains** | **List&lt;String&gt;** | an array of strings indicating for which any matching URLs will automatically have Google Analytics parameters appended to their query string automatically. |  [optional] |
|**googleAnalyticsCampaign** | **String** | optional string indicating the value to set for the utm_campaign tracking parameter. If this isn&#39;t provided the email&#39;s from address will be used instead. |  [optional] |
|**metadata** | [**PostMessagesSendRequestMessageMetadata**](PostMessagesSendRequestMessageMetadata.md) |  |  [optional] |
|**recipientMetadata** | [**List&lt;PostMessagesSendRequestMessageRecipientMetadataInner&gt;**](PostMessagesSendRequestMessageRecipientMetadataInner.md) | Per-recipient metadata that will override the global values specified in the metadata parameter. |  [optional] |
|**attachments** | [**List&lt;PostMessagesSendRequestMessageAttachmentsInner&gt;**](PostMessagesSendRequestMessageAttachmentsInner.md) | an array of supported attachments to add to the message |  [optional] |
|**images** | [**List&lt;PostMessagesSendRequestMessageImagesInner&gt;**](PostMessagesSendRequestMessageImagesInner.md) | an array of embedded images to add to the message |  [optional] |



## Enum: MergeLanguageEnum

| Name | Value |
|---- | -----|
| MAILCHIMP | &quot;mailchimp&quot; |
| HANDLEBARS | &quot;handlebars&quot; |



