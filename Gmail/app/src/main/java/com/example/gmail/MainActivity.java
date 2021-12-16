package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Email> emails = new ArrayList<>();
    EmailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        getEmailList();
        adapter = new EmailAdapter(emails, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }

    public void getEmailList() {
        emails.add(new Email("Edurila.com", "$19 Only(First 10 spots - " +
                "Bestselling...\nAre you looking to Learn Web Designin...", "12:34 PM"));
        emails.add(new Email("Chris Abad", "Help make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM"));
        emails.add(new Email("Tuto.com", "8h de formation gratuite et les nouvea...\n" +
                "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"));
        emails.add(new Email("support", "Société Ovh: suivi de vos services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"));
        emails.add(new Email("Matt from Ionic", "The New Ionic Creator Is Here!\n" +
                "Announcing the all-new Creator, build...", "10:11 AM"));
        emails.add(new Email("Edurila.com", "$19 Only(First 10 spots - " +
                "Bestselling...\nAre you looking to Learn Web Designin...", "12:34 PM"));
        emails.add(new Email("Chris Abad", "Help make Campaign Monitor better\n" +
                "Let us know your thoughts! No Images...", "11:22 AM"));
        emails.add(new Email("Tuto.com", "8h de formation gratuite et les nouvea...\n" +
                "Photoshop, SEO, Blender, CSS, WordPre...", "11:04 AM"));
        emails.add(new Email("support", "Société Ovh: suivi de vos services - hp...\n" +
                "SAS OVH - http://www.ovh.com 2 rue K...", "10:26 AM"));
        emails.add(new Email("Matt from Ionic", "The New Ionic Creator Is Here!\n" +
                "Announcing the all-new Creator, build...", "10:11 AM"));
    }
}