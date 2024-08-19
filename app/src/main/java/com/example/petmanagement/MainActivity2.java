package com.example.petmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    private EditText nameEditText, emailEditText, phoneNumberEditText, petNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        petNameEditText = findViewById(R.id.petNameEditText);

        Button registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String phoneNumber = phoneNumberEditText.getText().toString().trim();
                String petName = petNameEditText.getText().toString().trim();

                if (name.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || petName.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference usersRef = database.getReference("users");

                String userId = usersRef.push().getKey();
                DataClass userData = new DataClass(name, email, phoneNumber, petName);
                usersRef.child(userId).setValue(userData);

                Toast.makeText(MainActivity2.this, "Registration successful!", Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openMain3(View view) {
        startActivity(new Intent(this, MainActivity3.class));
    }
}


