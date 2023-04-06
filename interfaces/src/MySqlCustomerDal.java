public class MySqlCustomerDal implements iCustomerDal, IRepository{
    @Override
    public void Add() {
        System.out.println("My sql eklendi.");
    }
}
