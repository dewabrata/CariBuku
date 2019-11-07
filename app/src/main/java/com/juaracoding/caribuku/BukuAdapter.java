package com.juaracoding.caribuku;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juaracoding.caribuku.model.buku.Book;
import com.squareup.picasso.Picasso;

import java.util.List;


public class BukuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private List<Book> dataItemList;

    public List<Book> getDataItemList() {
        return dataItemList;
    }

    public BukuAdapter(List<Book> dataItemList) {
        this.dataItemList = dataItemList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        this.context = parent.getContext();

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku, parent, false);
            Penampung penampung = new Penampung(view);
            return penampung;


    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {


            ((Penampung)holder).txtTitle.setText(dataItemList.get(position).getTitle());
            ((Penampung)holder).txtSypnosis.setText(dataItemList.get(position).getDescription());

        Picasso.get().load(dataItemList.get(position).getBookImage()).into(   ((Penampung)holder).gambar);




        }







    @Override
    public int getItemCount() {
        return dataItemList == null ? 0 : dataItemList.size();
    }


    static class Penampung extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtTitle,txtSypnosis;
        public ImageView gambar;

        public Penampung(View itemView) {
            super(itemView);
          //  itemView.setOnClickListener(this);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            txtSypnosis = (TextView) itemView.findViewById(R.id.txtSypnosis);
            gambar = (ImageView)itemView.findViewById(R.id.gambar);
            ;

        }
        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + txtTitle.getText());
        }
    }


}
