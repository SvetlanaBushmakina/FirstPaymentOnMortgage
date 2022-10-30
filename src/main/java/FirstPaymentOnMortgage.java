public class FirstPaymentOnMortgage {
    public static void main(String[] args) {

        final int priceOfApartment = 2450000;
        System.out.println("Стоимость квартиры " + priceOfApartment + " рублей");

        final double percentFirstPaymentOnMortgage = 0.15;
        System.out.println("Первоначальный взнос по ипотеке " + percentFirstPaymentOnMortgage * 100 + " %");

        final double firstPaymentOnMortgage = priceOfApartment * percentFirstPaymentOnMortgage;
        System.out.println("Первоначальный взнос по ипотеке " + firstPaymentOnMortgage + " рублей");
    }
}
