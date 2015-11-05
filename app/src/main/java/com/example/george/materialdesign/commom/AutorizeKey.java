package com.example.george.materialdesign.commom;

import java.security.Timestamp;
import java.util.Date;
import java.util.Random;

/**
 * Created by george on 02/11/15.
 */
public class AutorizeKey
{

    private static  AutorizeKey instance;

    private AutorizeKey()
    {

    }

    public static AutorizeKey getInstance()
    {
        if(instance==null)
        {
            instance = new AutorizeKey();
        }
        return instance;
    }


    private static final String urlBase = "http://gateway.marvel.com";
    private static final String publicKey = "0dbe24ffe58d6d1d5e5d15061d65a3df";
    private static final String privateKey = "a08ae314ca0a63d7eaeb5de468c9a8a1c98b4d4c";
    private Random gerador = new Random();

    public String getUrlCharacter()
   {
       Integer ts = gerador.nextInt();
       String retorno = urlBase + "v1/public/characters?apikey="+publicKey+"&ts="+ts.toString()+"&hash="+ Commom.getInstance().md5(ts.toString()+privateKey+publicKey);
       return retorno;
   }

    public String getUrlBase()
    {
        return urlBase;
    }

    public String getTimeStamp()
    {
        Integer ts = gerador.nextInt();
        return ts.toString();
    }

    public String getkey(String t)
    {
        return Commom.getInstance().md5(t+privateKey+publicKey);
    }

    public String getPublicKey()
    {
        return this.publicKey;
    }

}
