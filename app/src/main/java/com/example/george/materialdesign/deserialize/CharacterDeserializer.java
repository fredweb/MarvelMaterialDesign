package com.example.george.materialdesign.deserialize;

import com.example.george.materialdesign.model.Character;
import com.example.george.materialdesign.model.DataCharacter;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by george on 04/11/15.
 */
public class CharacterDeserializer implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonElement character = json.getAsJsonObject();
        if(json.getAsJsonObject().get("data") != null)
        {
            character =json.getAsJsonObject().get("data");
        }
        DataCharacter retorno = new Gson().fromJson(character, DataCharacter.class);
        return (retorno );
    }
}
