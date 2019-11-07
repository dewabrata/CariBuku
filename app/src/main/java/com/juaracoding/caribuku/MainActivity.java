package com.juaracoding.caribuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import com.juaracoding.caribuku.APIService.APIClient;
import com.juaracoding.caribuku.APIService.APIInterfacesRest;
import com.juaracoding.caribuku.model.buku.ModelBuku;
import com.juaracoding.caribuku.model.category.ModelCategory;
import com.juaracoding.caribuku.model.category.Result;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import io.github.jrizani.jrdatetimepicker.DateTimePicker;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Spinner categorySpinner;
    Button btnSearch;

   ModelCategory modelCategories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etDate = findViewById(R.id.et_date);


        final DateTimePicker.Builder builder = new DateTimePicker.Builder(this, R.style.Theme_AppCompat);



        categorySpinner = (Spinner) findViewById(R.id.lstCategory);

        btnSearch = (Button)findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://api.nytimes.com/svc/books/v3/lists/"+ etDate.getText().toString()+"/"+ modelCategories.getResults().get(categorySpinner.getSelectedItemPosition()).getListNameEncoded()+".json";

                getBook(url);

            }
        });

        getCategory();



        Calendar date = Calendar.getInstance();
        builder.setInitialDateTime(
                date.get(Calendar.YEAR),
                date.get(Calendar.MONTH),
                date.get(Calendar.DAY_OF_MONTH),
                date.get(Calendar.HOUR_OF_DAY),
                date.get(Calendar.MINUTE),
                true
        );
        builder.setOnDateTimeChangeListener(new DateTimePicker.OnDateTimeSelectListener() {
            @Override
            public void onDateTimeSelected(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minute) {
                Calendar selectedDate = Calendar.getInstance();
                selectedDate.set(year, monthOfYear, dayOfMonth, hourOfDay, minute, 0);
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                etDate.setText(formatter.format(selectedDate.getTime()));
            }
        });

        final DateTimePicker dialog = builder.create();

        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }


    private void getCategory(){


        APIInterfacesRest apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        Call<ModelCategory> category = apiInterface.getCategoryBook("PhrUJpNZEg5yqa00lUQJlE4BXkts9qzC");


        category.enqueue(new Callback<ModelCategory>() {
            @Override
            public void onResponse(Call<ModelCategory> call, Response<ModelCategory> response) {
                ModelCategory dataCategory = response.body();


                if (response.body() != null) {



                    modelCategories = dataCategory;
                    ArrayAdapter userAdapter = new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, dataCategory.getResults());
                    categorySpinner.setAdapter(userAdapter);






                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Toast.makeText(MainActivity.this, jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }


            }

            @Override
            public void onFailure(Call<ModelCategory> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Terjadi gangguan koneksi", Toast.LENGTH_LONG).show();
                call.cancel();

            }

        });
    }


    private void getBook(String url){


        APIInterfacesRest apiInterface = APIClient.getClient().create(APIInterfacesRest.class);
        Call<ModelBuku> category = apiInterface.getBook(url,"PhrUJpNZEg5yqa00lUQJlE4BXkts9qzC");


        category.enqueue(new Callback<ModelBuku>() {
            @Override
            public void onResponse(Call<ModelBuku> call, Response<ModelBuku> response) {
                ModelBuku dataCategory = response.body();


                if (response.body() != null) {


                  //  dataCategory.getResults().getBooks()





                } else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Toast.makeText(MainActivity.this, jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }


            }

            @Override
            public void onFailure(Call<ModelBuku> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Terjadi gangguan koneksi", Toast.LENGTH_LONG).show();
                call.cancel();

            }

        });
    }
}
