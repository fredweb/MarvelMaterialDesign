package com.example.george.materialdesign.Interface;

import com.example.george.materialdesign.model.Character;
import com.example.george.materialdesign.model.DataCharacter;

import java.util.List;
import java.util.Map;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by george on 04/11/15.
 */
public interface CharacterInterface {
        // Request method and URL specified in the annotation
        // Callback for the parsed response is the last parameter

        @GET("/v1/public/characters")
        Call<DataCharacter> getCharaters(
                @Query("ts") String ts,
                @Query("apikey") String publicKey,
                @Query("hash") String hash
        );

    @GET("/v1/public/characters/{characterId}")
    Call<DataCharacter> getCharacterId(
            @Path("characterId") String characterId,
            @Query("ts") String ts,
            @Query("apikey") String publicKey,
            @Query("hash") String hash
    );

}
