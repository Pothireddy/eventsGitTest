
package com.java.githubeventsextractions.modal;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "type", "actor", "repo", "payload", "public", "created_at" })
public class Event implements Serializable {

	@JsonProperty("id")
	private String id;
	@JsonProperty("type")
	private String type;
	@JsonProperty("actor")
	private Actor actor;
	@JsonProperty("repo")
	private Repo repo;
	@JsonProperty("payload")
	private Payload payload;
	@JsonProperty("public")
	private Boolean _public;
	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("actor")
	public Actor getActor() {
		return actor;
	}

	@JsonProperty("actor")
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@JsonProperty("repo")
	public Repo getRepo() {
		return repo;
	}

	@JsonProperty("repo")
	public void setRepo(Repo repo) {
		this.repo = repo;
	}

	@JsonProperty("payload")
	public Payload getPayload() {
		return payload;
	}

	@JsonProperty("payload")
	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	@JsonProperty("public")
	public Boolean getPublic() {
		return _public;
	}

	@JsonProperty("public")
	public void setPublic(Boolean _public) {
		this._public = _public;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
