package com.gottapotty.gottapotty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button search;
    private Button found;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (Button) findViewById(R.id.search);
        found = (Button) findViewById(R.id.add);
        

        search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            openSearchPotty();
            }
        });

        found.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                openFoundPotty();
            }
        });
    }

    public void openSearchPotty()
    {
        Intent intent = new Intent(this, searchPotty.class);
        startActivity(intent);
    }

    public void openFoundPotty()
    {
        Intent intent =  new Intent(this, foundPotty.class);
        startActivity(intent);
    }

}

