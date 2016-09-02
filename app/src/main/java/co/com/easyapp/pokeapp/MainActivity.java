package co.com.easyapp.pokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Views
    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtener los Views
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("NOMBRE", txtNombre.getText().toString());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}
