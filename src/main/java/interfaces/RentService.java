package interfaces;

public class RentService {

    private SmsService smsService;
    private  EmailService emailService;
    private InvoiceService invoiceService;

    public RentService(SmsService smsService, EmailService emailService, InvoiceService invoiceService) {
        this.smsService = smsService;
        this.emailService = emailService;
        this.invoiceService = invoiceService;
    }

//    public void rent(Car car, int hours) {
//        smsService.sendRentConfirmation(car);
//        emailService.sendRentConfirmation(car);
//        invoiceService.generateInvoice(car,hours);
//
//    }
//
//    public void rent(Scooter scooter, int hours) {
//        smsService.sendRentConfirmation(scooter);
//        emailService.sendRentConfirmation(scooter);
//        invoiceService.generateInvoice(scooter,hours);
//
//    }
    public void rent(Rentable rentable, int hours) {
        smsService.sendRentConfirmation(rentable);
        emailService.sendRentConfirmation(rentable);
        invoiceService.generateInvoice(rentable, hours);

    }
}
