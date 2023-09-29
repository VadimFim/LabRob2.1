public class PhoneStore {
    public static void main(String[] args) {
        Samsung samsung1 = new Samsung("Samsung Galaxy A10",110,"Grey",6,0);
        samsung1.info();
        samsung1.worktimeinfo();
        Iphone iphone1 = new Iphone("Iphone 11 Pro",107,"White",5.5, 0);
        iphone1.info();
        iphone1.worktimeinfo();
        Xiaomi xiaomi = new Xiaomi("Xiaomi Redmi 12 Note",92,"Black",6.2,0);
        xiaomi.info();
        xiaomi.worktimeinfo();
    }
}
