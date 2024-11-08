import java.util.Arrays;

public class assg2_que1 {
    public static void main(String[] args) {
        int [] a={4,5,8,10,13,15,22};
        int [] b={3,9,14,16, 18,20};

        int i=0, j=0, k=0, n=a.length + b.length;
        int[] c = new int[n];

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i<a.length) {
            c[k++] = a[i++];
        }
        while (j<b.length){
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
    }
}
