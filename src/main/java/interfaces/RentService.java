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

    public void rent(Car car, int hours) {
        smsService.sentRentConfirmation(car);
        emailService.sentRentConfirmation(car);
        invoiceService.generateInvoice(car,hours);

    }

    public void rent(Scooter scooter, int hours) {
        smsService.sentRentConfirmation(scooter);
        emailService.sentRentConfirmation(scooter);
        invoiceService.generateInvoice(scooter,hours);

    }
}
