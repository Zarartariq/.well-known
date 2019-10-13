package com.ahmad.cv.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.adapters.EducationAdapter;
import com.ahmad.cv.adapters.SkillsAdapter;
import com.ahmad.cv.base.R;
import com.ahmad.cv.model.DemoItem;

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
        String[]data={"MONOPOLY\n*Basically it's desktop board game \n*All the functionality are implemented","RESTAURANT\n*Its MVC application\n*C# language is used to implement it","SNAKE GAME\n*Its in assembly language\n*Clone of snake game in mobiles","CANDY CRUSH\n*Its in C++ language \n*Based on classes and Structs concepts ","LINUX KERNAL\n*It's basically command line terminal\n*Used to run several commands","BANK MANAGEMENT SYSTEM\n*Its desktop application \n*All banking functionality were added","BLOOD BANK APP\n*Its on android studio\n*Use to donate and recieve blood "};
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
