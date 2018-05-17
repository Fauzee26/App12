package fauzi.hilmy.app12.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 26FaUZeE02 on 4/26/18.
 */

public class Client {

    public static Service service;

    public static Service getClient() {
        if (service == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://08ad1pao69.execute-api.us-east-1.amazonaws.com")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            service = retrofit.create(Service.class);
        }
        return service;
    }
}
