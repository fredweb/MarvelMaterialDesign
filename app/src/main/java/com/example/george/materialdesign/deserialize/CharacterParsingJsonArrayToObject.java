package com.example.george.materialdesign.deserialize;

import com.example.george.materialdesign.model.*;
import com.example.george.materialdesign.model.Character;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 14/11/15.
 */
public class CharacterParsingJsonArrayToObject extends BaseParsingJsonArray {

    public List<Character> readJsonStream(InputStream in) throws IOException {
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            return readCharacterArray(reader);
        } finally {
            reader.close();
        }
    }


    private List<Character> readCharacterArray(JsonReader reader) throws IOException {
        List<Character> character = new ArrayList<Character>();

        reader.beginArray();
        while (reader.hasNext()) {
            character.add(readCharacter(reader));
        }
        reader.endArray();
        return character;
    }

    private Character readCharacter(JsonReader reader) throws IOException {
        Character character = new Character();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("id")) {
                character.setId(reader.nextInt());
            } else if (name.equals("name")) {
                character.setName(reader.nextString());
            } else if (name.equals("description")) {
                character.setDescription(reader.nextString());
            }else if (name.equals("modified")) {
                character.setModified(reader.nextString());
            }else if (name.equals("resourceURI")) {
                character.setResourceURI(reader.nextString());
            }else if (name.equals("thumbnail") && reader.peek() != JsonToken.NULL) {
                character.setTumbnail(readThumbnail(reader));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return character;
    }
}
