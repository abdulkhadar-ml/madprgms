package com.example.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.php)
        {
            Toast.makeText(this,
                    "PHP Selected",
                    Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId()==R.id.java)
        {
            Toast.makeText(this,
                    "JAVA Selected",
                    Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId()==R.id.csharp)
        {
            Toast.makeText(this,
                    "C# Selected",
                    Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}
