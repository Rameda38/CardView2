package br.com.apps.rameda.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.apps.rameda.cardview.R;
import br.com.apps.rameda.cardview.model.ClassPost;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private List<ClassPost>posta;

    public PostAdapter(List <ClassPost> posta) {
        this.posta=posta;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View Lista =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reciclepost,
                viewGroup,false );
        return new ViewHolder(Lista) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ClassPost postad = posta.get(i);
        viewHolder.nome.setText(postad.getNome());
        viewHolder.imageView.setImageResource(postad.getImageView());
        viewHolder.coment.setText(postad.getComent());
        viewHolder.tempo.setText(postad.getTempo());
    }

    @Override
    public int getItemCount() {
        return posta.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nome,tempo,coment;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imageView = itemView.findViewById(R.id.iv_imagem);
           nome = itemView.findViewById(R.id.tv_nome);
           tempo = itemView.findViewById(R.id.tv_tempo);
           coment = itemView.findViewById(R.id.tv_comentario);
        }
    }

}
