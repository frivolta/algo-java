package stringsandarrays;

import java.util.Arrays;

public class RotateMatrix {
    public int[][] matrix = {{0,1,2},{3,4,5},{6,7,8}};

    // Transpose matrix turn rows to columns
    private void switchColumnRows(){
        int N = this.matrix.length;
        for(int r=0; r<N;r++){
            for(int c=r;c<N;c++){
                int temp = this.matrix[r][c];
                this.matrix[r][c] = this.matrix[c][r];
                this.matrix[c][r]=temp;
            }
        }
    }

    // Invert columns
    public void invertColumns(){
        int N = this.matrix.length;
        for(int r=0; r<N;r++){
            for(int c =0;c<(N/2);c++){
                int temp = this.matrix[r][c];
                this.matrix[r][c] = this.matrix[r][N-1-c];
                this.matrix[r][N-1-c] = temp;
            }
        }
    }

    public int[][] main(){
        switchColumnRows();
        invertColumns();
        return this.matrix;
    }

}
