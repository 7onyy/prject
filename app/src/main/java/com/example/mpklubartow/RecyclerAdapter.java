package com.example.mpklubartow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BusViewHolder> {

    private ArrayList<String> from;
    private ArrayList<String> time;
    private ArrayList<String> to;
    private Context context;

    public RecyclerAdapter(ArrayList<String> from, ArrayList<String> time, ArrayList<String> to, Context context) {
        this.from = from;
        this.time = time;
        this.to = to;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerAdapter.BusViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_bus,parent,false);
        return new BusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerAdapter.BusViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BusViewHolder extends RecyclerView.ViewHolder{
        TextView from, time, to;
        public BusViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            from=itemView.findViewById(R.id.departueTime);
            time=itemView.findViewById(R.id.timeValue);
            to=itemView.findViewById(R.id.arrivalTime);
        }
    }
}
