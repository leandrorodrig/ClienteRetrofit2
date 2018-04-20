
package br.com.leeandrorodrig.Retrofit2.model.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("full_name")
@Expose
private String fullName;
@SerializedName("owner")
@Expose
private Owner owner;
@SerializedName("html_url")
@Expose
private String htmlUrl;
@SerializedName("description")
@Expose
private String description;
@SerializedName("url")
@Expose
private String url;
@SerializedName("stargazers_count")
@Expose
private Integer stargazersCount;
@SerializedName("forks")
@Expose
private Integer forks;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public Owner getOwner() {
return owner;
}

public void setOwner(Owner owner) {
this.owner = owner;
}

public String getHtmlUrl() {
return htmlUrl;
}

public void setHtmlUrl(String htmlUrl) {
this.htmlUrl = htmlUrl;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Integer getStargazersCount() {
return stargazersCount;
}

public void setStargazersCount(Integer stargazersCount) {
this.stargazersCount = stargazersCount;
}

public Integer getForks() {
return forks;
}

public void setForks(Integer forks) {
this.forks = forks;
}

}