package com.example.travelercommunity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class SignUpActivity extends AppCompatActivity {
    private EditText firstNameET;

    private EditText lastNameET;

    private EditText emailET;

    private EditText passwordET;

    private Button singUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firstNameET = findViewById(R.id.first_name);
        lastNameET = findViewById(R.id.last_name);
        emailET = findViewById(R.id.email_et);
        passwordET = findViewById(R.id.password_et);
        singUpBtn = findViewById(R.id.sign_up);

        singUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameET.getText().toString();
                String lastName = lastNameET.getText().toString();
                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();
                if (checkDataUser(firstName,lastName,email,password)){
                    DBRef.auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                String userId = task.getResult().getUser().getUid();
                                User user = new User(firstName,lastName,email,password,userId);
                                DBRef.userRef.child(userId).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()){
                                          if (task.isSuccessful()){
                                              Toast.makeText(SignUpActivity.this,"sing up complete",Toast.LENGTH_LONG).show();
                                               Intent Intent = new Intent(SignUpActivity.this,SignInActivity.class);
                                               startActivity(Intent);
                                          }else {
                                              Toast.makeText(SignUpActivity.this,"Error",Toast.LENGTH_LONG).show();
                                          }
                                        }
                                    }
                                });
                            }else {
                                Toast.makeText(SignUpActivity.this,"Error ..",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

    }
    public boolean checkDataUser(String firstName, String lastName, String email, String password) {
        return true;
    }
}
