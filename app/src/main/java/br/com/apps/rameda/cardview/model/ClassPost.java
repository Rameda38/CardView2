package br.com.apps.rameda.cardview.model;

public class ClassPost {
    private int imageView;
     private String nome,tempo,coment;

    public ClassPost() {
    }

    public ClassPost(String nome, String tempo, String coment, int imageView) {

        this.imageView=imageView;
        this.nome=nome;
        this.tempo=tempo;
        this.coment=coment;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView=imageView;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo=tempo;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment=coment;
    }


}
