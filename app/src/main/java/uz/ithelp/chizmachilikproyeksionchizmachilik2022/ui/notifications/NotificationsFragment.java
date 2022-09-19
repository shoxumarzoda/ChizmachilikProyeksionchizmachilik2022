package uz.ithelp.chizmachilikproyeksionchizmachilik2022.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import uz.ithelp.chizmachilikproyeksionchizmachilik2022.R;
import uz.ithelp.chizmachilikproyeksionchizmachilik2022.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment implements UserAdapter.SelectedUser {

    private FragmentNotificationsBinding binding;

    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    UserAdapter userAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ruyhatni eloni va sozlanmasi
        recyclerView = root.findViewById(R.id.recyclerView3);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL ,false));
//        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(),0));

        initial();

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);

        return root;
    }

    private void initial() {
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"M.B.Shah, B.C.Rana. Engineering Drawing         ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"Textbook of Engineering Drawing K. Venkata Reddy  ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"CHIZMACHILIK" +   "(CHIZMACHILIK FANIDA" +  "KONSTRUKSIYALASH" +    "ASOSLARI)  IKROMJON RAHMONOV," +
                "A’ZAMJON VALIYEV","asd"));

        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"CHIZMACHILIKI. Rahmonov, N. Qirg‘izboyeva," + "A. Ashirboyev, A.Valiyev, B.Nigmanov         ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"CHIZMACHILIK" +   "(GEOMETRIK VA PROYEKSION CHIZMACHILIK)     M.K.Xalimov Z.E.Mirzaliyev F.E.Оchilov","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"CHIZMACHILIK     Yodgorov.J                                                               ","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"","asd"));
        modelRcyclers.add(new ModelRcycler(R.drawable.imgbook,"","asd"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void selectedUser(ModelRcycler modelRcycler) {

    }

    @Override
    public void onStart() {
        super.onStart();
        modelRcyclers.clear();
        initial();
    }
}