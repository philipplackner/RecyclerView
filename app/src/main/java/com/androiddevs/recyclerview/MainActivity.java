package com.androiddevs.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPersons = findViewById(R.id.rvPersons);
        rvPersons.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Barrack Obama", 60, R.drawable.kermit1));
        persons.add(new Person("Angela Merkel", 120, R.drawable.kermit2));
        persons.add(new Person("Kim Jong-Un", 12, R.drawable.kermit3));
        persons.add(new Person("Donald Trump", 80, R.drawable.kermit4));
        persons.add(new Person("Napoleon", 30, R.drawable.kermit5));
        persons.add(new Person("Michael Jackson", 27, R.drawable.kermit6));
        persons.add(new Person("Elvis Presley", 65, R.drawable.kermit7));

        PersonAdapter adapter = new PersonAdapter(persons);
        rvPersons.setAdapter(adapter);
    }
}
