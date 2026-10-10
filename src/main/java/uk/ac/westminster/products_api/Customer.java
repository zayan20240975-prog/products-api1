package uk.ac.westminster.products_api;

public class Customer {
    private long id;
    private String name;
    private String email;
    private Adress adress;

    public Customer(){

    }
    public Customer(Long id,String name,String email,Adress adress){
        this.id=id;
        this.name=name;
        this.email=email;
        this.adress=adress;
    }
    public long getId(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Adress getAdress(){
        return adress;
    }
}
