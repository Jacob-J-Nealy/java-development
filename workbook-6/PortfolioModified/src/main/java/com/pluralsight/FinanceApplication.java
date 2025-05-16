package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Person;
import com.pluralsight.finance.Valuable;

import java.util.ArrayList;
import java.util.List;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount( "Pam", "123", 12500);
        Valuable account2 = new BankAccount( "Gary","456", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);
        // account2.deposit(100);
        //__________________________________________________________________________________________

        // Make a New Array List for Person Objects
        List<Person> myFamily = new ArrayList<>();

        // Adding Family Members to Array List
        myFamily.add(new Person("Joseph", "Nealy", 21));
        myFamily.add(new Person("Benjamin", "Nealy", 17));
        myFamily.add(new Person("Micheal", "Nealy", 61));
        myFamily.add(new Person("Michelle", "Nealy", 52));


    }
}