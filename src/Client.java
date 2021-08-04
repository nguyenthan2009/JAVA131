public class Client {
    public static void main(String[] args) {
        Account kieuAnh = new Account();
        EmailNotification email = new EmailNotification();
        PhoneNotification phone = new PhoneNotification();
        AppNotificaton appNotificaton = new AppNotificaton();
        kieuAnh.add(email);
        kieuAnh.notification("Phi dich vu 11K");
        kieuAnh.add(phone);
        kieuAnh.notification("phi tien dien t2 2000K");
        kieuAnh.remove(email);
        kieuAnh.add(appNotificaton);
        kieuAnh.notification("phi tien dien t3 1990K");
    }
}
