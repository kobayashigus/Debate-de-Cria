package br.com.quizkobayashi;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resultado);
        TextView texto = findViewById(R.id.resultado_activity_resultado);
        boolean acertou = getIntent().getBooleanExtra("acertou",false);
        if(acertou){
            texto.setText("acertou");
        }else{
            texto.setText("errou");
        }
    }
}