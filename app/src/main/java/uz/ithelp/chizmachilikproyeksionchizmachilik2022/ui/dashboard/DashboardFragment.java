package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.dashboard;

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
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"Qirqimlar                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"2-ish-kesim                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"2-ish-profil                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"3-ish-og'ma                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"4-ish-og'ma                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"5-ish-frontal                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"6-ish-slinder                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"7-_ish-pogna                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"8- ish-siniq                                                          ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"9-ish-qovirg'a                                                          ","asd"));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

    }
}