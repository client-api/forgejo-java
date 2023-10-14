

# CombinedStatus

CombinedStatus holds the combined state of several statuses for a single commit

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commitUrl** | **String** |  |  [optional] |
|**repository** | [**Repository**](Repository.md) |  |  [optional] |
|**sha** | **String** |  |  [optional] |
|**state** | **String** | CommitStatusState holds the state of a CommitStatus It can be \&quot;pending\&quot;, \&quot;success\&quot;, \&quot;error\&quot;, \&quot;failure\&quot;, and \&quot;warning\&quot; |  [optional] |
|**statuses** | [**List&lt;CommitStatus&gt;**](CommitStatus.md) |  |  [optional] |
|**totalCount** | **Long** |  |  [optional] |
|**url** | **String** |  |  [optional] |



