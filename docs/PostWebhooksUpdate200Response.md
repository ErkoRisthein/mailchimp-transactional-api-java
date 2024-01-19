

# PostWebhooksUpdate200Response

the information for the updated webhook

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | a unique integer indentifier for the webhook |  [optional] |
|**url** | **String** | The URL that the event data will be posted to |  [optional] |
|**description** | **String** | a description of the webhook |  [optional] |
|**authKey** | **String** | the key used to requests for this webhook |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | The message events that will be posted to the hook |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the webhook was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**lastSentAt** | **OffsetDateTime** | the date and time that the webhook last successfully received events as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**batchesSent** | **Integer** | the number of event batches that have ever been sent to this webhook |  [optional] |
|**eventsSent** | **Integer** | the total number of events that have ever been sent to this webhook |  [optional] |
|**lastError** | **String** | if we&#39;ve ever gotten an error trying to post to this webhook, the last error that we&#39;ve seen |  [optional] |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| SEND | &quot;send&quot; |
| HARD_BOUNCE | &quot;hard_bounce&quot; |
| SOFT_BOUNCE | &quot;soft_bounce&quot; |
| OPEN | &quot;open&quot; |
| CLICK | &quot;click&quot; |
| SPAM | &quot;spam&quot; |
| UNSUB | &quot;unsub&quot; |
| REJECT | &quot;reject&quot; |



