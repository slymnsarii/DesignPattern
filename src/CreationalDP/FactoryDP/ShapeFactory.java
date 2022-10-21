package CreationalDP.FactoryDP;

public class ShapeFactory { //bu class'in amaci uretecegimiz sekillerle alakali gelen taleplere cevap vermek

    public Shape getShape(String shapeType){ //o yuzden donen deger Shape olmali,eger Shape'i inteface yapmasaydik
                                             //her method(circle,quare..) icin tek tek yazacaktim
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(); //return ifadelerde yeni bir variable olusturmamiza gerek yok,
                                // olusan yeni objeyi olusturup on tarafa gonderiyoruz
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null; //if'lerden hic biri olmazsa null dondur
    }

}


























