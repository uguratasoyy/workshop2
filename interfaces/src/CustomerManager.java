public class CustomerManager {
    private iCustomerDal customerDal;
    public CustomerManager(iCustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add() {
        customerDal.Add();
    }
}
