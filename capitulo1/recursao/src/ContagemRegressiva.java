public class ContagemRegressiva {
    public static void main(String[] args) {
       regressiva(10);
    }

    public static void regressiva(int i){
        if(i < 1){
            System.out.println("Feliz ano novo!!!");
            return;
        } else {
            System.out.println(i);
            regressiva(i-1);
        }
    }
}