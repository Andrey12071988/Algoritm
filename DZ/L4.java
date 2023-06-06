
public class L4 {
    public static void main(String[] args) {

        Mapa <Integer, String> mapa = new Mapa<>();
        System.out.println(mapa.put(1, "1"));
        System.out.println(mapa.put(2, "b"));
        System.out.println(mapa.put(3, "c"));
        System.out.println(mapa.put(4, "d"));
        System.out.println(mapa.put(17, "F+1"));
        System.out.println(mapa.put(18, "F+2"));
        System.out.println(mapa.put(33, "F+21"));
        System.out.println(mapa.put(1, "e"));
        System.out.println(mapa.put(2, null));
        System.out.println();

        // System.out.println(mapa.get(1));
        // System.out.println(mapa.get(106));
        // System.out.println(mapa.get(33));
        // System.out.println(mapa.get(2));
        // System.out.println();

        // System.out.println(mapa.remove(106));
        // System.out.println(mapa.remove(33));
        // System.out.println(mapa.remove(1));
        // System.out.println();

        // System.out.println(mapa.replays(1, "r"));
        // System.out.println(mapa.replays(33, "F+31"));
        // System.out.println();

        // System.out.println(mapa.size());
        // System.out.println();

        System.out.println(mapa.containsKey(1));
        System.out.println(mapa.containsKey(106));
        System.out.println(mapa.containsKey(2));
        System.out.println();

        System.out.println(mapa.containsValue("F+2"));
        System.out.println(mapa.containsValue("8"));

    }
}