package com.example.george.materialdesign.deserialize;

import android.util.Log;
import com.example.george.materialdesign.model.DataCharacter;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

/**
 * Created by george on 04/11/15.
 */
public class CharacterDeserializer implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonElement character = json.getAsJsonObject();
        DataCharacter retorno = new DataCharacter();
        CharacterParsingJsonArrayToObject conversor = new CharacterParsingJsonArrayToObject();

        if(json.getAsJsonObject().get("data") != null)
        {
            character = json.getAsJsonObject().get("data");
            if(character.getAsJsonObject().get("results") != null)
            {
                String str = character.getAsJsonObject().get("results").toString();
                InputStream is = new ByteArrayInputStream(str.getBytes());
                try {
                    retorno.setResults(conversor.readJsonStream(is));
                } catch (IOException e) {
                    Log.i("ERRO",e.getMessage());
                }
            }
        }
        return (retorno );
    }
}
