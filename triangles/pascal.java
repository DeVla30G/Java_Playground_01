package triangles;

public class pascal {
    
    public static void main(String[] args) {
        int size = 26;
        int alphas = 65;

        for(int i = 1; i <= size; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char)(alphas+j));
            }
            System.out.println();
        }
        for(int i = 1; i <= size - 1; i++){
            for(int j = 0; j < size - i; j++){
                System.out.print((char)(alphas+j));
            }
            System.out.println();
        }
    }
}
