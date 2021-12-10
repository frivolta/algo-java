package util.structures;

public class Vertex<T> {
    public boolean visited = false;
    public T value;

    public Vertex(T value){
        this.value=value;
    }

    @Override
    public String toString(){
        StringBuilder v= new StringBuilder();
        v.append(this.value);
        return v.toString();
    }
}
