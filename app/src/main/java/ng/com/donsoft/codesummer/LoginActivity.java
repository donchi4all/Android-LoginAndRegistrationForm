package ng.com.donsoft.codesummer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity  extends AppCompatActivity
{

    Button btnLogin;
    EditText txtUsername;
    EditText txtPassword;
    TextView txt_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        txtPassword = findViewById(R.id.edt_password);
        txtUsername = findViewById(R.id.edt_username);
        txt_register =findViewById(R.id.txt_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ///Toast.makeText(LoginActivity.this, txtUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                if (checkInput())
                {
                    Toast.makeText(LoginActivity.this, "Enter Username or Password ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent =
                            new Intent(LoginActivity.this,ProfileActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();

                }
                 }
        });

    }


    public  boolean checkInput(){
        if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty())
           return true;
        else
          return false;
    }

    public void perform_action(View v)
    {
        Intent intent =
                new Intent(LoginActivity.this,RegiterActivity.class);
        startActivity(intent);
    }
}
