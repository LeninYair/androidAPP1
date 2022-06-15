package xyz.yoandroide.cambiartextoconboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtn1;
        EditText txtn2;
        Button btnSuma;
        TextView txtvResultado;

        txtn1=(EditText) findViewById(R.id.txtn1);
        txtn2=(EditText) findViewById(R.id.txtn2);
        btnSuma=(Button) findViewById(R.id.btnSuma);
        txtvResultado=(TextView) findViewById(R.id.textvResultado);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numeroUno, numeroDos;
                int resultado=0;
                numeroUno= Integer.parseInt(txtn1.getText().toString());
                numeroDos= Integer.parseInt(txtn2.getText().toString());
                resultado=numeroUno+numeroDos;
                txtvResultado.setText("el resultado es "+resultado);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

    }
}