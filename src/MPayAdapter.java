public class MPayAdapter implements PPay {
  private MPay mpay;

  public MPayAdapter(MPay mpay) {
    this.mpay = mpay;
  }

  @Override
  public String getCustCardNo() {
    return mpay.getCreditCardNo();
  }

  @Override
  public String getCardOwnerName() {
    return mpay.getCustomerName();
  }

  @Override
  public String getCardExpMonthDate() {
    return mpay.getCardExpMonth();
  }

  @Override
  public Integer getCVVNo() {
    return mpay.getCardCVVNo().intValue();
  }

  @Override
  public Double getTotalAmount() {
    return mpay.getAmount();
  }

  @Override
  public void setCustCardNo(String custCardNo) {
    mpay.setCreditCardNo(custCardNo);
  }

  @Override
  public void setCardOwnerName(String cardOwnerName) {
    mpay.setCustomerName(cardOwnerName);
  }

  @Override
  public void setCardExpMonthDate(String cardExpMonthDate) {
    mpay.setCardExpMonth(cardExpMonthDate);
  }

  @Override
  public void setCVVNo(Integer cVVNo) {
    mpay.setCardCVVNo(cVVNo.shortValue());
  }

  @Override
  public void setTotalAmount(Double totalAmount) {
    mpay.setAmount(totalAmount);
  }

}
