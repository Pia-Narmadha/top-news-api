package com.demo.topnewsapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =true)
public class TopNews {

	String status;
	Integer totalResults;
	List<NewsArticle>  articles;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public List<NewsArticle> getArticles() {
		return articles;
	}
	public void setArticles(List<NewsArticle> articles) {
		this.articles = articles;
	}
}
