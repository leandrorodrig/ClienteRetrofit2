package br.com.leeandrorodrig.Retrofit2.api;

import java.util.List;

import br.com.leeandrorodrig.Retrofit2.model.repository.GitHubRepoJava;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService {
	
	  @GET("/search/repositories?q=language:Java&sort=stars&page=1&per_page=2")
	    Call<GitHubRepoJava> getRepositiries();

}
