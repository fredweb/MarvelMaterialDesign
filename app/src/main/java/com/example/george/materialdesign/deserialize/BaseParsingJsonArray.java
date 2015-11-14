package com.example.george.materialdesign.deserialize;

import com.example.george.materialdesign.model.Character;

import com.example.george.materialdesign.model.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by george on 14/11/15.
 */
public class BaseParsingJsonArray
{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    protected Thumbnail readThumbnail(JsonReader reader) throws IOException {
        Thumbnail thumbnail = new Thumbnail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("path")) {
                thumbnail.setPath(reader.nextString());
            }else if(name.equals("extension"))
            {
                thumbnail.setExtension(reader.nextString());
            }else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return thumbnail;
    }


    protected List<Url> readUrlArray(JsonReader reader) throws IOException {
        List<Url> url = new ArrayList<Url>();
        reader.beginArray();
        while (reader.hasNext()) {
            url.add(readUrl(reader));
        }
        reader.endArray();
        return url;
    }

    protected Url readUrl(JsonReader reader) throws IOException {
        Url url = new Url();
        reader.beginArray();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                url.setType(reader.nextString());
            }else if (name.equals("url"))
            {
                url.setUrl(reader.nextString());
            } else {
                reader.skipValue();
            }
        }
        reader.endArray();
        return url;
    }

    protected List<ItensURI> readItensURIArray(JsonReader reader) throws IOException {
        List<ItensURI> itensURI = new ArrayList<>();
        reader.beginArray();
        while (reader.hasNext()) {
            itensURI.add(readItensURI(reader));
        }
        reader.endArray();
        return itensURI;
    }

    protected ItensURI readItensURI(JsonReader reader) throws IOException {
        ItensURI itensURI = new ItensURI();
        reader.beginArray();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("resourceURI")) {
                itensURI.setResourceURI(reader.nextString());
            }else if(name.equals("name"))
            {
                itensURI.setName(reader.nextString());
            }else if(name.equals("type"))
            {
                itensURI.setType(reader.nextString());
            }else if(name.equals("role"))
            {
                itensURI.setRole(reader.nextString());
            }else {
                reader.skipValue();
            }
        }
        reader.endArray();
        return itensURI;
    }


}
