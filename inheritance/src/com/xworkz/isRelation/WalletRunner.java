package com.xworkz.isRelation;

import com.xworkz.inheritance.Keychain;
import com.xworkz.inheritance.Wallet;

    public class WalletRunner {
        public static void main(String[] args) {
            Keychain keychain = new Keychain();
            keychain.open();
            keychain.close();
            keychain.addCard();
            keychain.removeCard();
            keychain.checkMoney();

            System.out.println("--------------------------------------");

            Wallet wallet = new Keychain(); // Polymorphic reference
            wallet.open();
            wallet.close();
            wallet.addCard();
            wallet.removeCard();
            wallet.checkMoney();
        }
    }
