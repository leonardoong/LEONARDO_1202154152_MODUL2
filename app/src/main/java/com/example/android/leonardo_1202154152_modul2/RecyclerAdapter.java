package com.example.android.leonardo_1202154152_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leonardo on 2/17/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private Context mCtx;

    private List<Makanan> listMakanan;

    public RecyclerAdapter(Context mCtx, List<Makanan> listMakanan) {
        this.mCtx = mCtx;
        this.listMakanan = listMakanan;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        final Makanan makanan = listMakanan.get(position);

        holder.textNama.setText(makanan.getNama());
        holder.textHarga.setText(makanan.getHarga());
        holder.gambar.setImageDrawable(mCtx.getResources().getDrawable(makanan.getGambar()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, DetailMenuActivity.class);
                intent.putExtra("nama", makanan.getNama());
                intent.putExtra("harga", makanan.getHarga());
                intent.putExtra("gambar", makanan.getGambar());
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textNama, textHarga;
        ImageView gambar;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            textNama = itemView.findViewById(R.id.textNama);
            textHarga = itemView.findViewById(R.id.textHarga);
            gambar = itemView.findViewById(R.id.img);

        }
    }
}
