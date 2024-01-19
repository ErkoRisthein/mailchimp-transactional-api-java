

# PostExportsActivityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**notifyEmail** | **String** | an optional email address to notify when the export job has finished |  [optional] |
|**dateFrom** | **OffsetDateTime** | start date as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**dateTo** | **OffsetDateTime** | end date as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**tags** | **List&lt;String&gt;** | an array of tag names to narrow the export to; will match messages that contain ANY of the tags |  [optional] |
|**senders** | **List&lt;String&gt;** | an array of senders to narrow the export to |  [optional] |
|**states** | [**List&lt;StatesEnum&gt;**](#List&lt;StatesEnum&gt;) | an array of message states to narrow the export to; messages with ANY of the states will be included |  [optional] |
|**apiKeys** | **List&lt;String&gt;** | an array of api keys to narrow the export to; messsagse sent with ANY of the keys will be included |  [optional] |



## Enum: List&lt;StatesEnum&gt;

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| REJECTED | &quot;rejected&quot; |
| BOUNCED | &quot;bounced&quot; |
| SOFT_BOUNCED | &quot;soft-bounced&quot; |
| SPAM | &quot;spam&quot; |
| UNSUB | &quot;unsub&quot; |



