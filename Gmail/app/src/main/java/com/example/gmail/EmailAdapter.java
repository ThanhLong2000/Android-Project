package com.example.gmail;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailHolder> {
    List<Email> emails;
    Context mContext;
    Random rnd;

    public EmailAdapter(List<Email> emails, Context mContext) {
        this.emails = emails;
        this.mContext = mContext;
        rnd = new Random();
    }

    @NonNull
    @Override
    public EmailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_email, parent, false);
        return new EmailHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailHolder holder, int position) {
        Email emailItem = emails.get(position);
        String email = emailItem.getEmail();
        String content = emailItem.getContent();
        String time = emailItem.getTime();



        holder.ava.setText(Character.toString(Character.toUpperCase(email.charAt(0))));
        holder.ava.getBackground().setTint(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        holder.TextviewEmail.setText(email);
        holder.TextViewContent.setText(content);
        holder.TexViewTime.setText(time);
    }

    @Override
    public int getItemCount() {
        return emails.size();
    }

    class EmailHolder extends RecyclerView.ViewHolder{
        TextView ava, TextviewEmail, TextViewContent, TexViewTime;
        ImageView star;

        public EmailHolder(@NonNull View itemView) {
            super(itemView);

            ava = itemView.findViewById(R.id.textview1);
            TextviewEmail = itemView.findViewById(R.id.textview2);
            TextViewContent = itemView.findViewById(R.id.textview3);
            TexViewTime = itemView.findViewById(R.id.textview4);
            star = itemView.findViewById(R.id.imageView_star);
        }
    }
}
