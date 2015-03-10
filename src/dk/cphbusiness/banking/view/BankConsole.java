package dk.cphbusiness.banking.view;

import dk.cphbusiness.banking.control.BankManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankConsole {
  private BankManager manager;
  private boolean running = true;
  
  public BankConsole(BankManager manager) {
    this.manager = manager;
    }
  
  public void run() {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Fidus Bank");
    try {
      while (running) {
        System.out.print("Enter command: ");
        String line = in.readLine();
        // command in line will be used at a later point :-)
        int id = manager.createCustomer("Kurt");
        System.out.println("The new customer has id #"+id);
        System.out.println();
        }
      }
    catch (IOException ioe) {
      System.err.println("Der skete en uventet fejl, prøv at genstarte");
      }
    }
  
  }
