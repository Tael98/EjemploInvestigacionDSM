package sv.edu.udb.ejemplosolid;

import android.widget.EditText;
import android.widget.TextView;

public class Operaciones {

    //Un ejemplo sencillo del principio de responsabilidad única podría ser una
    //clase creada específicamente para contener métodos o funciones específicas
    //de una aplicación. En este ejemplo, se usa esta pequeña clase para alojar
    //y centralizar los métodos u operaciones que se utilizarán

    double number = 0;
    private TextView result;

    public void Promedio(String n1, String n2, String n3, TextView respuesta)
    {
        number = 0;
        double numbers[] = new double[3];
        numbers[0] = Double.parseDouble(n1);
        numbers[1] = Double.parseDouble(n2);
        numbers[2] = Double.parseDouble(n3);
        for(int i = 0; i < numbers.length; i++)
        {
            number = numbers[i] + number;
        }
        number = number / numbers.length;
        respuesta.setText("El promedio es: " + Double.toString(number));
    }
}
