

# PostRejectsList200ResponseInner

the information for each rejection  entry

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | the email that is blocked |  [optional] |
|**reason** | **String** | the type of event (hard-bounce, soft-bounce, spam, unsub, custom) that caused this rejection |  [optional] |
|**detail** | **String** | extended details about the event, such as the SMTP diagnostic for bounces or the comment for manually-created rejections |  [optional] |
|**createdAt** | **OffsetDateTime** | when the email was added to the denylist |  [optional] |
|**lastEventAt** | **OffsetDateTime** | the timestamp of the most recent event that either created or renewed this rejection |  [optional] |
|**expiresAt** | **OffsetDateTime** | when the denylist entry will expire (this may be in the past) |  [optional] |
|**expired** | **Boolean** | whether the denylist entry has expired |  [optional] |
|**sender** | [**PostRejectsList200ResponseInnerSender**](PostRejectsList200ResponseInnerSender.md) |  |  [optional] |
|**subaccount** | **String** | the subaccount that this denylist entry applies to, or null if none. |  [optional] |



