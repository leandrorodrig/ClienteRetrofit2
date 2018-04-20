package br.com.leeandrorodrig.Retrofit2.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

	private final static String BASE_URL = "https://api.github.com";

	private static Retrofit retrofit = new Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build();

	public static GitHubService getCliente() {
		return retrofit.create(GitHubService.class);
	};
	
	 public static <S> S createService(Class<S> serviceClass) {
		        return retrofit.create(serviceClass);
 }

}
