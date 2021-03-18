import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();



        new Thread(shop::sellCar, "пользователь1").start();
        new Thread(shop::sellCar, "пользователь2").start();
        new Thread(shop::sellCar, "пользователь3").start();

        new Thread(shop::releaseСar, "производитель BMW").start();




    }
}
