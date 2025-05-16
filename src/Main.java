//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-------- Box class as String --------");
        Box<String> boxString = new Box<>();
        boxString.setValue("Hello World!");
        System.out.println(boxString.getValue());
        System.out.println("-------- Box class as Integer --------");
        Box<Integer> boxInteger = new Box<>();
        boxInteger.setValue(100);
        System.out.println(boxInteger.getValue());

        System.out.println("--------Utilize Print Array method for String--------");
        Printing.printArray(new String[]{"Alesco", "adrian", "liana", "tina"});
        System.out.println("--------Utilize Print Array method for Integer--------");
        Printing.printArray(new Integer[]{10,20, 30, 40 , 50});

        System.out.println(boxString.getData("userCache", "user123", String.class));
    }
}