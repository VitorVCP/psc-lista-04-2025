public class Paises {
    public static void main(String[] args) {
        int a = 80000, b = 200000, ano = 0;
        System.out.println("Em um país tem 80.000 habitantes e em outro, tem 200.000 habitantes, no primeiro, cresce 3% ao ano, e no segundo, cresce 1,5% ao ano.\n");
        
        while (a <= b) {
            a += a * 0.03;
            b += b * 0.015;
            ano ++;
        }
        System.out.println("Ira demorar " + ano + " anos para que o primeiro país ultrapasse o outro.");
    }
}