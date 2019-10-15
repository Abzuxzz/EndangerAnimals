package com.blogspot.codesgram.endangeranimals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnimal;
    private ArrayList<Animal> animal = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimal = findViewById(R.id.rv_animal);
        rvAnimal.setHasFixedSize(true);

        animal.addAll(AnimalData.getAllListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvAnimal.setLayoutManager(new LinearLayoutManager(this));
        AnimalAdapter Adapter = new AnimalAdapter(animal);
        rvAnimal.setAdapter(Adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_about :
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
