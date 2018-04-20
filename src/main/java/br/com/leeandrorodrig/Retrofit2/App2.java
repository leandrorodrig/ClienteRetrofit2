package br.com.leeandrorodrig.Retrofit2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.leeandrorodrig.Retrofit2.api.GitHubService;
import br.com.leeandrorodrig.Retrofit2.api.RetrofitClient;
import br.com.leeandrorodrig.Retrofit2.model.repository.GitHubRepoJava;
import br.com.leeandrorodrig.Retrofit2.model.repository.Item;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    
     {
    	
    	final List<Item> lisItens = new ArrayList<Item>();
    	
        System.out.println( "init" );
        GitHubRepoJava response = null;
		try {
			//Chamada Síncrona
			response = RetrofitClient.createService(GitHubService.class).getRepositiries().execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
       
      lisItens.addAll(response.getItems());
				System.out.println( "Response" );
				
				for (Item item : lisItens) {
	        		System.out.println("Nome do repositório: "+item.getName());
	        		System.out.println("Descrição do Repositório: "+item.getDescription());
	        		System.out.println("Autor: "+item.getOwner().getLogin());
	        		System.out.println("url_avatr: "+item.getOwner().getAvatarUrl());
	        		System.out.println("Stars: "+item.getStargazersCount());
	        		System.out.println("Forks: "+item.getForks());
				}
						     
                	
        	for (Item item : lisItens) {
        		System.out.println("Nome do repositório: "+item.getName());
        		System.out.println("Descrição do Repositório: "+item.getDescription());
        		System.out.println("Autor: "+item.getOwner().getLogin());
        		System.out.println("url_avatr: "+item.getOwner().getAvatarUrl());
        		System.out.println("Stars: "+item.getStargazersCount());
        		System.out.println("Forks: "+item.getForks());
			}
        	
         System.out.println( "end" );
    }
}
