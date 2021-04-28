package sv.edu.udb.ejemplosolid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1, txtNum2, txtNum3;
    private TextView result;
    Operaciones operaciones = new Operaciones();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializando campos a utilizar
        txtNum1=(EditText)findViewById(R.id.txtNum1);
        txtNum2=(EditText)findViewById(R.id.txtNum2);
        txtNum3=(EditText)findViewById(R.id.txtNum3);
        result=(TextView)findViewById(R.id.textViewRes);
        //Asignando método al boton
        findViewById(R.id.btnCalcular).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {   operaciones.Promedio(txtNum1.getText().toString(),
                    txtNum2.getText().toString(), txtNum3.getText().toString(), result);  }
        });
    }
}