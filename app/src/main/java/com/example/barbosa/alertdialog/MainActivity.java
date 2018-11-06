package com.example.barbosa.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void abrirAlerta(View view){

       //Criando o AlertDialog

       AlertDialog.Builder dialog = new AlertDialog.Builder(this);

       //Configurando título e mensagem
       dialog.setTitle("Título");
       dialog.setMessage("Mensagem");

       //Configurando as ações

       dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_LONG).show();
           }
       });

       dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_LONG).show();
           }
       });

       //Criar e exibir o AlerDialog

       dialog.create();
       dialog.show();
   }
}
