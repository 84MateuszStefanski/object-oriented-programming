package interfaces;

public class Main {
    public static void main(String[] args) {
        SmsService sms = new SmsService();
        EmailService email = new EmailService();
        InvoiceService invoice = new InvoiceService();
        RentService rentService = new RentService(sms,email,invoice);

        Car car = new Car("Hyundai" ,"Tucson",2018);
        rentService.rent(car,3);

        Scooter scooter = new Scooter("Xiaomi ");
        rentService.rent(scooter,3);

        Trailer trailer = new Trailer(50);
        rentService.rent(trailer,3);



    }
}
