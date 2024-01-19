

# PostUsersInfo200Response

the user information including username, key, reputation, quota, and historical sending stats

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | the username of the user (used for SMTP authentication) |  [optional] |
|**createdAt** | **String** | the date and time that the user&#39;s Mandrill account was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**publicId** | **String** | a unique, permanent identifier for this user |  [optional] |
|**reputation** | **Integer** | the reputation of the user on a scale from 0 to 100, with 75 generally being a \&quot;good\&quot; reputation |  [optional] |
|**hourlyQuota** | **Integer** | the maximum number of emails Mandrill will deliver for this user each hour. Any emails beyond that will be accepted and queued for later delivery. Users with higher reputations will have higher hourly quotas |  [optional] |
|**backlog** | **Integer** | the number of emails that are queued for delivery due to exceeding your monthly or hourly quotas |  [optional] |
|**stats** | [**PostUsersInfo200ResponseStats**](PostUsersInfo200ResponseStats.md) |  |  [optional] |



