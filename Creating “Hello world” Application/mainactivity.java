package com.example.myapplication1; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.Toast; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.activity.EdgeToEdge; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
Button b = findViewById(R.id.hello); 
b.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show(); 
} 
}); 
} 
}           