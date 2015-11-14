package com.example.george.materialdesign.deserialize;

import com.example.george.materialdesign.model.Character;
import com.example.george.materialdesign.model.DataCharacter;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 04/11/15.
 */
public class CharacterDeserializer implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonElement character = json.getAsJsonObject();
        DataCharacter retorno = new DataCharacter();

        if(json.getAsJsonObject().get("data") != null)
        {
            character =json.getAsJsonObject().get("data");
            if(character.getAsJsonObject().get("results")!=null)
            {
                Type type = new TypeToken<ArrayList<Character>>() {}.getType();
                return  new Gson().fromJson(character.getAsJsonObject().get("results"), type);
            }
        }
        return (retorno );
    }
}
