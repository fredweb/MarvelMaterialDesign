package com.example.george.materialdesign.commom;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by george on 28/10/15.
 */
public class Commom {

    private static  Commom instance;

    private Commom()
    {

    }

    public static Commom getInstance()
    {
        if(instance==null)
        {
            instance = new Commom();
        }
        return instance;
    }

    /**Metodo que retorna se o dispositivo tem conexão com a Internet
     * @author George Santos
     * @version 1.0
     * */
    public boolean verificarConexao(Context context)
    {
        ConnectivityManager connectivity = (ConnectivityManager)
                context.getSystemService(context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo netInfo = connectivity.getActiveNetworkInfo();

            // Se não existe nenhum tipo de conexão retorna false
            if (netInfo == null) {
                return false;
            }
            int netType = netInfo.getType();
            // Verifica se a conexão é do tipo WiFi ou Mobile e
            // retorna true se estiver conectado ou false em
            // caso contrário
            if (netType == ConnectivityManager.TYPE_WIFI ||
                    netType == ConnectivityManager.TYPE_MOBILE) {
                return netInfo.isConnected();

            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Creates an md5 hash string from the string input
     *
     * @param s  String to be hashed
     * @return
     */
    public static final String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
