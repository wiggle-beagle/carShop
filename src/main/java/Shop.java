import java.util.ArrayList;
import java.util.List;

public class Shop implements Runnable {
    List<Car> cars = new ArrayList<>();
    Seller seller = new Seller(this);

    public List<Car> getCars() {
        return cars;
    }

    public Car sellCar(){
   return seller.sellCar();

}

public void releaseСar(){
        seller.releaseСar();
}

    @Override
    public void run() {

    }
}
