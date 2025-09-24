package phase2.Model;

import phase2.Services.NotificationService.*;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String password;
    private double balance;
    private String Number;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    // Constructor
    public Customer( int customerId , String name, String email, String password, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods
    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void deductBalance(double amount) {
        this.balance -= amount;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getPassword() {
        return password;
    }

    public void Print() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance);
    }

    public boolean equals(int customerId) {
        return this.customerId == customerId;
    }

    public String  SendMessage(String MesType,Product P){

        FactroyMessage obj=new FactroyMessage();

        IMessage Mes = obj.FindType(MesType);


        FactoryChannel FactoryChannels = new FactoryChannel();

        Channel Chan = FactoryChannels.CreateChannel( GetContact() );

        return Chan.Send(this,Mes.CreateMessage(this,P));
    }
    public boolean GetContact(){
        if(!email.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
}
