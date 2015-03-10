package dk.cphbusiness.banking.control;

public interface BankManager {
  int createCustomer(String name);
  String createAccount(int customerId);
  boolean transferAmount(String sourceNumber, String targetNumber, int amount);
  }
