package edu.uth;

class Customer extends User implements IBooking {
    public Customer(String id, String name_user, String email, String phone) {
        super(id, name_user, email, phone);
    }

    public void takeSkinAssessment() {

    }

    public void makePayment() {

    }

    public void provideFeedback() {

    }

    @Override
    public void bookService() {

    }

    @Override
    public void cancelService() {

    }
}


