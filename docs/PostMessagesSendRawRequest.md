

# PostMessagesSendRawRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**rawMessage** | **String** | the full MIME document of an email message |  |
|**fromEmail** | **String** | optionally define the sender address - otherwise we&#39;ll use the address found in the provided headers |  [optional] |
|**fromName** | **String** | optionally define the sender alias |  [optional] |
|**to** | **List&lt;String&gt;** | optionally define the recipient to receive the message - otherwise we&#39;ll use the To, Cc, and Bcc headers provided in the document |  [optional] |
|**async** | **Boolean** | enable a background sending mode that is optimized for bulk sending. In async mode, messages/sendRaw will immediately return a status of \&quot;queued\&quot; for every recipient. To handle rejections when sending in async mode, set up a webhook for the &#39;reject&#39; event. Defaults to false for messages with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously, regardless of the value of async. |  [optional] |
|**ipPool** | **String** | the name of the dedicated ip pool that should be used to send the message. If you do not have any dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your default pool will be used instead. |  [optional] |
|**sendAt** | **OffsetDateTime** | when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify a time in the past, the message will be sent immediately; for future dates, you&#39;re limited to one year from the date of scheduling. |  [optional] |
|**returnPathDomain** | **String** | a custom domain to use for the messages&#39;s return-path |  [optional] |



