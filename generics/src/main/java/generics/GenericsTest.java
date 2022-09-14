package generics;

public class GenericsTest {

    public static void main(String[] args) {
        PilaGenerica<Integer> pInt = new PilaGenerica<>();
        pInt.push(10);
        pInt.push(20);
        pInt.push(30);
        System.out.println(pInt.pop());
        System.out.println(pInt.pop());
        System.out.println(pInt.pop());
        System.out.println(pInt.pop());
        PilaGenerica<String> pStr = new PilaGenerica<>();
        pStr.push("Arbol");
        pStr.push("Casa");
        pStr.push("Auto");
        System.out.println(pStr.pop());
        System.out.println(pStr.pop());
        System.out.println(pStr.pop());
    }
}
