package com.example.myapplication3; 
import android.content.pm.ActivityInfo; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Toast; 
import android.widget.Button; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity {
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        EdgeToEdge.enable(this); 
        setContentView(R.layout.activity_main); 
        Button l,p; 
        l = findViewById(R.id.button); 
        p = findViewById(R.id.button2); 
        l.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) {         
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 
            Toast.makeText(MainActivity.this, "Hey We are in Landscape", 
Toast.LENGTH_SHORT).show(); 
            }
        });
        p.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 
                Toast.makeText(MainActivity.this, "Hey We are in Portrait Orientation", 
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}