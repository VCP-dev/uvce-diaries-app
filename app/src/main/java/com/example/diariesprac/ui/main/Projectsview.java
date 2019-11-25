package com.example.diariesprac.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diariesprac.Project;
import com.example.diariesprac.ProjectAdapter;
import com.example.diariesprac.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class Projectsview extends Fragment {

    private ProjectsviewViewModel mViewModel;

    private RecyclerView recyclerView;

    private List<Project> projectitems;

    ProjectAdapter adapter;

    public  Projectsview() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_projectsview,container,false);

        FloatingActionButton fab = v.findViewById(R.id.floatingbut);

        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        projectitems = new ArrayList<>();

        Project projectitem1 = new Project("React Shopping Cart","An interactive React JS shopping cart which simulates a typical E-commerce website which sells games","Pavan S","3rd sem CSE");
        Project projectitem2 = new Project("Command Line Pokegame Simulator","A Python based Pokemon simulator that allows battle and capture functionality","Varun KJ","3rd sem CSE");
        Project dummyproj = new Project("Example head","Example descr","example name","Example branch and class");

        projectitems.add(projectitem1);
        projectitems.add(projectitem2);
        projectitems.add(dummyproj);

        adapter = new ProjectAdapter(projectitems,this.getContext());
        recyclerView.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Open google form",Snackbar.LENGTH_SHORT)
                        .setAction("Action",null).show();
            }
        });


        return v;

    }



}
