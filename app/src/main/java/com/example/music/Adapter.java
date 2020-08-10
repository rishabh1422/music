package com.example.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    LayoutInflater inflater;
    List<Song> songs;
    public Adapter(Context ctx,List<Song> songs)
    {
        this.inflater=LayoutInflater.from(ctx);
        this.songs= songs;
    }
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.song,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.songTitle.setText(songs.get(position).getTitle());
        holder.artist.setText(songs.get(position).getArtists());
        Picasso.get().load(songs.get(position).getCoverImage()).into(holder.coverImage);


    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView songTitle,artist;
        ImageView coverImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            songTitle=itemView.findViewById(R.id.songTitle);
            artist=itemView.findViewById(R.id.songartist);
            coverImage=itemView.findViewById(R.id.coverImage);
        }
    }
}
