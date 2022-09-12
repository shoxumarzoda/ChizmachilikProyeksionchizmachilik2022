package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.chizmachilikproyeksionchizmachilik2022.R;
import uz.ithelp.chizmachilikproyeksionchizmachilik2022.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentHomeBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL ,false));
//        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);


        return root;




    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"KIRISH                                                              ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"Chizmachilik fanining O‘zbekistonda rivojlanishi va o‘qitilishining qisqacha tarixi","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.1-§.\tBuyumni proyeksiyalar tekisliklariga proyeksiyalash                        ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.2-§.\tAsosiy ko‘rinishlar.                                                       ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.3-§.\tKesimlar va qirqimlar                  ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.4-§.\tDetal eskizi va texnik rasmini tuzish","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.5-§.\tDetal chizmasida og‘ma qirqim bajarish","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.6-§.\tDetal chizmasida tekis qirqim bajarish","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.7-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan grafik ish bajarish uchun topshiriqlar","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.8-§.\tDetal chizmasidagi mahalliy va qo‘shimcha ko‘rinishlar bajarilsin","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.9-§.\tDetalning berilgan ikki ko’rinishi asosida yetishmovchi uchinchi ko’rinishi topilsin, aksonometrik proyeksiyasi qurilsin. Ortogonal va aksonometrik proyeksiyasida qirqim tadbiq qilinsin","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.10-§.\tDetal chizmasida murakkab qirqim tadbiq qilinsin","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.11-§.\tDetalning yaqqol tasviri asosida uning eskiz va texnik rasmi bajarilsin","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.12-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan test savollari","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.13-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan  terminologik lug‘at","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.ic_home_black_24dp,"1.13-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan  terminologik lug‘at","asd"));

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