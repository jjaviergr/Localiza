package com.example.pc.localiza;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edLongitud;
    private EditText edLatitud;
    private Button Bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edLongitud=(EditText)findViewById(R.id.editText);
        edLatitud=(EditText)findViewById(R.id.editText2);
        Bt=(Button)findViewById(R.id.button);
    }

    public void Onclick_Bt(View v)
    {
        try
        {

            double dLatitud=36.8152187;
            double dLongitud =-2.5784975;

            if ((!edLatitud.getText().toString().isEmpty())||(!edLongitud.getText().toString().isEmpty()))
            {
                dLatitud=Double.parseDouble(edLatitud.getText().toString());
                dLongitud =Double.parseDouble(edLongitud.getText().toString());

            }

            Toast.makeText(this,"Coordenadas :"+dLatitud+","+dLongitud, Toast.LENGTH_LONG).show();

            Intent intent=new Intent(Intent.ACTION_VIEW);


            intent.setData(Uri.parse("geo:"+dLatitud+","+dLongitud+"?z=14"));
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(this,"Ha ocurrido una excepción "+e.toString(), Toast.LENGTH_LONG).show();// e.printStackTrace();
        }
    }
}
