package ClassiJava;

import java.lang.reflect.Array;

public class Edge {

    private Replyer[] edge = new Replyer[2];

    private int score;

    public Edge(Replyer r1, Replyer r2){
        this.edge[0] = r1;
        this.edge[1] = r2;
    }

    public Replyer[] getEdge() {
        return edge;
    }

    public void setEdge(Replyer[] edge) {
        this.edge = edge;
    }

    public int calculateScore(){
        return 0;
    }
}