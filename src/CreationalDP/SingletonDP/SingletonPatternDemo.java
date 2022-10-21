package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // SingletonObject object2 = new SingletonObject(); //private oldugu icin new'leyemeyiz
        SingletonObject object2 = SingletonObject.getInstance();
        System.out.println(object2.message); //Merhaba
        object2.showMessage(); //Merhaba Batch 82-83

        // oluşan obje singleton mı test edelim
        SingletonObject object3 = SingletonObject.getInstance();
        System.out.println(object3.message); //Merhaba Batch 82-83
        //static variable oldugu icin sifirlanmadan en son hali geldi



    }
}
