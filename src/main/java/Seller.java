import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Seller implements Runnable {
    Shop shop;

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public synchronized Car sellCar() {
        System.out.println(Thread.currentThread().getName() + " начинает покупку");
        try {
            while (shop.getCars().size() == 0) {
                System.out.println("товара нет в наличии. ожидайте");
                wait();

            }
            Thread.sleep(1000);
            System.out.println("Машина продана");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return shop.getCars().remove(0);
    }


    public synchronized void releaseСar() {

            try {

                    shop.getCars().add(new Car("BMW"));
                    System.out.println(Thread.currentThread().getName() + " выпустил 1 авто");
                    Thread.sleep(2000);
                    notifyAll();


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    @Override
    public void run() {

    }
}
