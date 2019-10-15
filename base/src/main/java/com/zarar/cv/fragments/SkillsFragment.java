package com.zarar.cv.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zarar.cv.adapters.SkillsAdapter;
import com.zarar.cv.base.R;
import com.zarar.cv.model.DemoItem;

import java.util.ArrayList;
import java.util.List;

public class SkillsFragment extends Fragment {
    public SkillsFragment() {
        // Required empty public constructor
    }
    public static SkillsFragment newInstance() {
        SkillsFragment fragment = new SkillsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment4, container, false);
        RecyclerView recyclerViewDemo = view.findViewById(R.id.recyclerViewDemo4);
        recyclerViewDemo.setLayoutManager(new LinearLayoutManager(getContext()));
        String[]data={"MONOPOLY\n \u2713 Basically it's desktop board game \n \u2713 All the functionality are implemented","RESTAURANT\n \u2713 Its MVC application\n \u2713 C# language is used to implement it","SNAKE GAME\n \u2713 Its in assembly language\n \u2713 Clone of snake game in mobiles","CANDY CRUSH\n \u2713 Its in C++ language \n \u2713 Based on classes and Structs concepts ","LINUX KERNAL\n \u2713 It's basically command line terminal\n \u2713 Used to run several commands","BANK MANAGEMENT SYSTEM\n \u2713 Its desktop application \n \u2713 All banking functionality were added","BLOOD BANK APP\n \u2713 Its on android studio\n \u2713 Use to donate and recieve blood "};
        recyclerViewDemo.setAdapter(new SkillsAdapter(data));
        return view;
    }
    private List<DemoItem> feedItems() {
        String Titles = "Skills Section" ;
        List<DemoItem> demoItems = new ArrayList<>();
        DemoItem demoItem = new DemoItem(Titles);
        demoItems.add(demoItem);
        return demoItems;

    }
}
