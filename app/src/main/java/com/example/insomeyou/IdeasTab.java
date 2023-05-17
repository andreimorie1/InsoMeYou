package com.example.insomeyou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IdeasTab extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<Recycler> userList;
    com.example.insomeyou.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideas_tab);

        initdata();
        initrecyclerView();

    }

    private void initdata() {

        userList = new ArrayList<>();

        userList.add(new Recycler(R.drawable.insomnia, "Insomnia is a sleep disorder that affects a person's ability to fall asleep, stay asleep, or both."));
        userList.add(new Recycler(R.drawable.anxiety, "Insomnia can be acute (short-term) or chronic (long-term), and it can have a variety of causes, including stress, anxiety, depression, medication use, and underlying medical conditions."));
        userList.add(new Recycler(R.drawable.fatigue, "Symptoms of insomnia may include difficulty falling asleep, waking up frequently during the night, waking up too early in the morning, feeling tired or unrefreshed upon waking, and difficulty concentrating during the day."));
        userList.add(new Recycler(R.drawable.weakness, "Symptoms of insomnia may include difficulty falling asleep, waking up frequently during the night, waking up too early in the morning, feeling tired or unrefreshed upon waking, and difficulty concentrating during the day."));
        userList.add(new Recycler(R.drawable.eyes_tired, "There are several types of insomnia, including onset insomnia (difficulty falling asleep), maintenance insomnia (difficulty staying asleep), and comorbid insomnia (insomnia that occurs alongside another medical or psychiatric condition)."));
        userList.add(new Recycler(R.drawable.doc, "Diagnosis of insomnia typically involves a medical evaluation and a sleep study, which may include monitoring of brain waves, eye movements, and other physiological measures during sleep."));
        userList.add(new Recycler(R.drawable.exercises, "Treatment for insomnia may include lifestyle changes, such as improving sleep hygiene and reducing stress, as well as medication and therapy."));
        userList.add(new Recycler(R.drawable.physical_therapy, "Cognitive-behavioral therapy (CBT) is an effective treatment option for insomnia that helps identify and address negative thought patterns and behaviors that may be contributing to sleep difficulties."));
        userList.add(new Recycler(R.drawable.pills, "Prescription sleep medications may be prescribed for short-term use, but they can have side effects and may be habit-forming."));
        userList.add(new Recycler(R.drawable.research, "Research is ongoing to better understand the underlying causes of insomnia and to develop new treatment options."));
    }
    private void initrecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new com.example.insomeyou.Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}