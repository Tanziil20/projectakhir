package sns.example.Adapter;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import sns.example.Model.AdminBarang;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import sns.example.projectakhir.R;

import java.util.List;

public class AdapterAdmin extends RecyclerView.Adapter<AdapterAdmin.ViewHolder> {
    private final RVInterface recyclerViewInterface;
    private final List<AdminBarang> ItemsBarang;
    private Context context;
    private Dialog dialog;

    public AdapterAdmin(
            Context context, List<AdminBarang> itemsBarang, RVInterface recyclerViewInterface) {
        this.context = context;
        this.ItemsBarang = itemsBarang;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(this.context)
                .inflate(R.layout.item_dashboard, parent, false), recyclerViewInterface
        );
    }
    public Dialog getDialog(){
        return  dialog;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder ViewHolder, int position) {

//        AdminBarang itemsBarang = AdminBarang.get(position);
//        Glide.with(context).load(itemsBarang.getImageResource()).into(ViewHolder.imageBarang);
//        ViewHolder.textNamaBarang.setText(itemsBarang.getNamaBarang());
//        ViewHolder.textHargaBarang.setText(itemsBarang.getHargaBarang());
//      ViewHolder.textDeskripsiBarang.setText(itemsBaranng.getPenjelasanMakanan());

    }


    @Override
    public int getItemCount() {
        return ItemsBarang.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageBarang;

        TextView textNamaBarang;
        TextView textHargaBarang;

        TextView textDeskripsiBarang;

        Button btn_delete;
        Button btn_edit;

        public ViewHolder(@NonNull View itemView, RVInterface recyclerViewInterface) {
            super(itemView);
            imageBarang = itemView.findViewById(R.id.ivGambarBrg);
            textNamaBarang = itemView.findViewById(R.id.tvDashboard_NamaBrg);
            textHargaBarang = itemView.findViewById(R.id.tvHarga);
//          textPenjelasanMakanan = itemView.findViewById(R.id.textPenjelasanMakanan);
            btn_edit = itemView.findViewById(R.id.btnEdit);
            btn_delete = itemView.findViewById(R.id.btnDelete);

            this.btn_edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
//                        AdminBarang itemsBarang = AdminBarang.get(position);

                        // Buka activity UpdateMenu untuk mengedit data dengan menggunakan Intent
//                        Intent intent = new Intent(context, UpdateMenu.class);
//                        intent.putExtra("id", itemsBarang.getId());
//                        intent.putExtra("name", itemsBarang.getNamaBarang());
//                        intent.putExtra("harga", itemsBarang.getHargaBarang());
//                        intent.putExtra("gambar", itemsBarang.getImageResource());
//                        context.startActivity(intent);
                    }
                }
            });

            this.btn_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null){
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onDelete(pos);
                        }
                    }
                }
            });
        }
    }
}
