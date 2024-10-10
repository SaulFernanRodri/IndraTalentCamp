package ejercicios.modulo2;


public class Ejemplo9 {

    public static void main(String[] args) {
        // StringBuffer example multihilo
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer append: " + stringBuffer);

        stringBuffer.insert(5, ",");
        System.out.println("StringBuffer insert: " + stringBuffer);

        stringBuffer.replace(6, 11, "Java");
        System.out.println("StringBuffer replace: " + stringBuffer);

        stringBuffer.delete(5, 6);
        System.out.println("StringBuffer delete: " + stringBuffer);

        stringBuffer.reverse();
        System.out.println("StringBuffer reverse: " + stringBuffer);

        // StringBuilder example no multihilo
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println("StringBuilder append: " + stringBuilder);

        stringBuilder.insert(5, ",");
        System.out.println("StringBuilder insert: " + stringBuilder);

        stringBuilder.replace(6, 11, "Java");
        System.out.println("StringBuilder replace: " + stringBuilder);

        stringBuilder.delete(5, 6);
        System.out.println("StringBuilder delete: " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("StringBuilder reverse: " + stringBuilder);
    }
}

