

# PostMessagesSend200ResponseInner

the sending results for a single recipient

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | the email address of the recipient |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | the sending status of the recipient |  [optional] |
|**rejectReason** | [**RejectReasonEnum**](#RejectReasonEnum) | the reason for the rejection if the recipient status is \&quot;rejected\&quot; |  [optional] |
|**queuedReason** | [**QueuedReasonEnum**](#QueuedReasonEnum) | the reason for the email being queued if the response status is \&quot;queued\&quot; |  [optional] |
|**id** | **String** | the message&#39;s unique id |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| QUEUED | &quot;queued&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| REJECTED | &quot;rejected&quot; |
| INVALID | &quot;invalid&quot; |



## Enum: RejectReasonEnum

| Name | Value |
|---- | -----|
| HARD_BOUNCE | &quot;hard-bounce&quot; |
| SOFT_BOUNCE | &quot;soft-bounce&quot; |
| SPAM | &quot;spam&quot; |
| UNSUB | &quot;unsub&quot; |
| CUSTOM | &quot;custom&quot; |
| INVALID_SENDER | &quot;invalid-sender&quot; |
| INVALID | &quot;invalid&quot; |
| TEST_MODE_LIMIT | &quot;test-mode-limit&quot; |
| UNSIGNED | &quot;unsigned&quot; |
| RULE | &quot;rule&quot; |



## Enum: QueuedReasonEnum

| Name | Value |
|---- | -----|
| ATTACHMENTS | &quot;attachments&quot; |
| MULTIPLE_RECIPIENTS | &quot;multiple-recipients&quot; |
| FREE_TRIAL_SENDS_EXHAUSTED | &quot;free-trial-sends-exhausted&quot; |
| HOURLY_QUOTA_EXHAUSTED | &quot;hourly-quota-exhausted&quot; |
| MONTHLY_LIMIT_REACHED | &quot;monthly-limit-reached&quot; |
| SENDING_PAUSED | &quot;sending-paused&quot; |
| SENDING_SUSPENDED | &quot;sending-suspended&quot; |
| ACCOUNT_SUSPENDED | &quot;account-suspended&quot; |
| SENDING_BACKLOGGED | &quot;sending-backlogged&quot; |



