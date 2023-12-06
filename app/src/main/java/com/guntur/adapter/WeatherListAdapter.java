package com.azhar.guntur.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.azhar.guntur.R;
import com.azhar.guntur.holder.WeatherListHolder;
import com.azhar.guntur.model.WeatherList;

import java.util.ArrayList;

public class WeatherListAdapter extends RecyclerView.Adapter<WeatherListHolder> {

    private ArrayList<WeatherList> mWeatherlist;

    public WeatherListAdapter(ArrayList<WeatherList> mWeatherlist) {
        this.mWeatherlist = mWeatherlist;
    }

    @Override
    public WeatherListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_weather, parent, false);
        return new WeatherListHolder(card);
    }

    @Override
    public void onBindViewHolder(WeatherListHolder holder, int position) {
        WeatherList weatherList = mWeatherlist.get(position);
        holder.updateUI(weatherList);
    }

    @Override
    public int getItemCount() {
        return mWeatherlist.size();
    }
}
