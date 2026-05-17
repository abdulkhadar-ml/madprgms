package com.example.myapplication5; 
import android.content.Intent; 
import android.net.Uri; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class SecondActivity extends AppCompatActivity { 
    Button btnImplicitContent; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_second); 
        btnImplicitContent=findViewById(R.id.button2); 
        btnImplicitContent.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) { 
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/")); 
                startActivity(intent); 
            } 
        }); 
    }
}