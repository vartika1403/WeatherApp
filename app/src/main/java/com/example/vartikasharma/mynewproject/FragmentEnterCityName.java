package com.example.vartikasharma.mynewproject;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FragmentEnterCityName extends Fragment {
    @BindView(R.id.edit_text_city_name)
    EditText cityNameEditText;
    @BindView(R.id.go_button)
    Button goButton;
    @BindView(R.id.progressBarHolder)
    FrameLayout progressBarHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_enter_city_name, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.go_button)
    public void clickGoButton() {
        String cityName = cityNameEditText.getText().toString();
        if (cityName.isEmpty()) {
            Toast.makeText(getActivity(), R.string.enter_city_name, Toast.LENGTH_LONG).show();
            return;
        }
        ((MainActivity)getActivity()).openFragmentWeatherDisplay(cityName);
    }

    public void showLoader(){
        progressBarHolder.setVisibility(View.VISIBLE);
    }
}
