public class Miles {
    public static void main(String[] args) {
        double priceTicket = 25437.82;
        // За каждые 20 рублей , одна миля.
        int miles = (int)priceTicket/20;
        System.out.println(miles);
    }
}
