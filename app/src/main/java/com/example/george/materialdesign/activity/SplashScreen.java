package com.example.george.materialdesign.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.example.george.materialdesign.commom.Commom;
import com.example.george.materialdesign.MainActivity;
import com.example.george.materialdesign.R;

/**
 * Created by george on 28/10/15.
 */
public class SplashScreen extends Activity implements Runnable {

    private boolean conection;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        //Retirar Titulo da Activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Tornala FullScreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        context = this.getApplicationContext();
        conection = Commom.getInstance().verificarConexao(context);
        if(conection == true){
            //Fazer a Activity esperar 3 segundos para mudar
            Handler handler = new Handler();
            handler.postDelayed(this, 5000);
        }else
        {
            fecharAplicacao();
        }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            startActivity(new Intent(this, MainActivity.class));
        }catch (Exception ex)
        {
            Log.e("Erro",ex.getMessage());

        }finally {
            finish();
        }
    }


    private void fecharAplicacao()
    {
        AlertDialog alerta = new AlertDialog.Builder(this).create();
        alerta.setTitle("Alerta!!");
        alerta.setMessage("O dispositivo necessita está conectado a internet!");
        alerta.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alerta.setIcon(R.drawable.alert);
        alerta.show();

    }
}