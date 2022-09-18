public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox(3);
        System.out.println(magicBox.add("Petya"));
        System.out.println(magicBox.add("Tanya"));
        //System.out.println(magicBox.add("Nastya"));
        System.out.println(magicBox.add("Misha"));
        System.out.println(magicBox.pick());

        MagicBox<Integer> integerMagicBox = new MagicBox(4);


    }
}
