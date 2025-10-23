public class Arrayhewan {
    public static void main(String[] args) {
        String hewan[]={"musang", "kancil", "hiu", "kucing", "babi"};
        System.out.println("hewan yang memiliki nama lebih dari 4 karakter"); 

        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length()>4){
                System.out.println(hewan[i]);
            }
        }
    }
}
