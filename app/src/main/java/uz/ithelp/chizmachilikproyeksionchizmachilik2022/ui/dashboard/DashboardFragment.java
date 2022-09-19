package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.chizmachilikproyeksionchizmachilik2022.MainActivity3;
import uz.ithelp.chizmachilikproyeksionchizmachilik2022.R;
import uz.ithelp.chizmachilikproyeksionchizmachilik2022.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentDashboardBinding binding;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL ,false));
//        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;
    }


    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"Qirqimlar                                                          ","_moiRwhFoeg"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"2-ish-kesim                                                          ","zE4S7om_yCw"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"2-ish-profil                                                          ","RKt-ZKveEH0"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"3-ish-og'ma                                                          ","APplhzrDIDA"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"4-ish-og'ma                                                          ","qicPOaCXcNo"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"5-ish-frontal                                                          ","CDi5Yay5JMc"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"6-ish-slinder                                                          ","ZzwgJeH0HPA"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"7-_ish-pogna                                                          ","4jwnorl1Ouk"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"8- ish-siniq                                                          ","0m4HhkgAYuw"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"9-ish-qovirg'a                                                          ","CwA_lvehZQQ"));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        Intent intent = new Intent(getContext(), MainActivity3.class);
        intent.putExtra("data", modelRcycler.getLoadUrl());
        startActivity(intent);

    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}