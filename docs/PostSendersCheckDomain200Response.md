

# PostSendersCheckDomain200Response

information about the sender domain

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | the sender domain name |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the sending domain was first seen as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**lastTestedAt** | **OffsetDateTime** | when the domain&#39;s DNS settings were last tested as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**spf** | [**PostSendersDomains200ResponseInnerSpf**](PostSendersDomains200ResponseInnerSpf.md) |  |  [optional] |
|**dkim** | [**PostSendersDomains200ResponseInnerDkim**](PostSendersDomains200ResponseInnerDkim.md) |  |  [optional] |
|**verifiedAt** | **OffsetDateTime** | if the domain has been verified, this indicates when that verification occurred as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**validSigning** | **Boolean** | whether this domain can be used to authenticate mail, either for itself or as a custom signing domain. If this is false but spf and dkim are both valid, you will need to verify the domain before using it to authenticate mail |  [optional] |
|**verifyTxtKey** | **String** | a unique key used to verify a domain by adding a TXT record. Append this key to &#39;mandrill_verify.&#39; and add it to your domain&#39;s TXT records to verify |  [optional] |



