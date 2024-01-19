

# PostWebhooksUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**id** | **BigDecimal** | the unique identifier of a webhook belonging to this account |  |
|**url** | **String** | the URL to POST batches of events. Requires webhook to exist. |  |
|**description** | **String** | an optional description of the webhook |  [optional] |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | an optional list of events that will be posted to the webhook |  [optional] |



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
| BLACKLIST | &quot;blacklist&quot; |
| WHITELIST | &quot;whitelist&quot; |



