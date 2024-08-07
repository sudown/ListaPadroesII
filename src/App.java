public class App {
  public static void testPPay(PPay pp) {
    System.out.println(pp.getCardOwnerName());
    System.out.println(pp.getCustCardNo());
    System.out.println(pp.getCardExpMonthDate());
    System.out.println(pp.getCVVNo());
    System.out.println(pp.getTotalAmount());
  }

  public static void main(String[] args) throws Exception {
    MPay mpay = new MpayImpl();
    mpay.setCreditCardNo("1234567890123456");
    mpay.setCustomerName("John Doe");
    mpay.setCardExpMonth("12");
    mpay.setCardExpYear("2024");
    mpay.setCardCVVNo((short) 123);
    mpay.setAmount(100.0);

    MPayAdapter adapter = new MPayAdapter(mpay);
    testPPay(adapter);
  }
}
