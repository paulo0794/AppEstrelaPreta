package br.com.etecia.appestrelapreta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Estrela");

    }

public boolean onCreateOptionsMenu(Menu menu){

    MenuInflater menuInflater = getMenuInflater();

    menuInflater.inflate(R.menu.menu, menu);

return super.onCreateOptionsMenu(menu);

}

}
