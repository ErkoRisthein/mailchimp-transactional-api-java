

# PostExportsActivity200Response

information about the activity export job that was started

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | the unique identifier for this Export. Use this identifier when checking the export job&#39;s status |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the export job was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**type** | **String** | the type of the export job |  [optional] |
|**finishedAt** | **OffsetDateTime** | the date and time that the export job was finished as a UTC string in YYYY-MM-DD HH:MM:SS format, or null for jobs that have not run |  [optional] |
|**state** | **String** | the export job&#39;s state |  [optional] |
|**resultUrl** | **String** | the url for the export job&#39;s results, if the job is complete |  [optional] |



