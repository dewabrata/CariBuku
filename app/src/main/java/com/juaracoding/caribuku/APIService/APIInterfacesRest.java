package com.juaracoding.caribuku.APIService;

/**
 * Created by user on 1/10/2018.
 */




import com.juaracoding.caribuku.model.buku.ModelBuku;
import com.juaracoding.caribuku.model.category.ModelCategory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;


public interface APIInterfacesRest {

 @GET("names.json")
 Call<ModelCategory> getCategoryBook(@Query("api-key") String apikey);

    @GET
    Call<ModelBuku> getBook(@Url String url , @Query("api-key") String apikey);




}

