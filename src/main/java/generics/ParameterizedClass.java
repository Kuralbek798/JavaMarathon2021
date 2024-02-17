package generics;

public class ParameterizedClass {

    public static void main(String[] args){
        /**
         * тут мы используем дженерики для указания типа данных с которыми может работать данный класс и его объекты
         * точнее у нас динамический тип данных который определяется при создании объекта и он задает правила для всех полей и методов класса где в качестве типа определен тип <T>
         */
        Info<String> info = new Info<>("Hello World!!!",1000);
        System.out.printf("%s,%d\n",info.getValue(),info.getSdf());

        Info<Integer>  info2 = new Info<>(3424,1000);
        int valueInfo2 = info2.getValue();
        System.out.printf("%d,%d\n",valueInfo2,info2.getSdf());
    }
}

class Info<T>{
    private T value;
    private int sdf;

    public int getSdf() {
        return sdf;
    }

    public T getValue() {
        return value;
    }

    public Info(T value,int sdf){
        this.value = value;
        this.sdf = sdf;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
