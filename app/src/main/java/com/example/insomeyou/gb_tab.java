package com.example.insomeyou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class gb_tab extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<gb_Recycler> gb_usersList;
    com.example.insomeyou.gb_Adapter a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gb_tab);

        initData();
        initRecyclerView();
    }

    private void initData() {

        gb_usersList = new ArrayList<>();

        gb_usersList.add(new gb_Recycler(R.drawable.schedule, "Establish a Consistent Sleep Schedule","Go to bed and wake up at the same time every day, even on weekends. This helps regulate your body's internal clock and improve sleep quality." ));
        gb_usersList.add(new gb_Recycler(R.drawable.room, "Create a Sleep-Friendly Environment","Make your bedroom a comfortable and calming space. Keep the room cool, dark, and quiet. Consider using earplugs, eye shades, or white noise machines to block out distractions." ));
        gb_usersList.add(new gb_Recycler(R.drawable.pills, "Avoid Stimulants"," Limit your consumption of caffeine, nicotine, and alcohol, especially close to bedtime. These substances can interfere with your sleep patterns and make it harder to fall asleep." ));
        gb_usersList.add(new gb_Recycler(R.drawable.read, "Establish a Bedtime Routine","Develop a relaxing routine before bed to signal to your body that it's time to wind down. This may include activities like reading a book, taking a warm bath, or practicing relaxation techniques such as deep breathing or meditation." ));
        gb_usersList.add(new gb_Recycler(R.drawable.smartphones, "Limit Exposure to Electronic Devices","The blue light emitted by electronic devices like smartphones, tablets, and computers can disrupt your sleep. Avoid using these devices at least an hour before bed, or consider using blue light filters or apps that reduce the blue light emission." ));
        gb_usersList.add(new gb_Recycler(R.drawable.exercise, "Exercise Regularly","Engaging in regular physical activity can help regulate your sleep patterns. Aim for at least 30 minutes of moderate exercise most days of the week, but avoid exercising too close to bedtime as it may energize you." ));
        gb_usersList.add(new gb_Recycler(R.drawable.chill, "Manage Stress","High levels of stress and anxiety can make it difficult to sleep. Find healthy ways to manage stress, such as engaging in relaxation techniques, practicing mindfulness or yoga, or talking to a therapist." ));
        gb_usersList.add(new gb_Recycler(R.drawable.nap, "Limit Napping"," If you struggle with insomnia, try to limit daytime napping, especially in the late afternoon or evening. If you need to nap, keep it short (around 20-30 minutes) and avoid napping too close to your bedtime." ));
        gb_usersList.add(new gb_Recycler(R.drawable.stop, "Avoid Clock-Watching","Constantly checking the time can increase your anxiety and make it harder to fall asleep. Consider removing clocks from your bedroom or turning them away from your view during the night." ));
        gb_usersList.add(new gb_Recycler(R.drawable.doc, "Consult a Healthcare Professional","they can provide a comprehensive evaluation, identify underlying causes of your insomnia, and offer personalized guidance or treatment options that are tailored to your specific needs, increasing your chances of finding effective solutions." ));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.gb_recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        a = new com.example.insomeyou.gb_Adapter(gb_usersList);
        recyclerView.setAdapter(a);
        a.notifyDataSetChanged();
    }
}