public class Undirectedgraph {
    private boolean adjacentm[][];
    private int vertices ;

    public Undirectedgraph(int n){
        this.vertices = n ;
        adjacentm = new boolean[vertices][vertices];
    }
    public void addedge(int i , int j){
        adjacentm[i][j] = true ;
        adjacentm[j][i] = true ;
    }
    public void removeedge(int i , int j){
        adjacentm[i][j] = false ;
        adjacentm[j][i] = false ;
    }
    public String Display(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < vertices; i++) {
          s.append(i + ": ");
          for (boolean j : adjacentm[i]) {
              if(j == true){
                  s.append(1 + " ");
              }
              else {
                  s.append(0 + " ");
              }
           
          }
          s.append("\n");
        }
        return s.toString();
    }
    public static void main(String args[]){
        Undirectedgraph G = new Undirectedgraph(10);
        G.addedge(0, 1);
        G.addedge(0, 2);
        G.addedge(1, 2);
        G.addedge(1, 3);
        G.addedge(2, 3);
        G.addedge(2, 4);
        G.addedge(2, 5);
        G.addedge(3, 4);
        G.addedge(4, 5);
        G.addedge(4, 6);
        G.addedge(5, 6);
        G.addedge(6, 7);
        G.addedge(7, 8);
        G.addedge(7, 9);
        G.addedge(8,9);
        G.addedge(1 , 6);
        G.addedge(1, 8);
        G.addedge(2,7);
        G.addedge(2, 9);
        G.addedge(3, 6);
        G.addedge(4, 9);
        G.addedge(4, 8);
        G.addedge(5, 7);

        System.out.println("Initially our graph representation : ");
        System.out.println(G.Display());
        G.removeedge(2, 1);
        System.out.println("Removing one edge : ");
        System.out.println(G.Display());

    }
}