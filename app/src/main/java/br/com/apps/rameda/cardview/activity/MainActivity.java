package br.com.apps.rameda.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.apps.rameda.cardview.R;
import br.com.apps.rameda.cardview.adapter.PostAdapter;
import br.com.apps.rameda.cardview.model.ClassPost;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<ClassPost> post = new ArrayList <>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        //config layout
      //  RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
      //  LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
       // layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2 );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);



        //config adapter
        addnaList();
        PostAdapter postAdapter = new PostAdapter(post);
        recyclerView.setAdapter(postAdapter);
    }
    public void addnaList(){
        ClassPost modelPost;
        modelPost = new ClassPost("ademar","Agora mesmo","Lindo ceu",R.drawable.tempo);
        this.post.add(modelPost);
        modelPost = new ClassPost("roberto Carlos","agora mesmo","lindo",R.drawable.alpha);
        this.post.add(modelPost);
        modelPost = new ClassPost("none","agora mesmo","melhor cidade",R.drawable.mineapolis);
        this.post.add(modelPost);
        modelPost = new ClassPost("floresta","2 min later","apaixonado",R.drawable.florestanovazelandia);
        this.post.add(modelPost);
    }
}
