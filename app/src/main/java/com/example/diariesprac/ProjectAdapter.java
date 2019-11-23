package com.example.diariesprac;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {


    private List<Project> projectitems;
    private Context context;

    public ProjectAdapter(List<Project> projectitems, Context context) {
        this.projectitems = projectitems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Project projectitem = projectitems.get(position);

        holder.head.setText(projectitem.getHead());
        holder.name.setText(projectitem.getName());
        holder.branchandclass.setText(projectitem.getBranchandclass());
        holder.descr.setText(projectitem.getDesc());
        holder.link.setText("Link does not do anything rn...");

    }

    @Override
    public int getItemCount() {
        return projectitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public TextView head;
        public TextView name;
        public TextView branchandclass;
        public TextView descr;
        public TextView link;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.textviewhead);
            name = itemView.findViewById(R.id.textviewname);
            branchandclass = itemView.findViewById(R.id.textviewbranchandclass);
            descr = itemView.findViewById(R.id.textviewdescr);
            link = itemView.findViewById(R.id.textviewLink);
        }
    }

}
