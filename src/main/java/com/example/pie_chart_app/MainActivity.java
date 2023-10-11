package com.example.pie_chart_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class MainActivity extends AppCompatActivity {

    TextView tvR, tvPython, tvCPP, tvJava;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvR = findViewById(R.id.tvR);
        tvPython = findViewById(R.id.tvPython);
        tvCPP = findViewById(R.id.tvCPP);
        tvJava = findViewById(R.id.tvJava);
        pieChart = findViewById(R.id.piechart);

        setData();

    }
    private void setData(){

        tvR.setText(Integer.toString(50));
        tvPython.setText(Integer.toString(90));
        tvCPP.setText(Integer.toString(40));
        tvJava.setText(Integer.toString(25));

        pieChart.addPieSlice(
                new PieModel("R",Integer.parseInt(tvR.getText().toString()), Color.parseColor("#FFA726")));

        pieChart.addPieSlice(
                new PieModel("R",Integer.parseInt(tvPython.getText().toString()), Color.parseColor("#66BB6A")));

        pieChart.addPieSlice(
                new PieModel("R",Integer.parseInt(tvCPP.getText().toString()), Color.parseColor("#EF5350")));

        pieChart.addPieSlice(
                new PieModel("R",Integer.parseInt(tvJava.getText().toString()), Color.parseColor("#29B6F6")));


        pieChart.startAnimation();



    }
}