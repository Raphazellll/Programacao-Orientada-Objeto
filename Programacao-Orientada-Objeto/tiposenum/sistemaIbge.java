package tiposenum;

public class sistemaIbge {
    public static void main(String[] args) {
        for (estadoBrasileiro e : estadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        estadoBrasileiro eb = estadoBrasileiro.RIO_JANEIRO;
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
    }
}
