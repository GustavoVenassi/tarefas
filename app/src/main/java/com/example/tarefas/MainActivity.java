package com.example.tarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nomeParaOBotao = (Button) findViewById(R.id.nomeDoBotao);

        public void onClick(View v) {
            Intent it = new Intent(MainActivity.this, NovaTela.class);
            startActivity(it);
        }
    });
    }


}
