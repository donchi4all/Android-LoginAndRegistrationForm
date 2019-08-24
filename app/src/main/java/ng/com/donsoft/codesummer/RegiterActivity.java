package ng.com.donsoft.codesummer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegiterActivity extends AppCompatActivity {

    Button btnRegister;
    EditText edtName,edtEmail,edtAge,edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiter);


     //binding UI with our Class
        btnRegister = findViewById(R.id.btn_register);
        edtName =findViewById(R.id.edt_name);
        edtEmail =findViewById(R.id.edt_email);
        edtAge =findViewById(R.id.edt_age);
        edtPass =findViewById(R.id.edt_pass);


        //Button onclick Event
         btnRegister.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 //getting Text input from the fields
                  String Name = edtName.getText().toString();
                  String Email = edtEmail.getText().toString();
                  String Age = edtAge.getText().toString();
                  String Pass = edtPass.getText().toString();


                 //check if the fields are empty
                 if(Name.isEmpty() || Email.isEmpty() || Age.isEmpty() || Pass.isEmpty())
                 {
                   //Toast Message
                        Toast.makeText(RegiterActivity.this, "Field cannot be Empty", Toast.LENGTH_SHORT).show();
                 }
                 else
                     {
                         Toast.makeText(RegiterActivity.this, "Succefully Registered", Toast.LENGTH_SHORT).show();
                         Intent intent = new Intent(RegiterActivity.this,ProfileActivity.class);
                         startActivity(intent);
                     }

             }
         });

    }
}
