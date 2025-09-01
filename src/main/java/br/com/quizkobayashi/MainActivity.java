package br.com.quizkobayashi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView pergunta;
    TextView questaoA;
    TextView questaoB;
    TextView questaoC;
    TextView questaoD;
    TextView questaoE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        pergunta = findViewById(R.id.main_activity_pergunta);
        questaoA = findViewById(R.id.main_activity_a);
        questaoB = findViewById(R.id.main_activity_b);
        questaoC = findViewById(R.id.main_activity_c);
        questaoD = findViewById(R.id.main_activity_d);
        questaoE = findViewById(R.id.main_activity_e);

        questaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "A", Toast.LENGTH_SHORT);
                verificar(false);
            }
        });

        questaoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "B", Toast.LENGTH_SHORT);
                verificar(false);
            }
        });

        questaoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "C", Toast.LENGTH_SHORT);
                verificar(false);
            }
        });

        questaoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "D", Toast.LENGTH_SHORT);
                verificar(true);
            }
        });

        questaoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "E", Toast.LENGTH_SHORT);
                verificar(false);
            }
        });
    }

    public void verificar(boolean acertou){
        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("acertou",acertou);
        startActivity(intent);
        this.finish();
    }
}