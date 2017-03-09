package com.elicastrillon.mycalculadora;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
Button eSiete,eOcho,eNueve,eSumar,eCuatro,eCinco,eSeis,eRestar,eUno,eDos,eTres,eMultiplicar;
Button ePunto,eCero,eIgual,eDividir,eCalcular,eLimpiar,eSalir;
TextView texVResultado;
String dato = "";
boolean  principio = true;
Double resultado =0.0,resulF=0.0;
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // impedir que la pantalla rote
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // castin
       eSiete = (Button) findViewById(R.id.eSiete);
        eOcho = (Button) findViewById(R.id.eOcho);
        eNueve = (Button) findViewById(R.id.eNueve);
        eSumar = (Button) findViewById(R.id.eSumar);
        eCuatro = (Button) findViewById(R.id.eCuatro);
        eCinco = (Button) findViewById(R.id.eCinco);
        eSeis = (Button) findViewById(R.id.eSeis);
        eRestar = (Button) findViewById(R.id.eRestar);
        eUno = (Button) findViewById(R.id.eUno);
        eDos = (Button) findViewById(R.id.eDos);
        eTres = (Button) findViewById(R.id.eTres);
        eMultiplicar = (Button) findViewById(R.id.eMultiplicar);
        ePunto = (Button) findViewById(R.id.ePunto);
        eCero = (Button) findViewById(R.id.eCero);
        eIgual = (Button) findViewById(R.id.eIgual);
        eDividir = (Button) findViewById(R.id.eDividir);
        eCalcular = (Button) findViewById(R.id.eCalcular);
        eLimpiar = (Button) findViewById(R.id.eLimpiar);
        eSalir = (Button) findViewById(R.id.eSalir);
        texVResultado = (TextView) findViewById(R.id.texVResultado);




        // boton sumar
         eSumar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    resultado = Double.parseDouble(texVResultado.getText().toString());
                    resulF = resulF + resultado;
                    texVResultado.setText("");
                    i = 0;

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();
                }
            }});
        // boton restar
        eRestar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                resultado=Double.parseDouble(texVResultado.getText().toString());
                texVResultado.setText("");
                i=1;
                }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
            }
        });
        //boton multiplicar
        eMultiplicar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                resultado=Double.parseDouble(texVResultado.getText().toString());
                texVResultado.setText("");
                i=2;
                }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
            }
        });
        // boton dividir
        eDividir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                resultado=Double.parseDouble(texVResultado.getText().toString());
                texVResultado.setText("");
                i=3;
                }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
            }
        });

        // excepcion por si hoy datos



            // boton calcular operacion
            eCalcular.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (i == 0) {
                        try {


                        resulF = resulF + Double.parseDouble(texVResultado.getText().toString());
                        texVResultado.setText("" + String.valueOf(resulF));
                        resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else if (i == 1) {
                        try {
                        resulF = resultado - Double.parseDouble(texVResultado.getText().toString());
                        texVResultado.setText("" + String.valueOf(resulF));
                        resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else if (i == 2) {
                        try {
                        resulF = resultado * Double.parseDouble(texVResultado.getText().toString());
                        texVResultado.setText("" + String.valueOf(resulF));
                        resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else {
                        try {
                        resulF = resultado / Double.parseDouble(texVResultado.getText().toString());
                        texVResultado.setText("" + String.valueOf(resulF));
                        resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    }

                }
            });


            // boton igual

            eIgual.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (i == 0) {
                        try {


                            resulF = resulF + Double.parseDouble(texVResultado.getText().toString());
                            texVResultado.setText("" + String.valueOf(resulF));
                            resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else if (i == 1) {
                        try {
                            resulF = resultado - Double.parseDouble(texVResultado.getText().toString());
                            texVResultado.setText("" + String.valueOf(resulF));
                            resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else if (i == 2) {
                        try {
                            resulF = resultado * Double.parseDouble(texVResultado.getText().toString());
                            texVResultado.setText("" + String.valueOf(resulF));
                            resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    } else {
                        try {
                            resulF = resultado / Double.parseDouble(texVResultado.getText().toString());
                            texVResultado.setText("" + String.valueOf(resulF));
                            resulF = 0.0;
                        }catch (Exception e){Toast.makeText(getApplicationContext(), "El campo está vacío", Toast.LENGTH_SHORT).show();}
                    }

                }
            });





        // limpiar campo
        eLimpiar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
          texVResultado.setText("");
                resultado=0.0;
                resulF=0.0;
            }
        });
        // salir
        eSalir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


    }



// recibiendo en View al dar clik en un boton

    @Override
    public void onClick(View v) {
        int id = v.getId();


        switch (id){
            case R.id.eSiete:
                dato = eSiete.getText().toString();
                break;
            case R.id.eOcho:
                dato = eOcho.getText().toString();
                break;
            case R.id.eNueve:
                dato = eNueve.getText().toString();
                break;

            case R.id.eCuatro:
                dato = eCuatro.getText().toString();
                break;
            case R.id.eCinco:
                dato = eCinco.getText().toString();
                break;
            case R.id.eSeis:
                dato = eSeis.getText().toString();
                break;

            case R.id.eUno:
                dato = eUno.getText().toString();
                break;
            case R.id.eDos:
                dato = eDos.getText().toString();
                break;
            case R.id.eTres:
                dato = eTres.getText().toString();
                break;

            case R.id.ePunto:
                dato = ePunto.getText().toString();
                break;
            case R.id.eCero:
                dato = eCero.getText().toString();
                break;

        }
        // limpiar campos de primera entrada
        if(principio){
            texVResultado.setText("");
            principio=false;
        }
        texVResultado.setText(texVResultado.getText().toString()+dato);

         // limpiar la variable
               dato="";



    }




}
