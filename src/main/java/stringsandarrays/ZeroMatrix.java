package stringsandarrays;

import java.util.Arrays;
import java.util.HashSet;

public class ZeroMatrix {
    private int[][] matrix = {{13,18,3,4},{0,18,3,4},{13,18,0,4},{13,18,3,4},};
    HashSet<Integer> rwz = new HashSet<Integer>();
    HashSet<Integer> cwz = new HashSet<Integer>();

    public void findZeros(){
        int R = this.matrix.length;
        int C = this.matrix[0].length;
        for(int i =0; i<R; i++){
            for(int j=0; j<C; j++){
                if(matrix[i][j]==0){
                    this.rwz.add(i);
                    this.cwz.add(j);
                }
            }
        }
    }


    public void replaceWithZeros(){
        int C = this.matrix[0].length;
        for(int r: rwz){
            for(int i=0; i<C; i++){
                this.matrix[r][i] = 0;
            }
        }
        for(int c:cwz){
            for(int i=0; i<this.matrix.length;i++){
                this.matrix[i][c]=0;
            }
        }
    }

    public int[][] main(){
        findZeros();
        replaceWithZeros();
        return this.matrix;
    }

}
