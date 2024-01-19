

# PostExportsInfo200Response

the information about the export

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the unique identifier for this Export. Use this identifier when checking the export job&#39;s status |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the export job was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**type** | **String** | the type of the export job - activity, reject, or allowlist |  [optional] |
|**finishedAt** | **OffsetDateTime** | the date and time that the export job was finished as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**state** | **String** | the export job&#39;s state - waiting, working, complete, error, or expired. |  [optional] |
|**resultUrl** | **String** | the url for the export job&#39;s results, if the job is completed. |  [optional] |



