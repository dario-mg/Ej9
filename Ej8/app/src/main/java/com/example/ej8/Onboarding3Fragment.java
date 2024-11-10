package com.example.ej8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Onboarding3Fragment extends Fragment {

    Button botonFinalizar;
    TextView textoIrAlHome;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonFinalizar = view.findViewById(R.id.botonFinalizar);
        textoIrAlHome = view.findViewById(R.id.textoIrAlHome);

        // Acción para navegar a onboarding1Fragment al hacer clic en "Finish"
        botonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding3Fragment_to_onboarding1Fragment);
            }
        });

        // Acción para navegar a homeFragment con animación de desvanecimiento al hacer clic en "Go to Home"
        textoIrAlHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding3Fragment_to_homeFragment);
            }
        });
    }
}
