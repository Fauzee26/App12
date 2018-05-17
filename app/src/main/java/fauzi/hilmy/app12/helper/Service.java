package fauzi.hilmy.app12.helper;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 26FaUZeE02 on 4/26/18.
 */

public interface Service {

    @GET("/dev/random_ten")
    Call<JsonArray> readQuoteArray();
}
