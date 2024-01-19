

# PostSubaccountsInfo200Response

the information about the subaccount

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | a unique indentifier for the subaccount |  [optional] |
|**name** | **String** | an optional display name for the subaccount |  [optional] |
|**notes** | **String** | optional extra text to associate with the subaccount |  [optional] |
|**customQuota** | **Integer** | an optional manual hourly quota for the subaccount. If not specified, the hourly quota will be managed based on reputation |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | the current sending status of the subaccount |  [optional] |
|**reputation** | **Integer** | the subaccount&#39;s current reputation on a scale from 0 to 100 |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the subaccount was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**firstSentAt** | **OffsetDateTime** | the date and time that the subaccount first sent as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**sentWeekly** | **Integer** | the number of emails the subaccount has sent so far this week (weeks start on midnight Monday, UTC) |  [optional] |
|**sentMonthly** | **Integer** | the number of emails the subaccount has sent so far this month (months start on midnight of the 1st, UTC) |  [optional] |
|**sentTotal** | **Integer** | the number of emails the subaccount has sent since it was created |  [optional] |
|**sentHourly** | **Integer** | the number of emails the subaccount has sent in the last hour |  [optional] |
|**hourlyQuota** | **Integer** | the current hourly quota for the subaccount, either manual or reputation-based |  [optional] |
|**last30Days** | [**PostSubaccountsInfo200ResponseLast30Days**](PostSubaccountsInfo200ResponseLast30Days.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| PAUSED | &quot;paused&quot; |



