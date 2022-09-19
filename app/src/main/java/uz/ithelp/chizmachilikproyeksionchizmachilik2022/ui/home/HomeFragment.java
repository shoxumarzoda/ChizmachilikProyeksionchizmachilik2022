package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.home;

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

import uz.ithelp.chizmachilikproyeksionchizmachilik2022.MainActivity2;
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
                                                                                                                                                                    //https://github.com/shoxumarzoda/PERSPEKTIVA/raw/master/app/src/main/assets/kirish.pdf
    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam8transformed,"KIRISH                                                              ","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/kirish.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam7transformed,"Chizmachilik fanining O‘zbekistonda rivojlanishi va o‘qitilishining qisqacha tarixi","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/Chizmachilik%20fanining%20ta.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam3transformed,"1.1-§.\tBuyumni proyeksiyalar tekisliklariga proyeksiyalash                        ","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/1.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam4transformed,"1.2-§.\tAsosiy ko‘rinishlar.                                                       ","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/2.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam5transformed,"1.3-§.\tKesimlar va qirqimlar                  ","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/3.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam0transformed,"1.4-§.\tDetal eskizi va texnik rasmini tuzish","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/4.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam2transformed,"1.5-§.\tDetal chizmasida og‘ma qirqim bajarish","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/5.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam8transformed,"1.6-§.\tDetal chizmasida tekis qirqim bajarish","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/6.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam9transformed,"1.7-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan grafik ish bajarish uchun topshiriqlar","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/7.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image10,"1.8-§.\tDetal chizmasidagi mahalliy va qo‘shimcha ko‘rinishlar bajarilsin","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/8.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.image11,"1.9-§.\tDetalning berilgan ikki ko’rinishi asosida yetishmovchi uchinchi ko’rinishi topilsin, aksonometrik proyeksiyasi qurilsin. Ortogonal va aksonometrik proyeksiyasida qirqim tadbiq qilinsin","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/9.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam6transformed,"1.10-§.\tDetal chizmasida murakkab qirqim tadbiq qilinsin","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/10.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam3transformed,"1.11-§.\tDetalning yaqqol tasviri asosida uning eskiz va texnik rasmi bajarilsin","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/11.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam7transformed,"1.12-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan test savollari","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/12.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam5transformed,"1.13-§.\tChizmachilik fani (ko’rinishlar, qirqim va kesimlar)dan  terminologik lug‘at","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/13.pdf"));
        modelRcyclers.add(new ModelRcycler(R.drawable.tuplam4transformed,"Adabiyotlar                                                                     ","https://github.com/shoxumarzoda/ChizmachilikProyeksionchizmachilik2022/raw/master/adabiyotlar.pdf"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

        startActivity(new Intent(getContext(), MainActivity2.class).putExtra("data",modelRcycler.getLoadUrl()));
    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}