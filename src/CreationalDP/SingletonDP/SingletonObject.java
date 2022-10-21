package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "Merhaba";

    private static SingletonObject instance = new SingletonObject();
    //bir objenin olusabilmesi icin constructor'ina ulasilabiliyor ve cagrilabiliyor(new) olmasi lazim
    //bunu onlemek icin kimsenin objeyi new'leyememesi icin asagida constructor'i private'a cekeriz

    private SingletonObject(){};
    //Constructor'i private cektigim zaman ilgili objeye ulasma yolum Singleton ile olur


    //bir obje uretmeden o objeye ait bir method'a ulasmak istiyorsam o method'u static variable koyarim
    /*
    buraya oyle bir method yazalim ki bu method'un donen degeri yukarda static private(7) ettigimiz variable'i
    dondurelim(28) fakat getInstance method'una ulasmak icin SingletonObject(2) objesine ihtiyacimiz olmasin
    o yuzden bu method'u(getInstance) static yapariz
     */
    public static SingletonObject getInstance(){
        //bir class'in icerisinde class'i turetmeden method'a ulasmak istiyorsak o method'u static yapariz
        //getInstance() method'una ulasmak icin SingletonObject() objesini new'lemeden
        // SingletonObject.getInstance() dedigimiz zaman ulasiriz
        //obje uretmeden method'a ulasiriz boylece ve method'un icerisinde oyle bir instance dondururuz ki
        //static olarak donuyor bu her defasinda ayni sey donuyor

        return instance;
    }

    public void showMessage(){
        this.message = this.message + " Batch 82-83";
        System.out.println(this.message);
    }
}
// SingletonObject obje1 = new SingletonObject();