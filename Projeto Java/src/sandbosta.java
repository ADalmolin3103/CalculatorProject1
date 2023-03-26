import Classes.Calculate;

public class sandbosta {
    public static void main(String[] args) {
        //Testando REGEX para double. Vou precisar alterar as regex
        String str = "20 10 / 2 +";
        Calculate cal = new Calculate(str, false);
        System.out.println(cal.resolve());
    }
}
