package com.fabricio.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnpedra;
    private Button btntesoura;
    private Button btnpapel;
    private Button btnjogar;
    private ImageView imgmao;
    private TextView txt3;
    private int MaoEscolhida;
    private int MaoComputador;
    private TextView txtinfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpedra = (Button) findViewById(R.id.btnpedra);
        btnpedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinfo = (TextView) findViewById(R.id.txtinfo);
                txtinfo.setText("Pedra");
                MaoEscolhida = 1;
            }
        });
        btntesoura = (Button) findViewById(R.id.btntesoura);
        btntesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinfo = (TextView) findViewById(R.id.txtinfo);
                txtinfo.setText("Tesoura");
                MaoEscolhida = 2;
            }
        });
        btnpapel = (Button) findViewById(R.id.btnpapel);
        btnpapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtinfo = (TextView) findViewById(R.id.txtinfo);
                txtinfo.setText("Papel");
                MaoEscolhida = 3;
            }
        });
        btnjogar = (Button) findViewById(R.id.btnjogar);
        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MaoEscolhida!=0) {
                    txt3 = (TextView) findViewById(R.id.txt3);
                    txt3.setText("");
                    MaoComputador = new Random().nextInt(3)+1;
                    if (MaoComputador == 1) {
                        imgmao = (ImageView) findViewById(R.id.imgmao);
                        imgmao.setImageResource(R.drawable.pedra);
                    } else if (MaoComputador == 2) {
                        imgmao = (ImageView) findViewById(R.id.imgmao);
                        imgmao.setImageResource(R.drawable.tesoura);
                    } else if (MaoComputador ==3){
                        imgmao = (ImageView) findViewById(R.id.imgmao);
                        imgmao.setImageResource(R.drawable.papel);
                    }
                    //mao pedra
                    if (MaoEscolhida==1 && MaoComputador==1) {
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Empatou!!!");

                    } else if (MaoEscolhida==1 && MaoComputador==2) {
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Ganhou!!!");
                    } else if (MaoEscolhida==1 && MaoComputador==3){
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Perdeu!!!");
                    }
                    //mao tesoura
                    else if (MaoEscolhida==2 && MaoComputador==2) {
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Empatou!!!");
                    } else if (MaoEscolhida==2 && MaoComputador==3){
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Ganhou!!!");
                    }
                    else if (MaoEscolhida==2 && MaoComputador==1){
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Perdeu!!!");
                    }
                    //mao papel
                    else if (MaoEscolhida==3 && MaoComputador==3) {
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Empatou!!!");
                    } else if (MaoEscolhida==3 && MaoComputador==1){
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Ganhou!!!");
                    }
                    else if (MaoEscolhida==3 && MaoComputador==2){
                        txt3 = (TextView) findViewById(R.id.txt3);
                        txt3.setText("Você Perdeu!!!");
                    }
                }
            }
        });
    }
}
