

# PostMessagesSendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**message** | [**PostMessagesSendRequestMessage**](PostMessagesSendRequestMessage.md) |  |  |
|**async** | **Boolean** | enable a background sending mode that is optimized for bulk sending. In async mode, messages/send will immediately return a status of \&quot;queued\&quot; for every recipient. To handle rejections when sending in async mode, set up a webhook for the &#39;reject&#39; event. Defaults to false for messages with no more than 10 recipients; messages with more than 10 recipients are always sent asynchronously, regardless of the value of async. |  [optional] |
|**ipPool** | **String** | the name of the dedicated ip pool that should be used to send the message. If you do not have any dedicated IPs, this parameter has no effect. If you specify a pool that does not exist, your default pool will be used instead. |  [optional] |
|**sendAt** | **OffsetDateTime** | when this message should be sent as a UTC timestamp in YYYY-MM-DD HH:MM:SS format. If you specify a time in the past, the message will be sent immediately; for future dates, you&#39;re limited to one year from the date of scheduling. |  [optional] |



