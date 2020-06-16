
package com.java.githubeventsextractions.modal;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "push_id",
    "size",
    "distinct_size",
    "ref",
    "head",
    "before",
    "commits"
})
public class Payload {

    @JsonProperty("push_id")
    private Long pushId;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("distinct_size")
    private Integer distinctSize;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("head")
    private String head;
    @JsonProperty("before")
    private String before;
    @JsonProperty("commits")
    private List<Commit> commits = null;

    @JsonProperty("push_id")
    public Long getPushId() {
        return pushId;
    }

    @JsonProperty("push_id")
    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("distinct_size")
    public Integer getDistinctSize() {
        return distinctSize;
    }

    @JsonProperty("distinct_size")
    public void setDistinctSize(Integer distinctSize) {
        this.distinctSize = distinctSize;
    }

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonProperty("head")
    public String getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(String head) {
        this.head = head;
    }

    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return commits;
    }

    @JsonProperty("commits")
    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

}
