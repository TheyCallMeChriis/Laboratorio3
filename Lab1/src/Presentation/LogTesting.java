/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.Client;
import Logic.CheckingAccount;
import Logic.Log;
import Logic.SavingAccount;

/**
 *
 * @author estudiante
 */
public class LogTesting {

    public LogTesting() {
    }

    public void test() {
        Client clients[] = new Client[10];
        Client client1 = new Client("7-0123-1663", "Pepe", "89898985", "Limon, Cocos");
        Client client2 = new Client("7-0340-7099", "Marco", "89159024", "Limon, Cahuita");
        Client client3 = new Client("7-0490-1200", "Carla", "62790340", "Limon, Siquirres");
        clients[0] = client1;
        clients[1] = client2;
        clients[3] = client3;
        
        SavingAccount account1 = new SavingAccount ("2024-03-15", 12, 15, "104320", 23000 , client1);
        SavingAccount account2 = new SavingAccount ("2024-03-15", 6, 12, "104561", 10000 , client2);
        
        CheckingAccount checkAccount = new CheckingAccount(20, "103460", 46000, client3);
        Log log[] = new Log[5];
        
        log[0] = new Log (1, "Saving Amount", account1, 9000);
        log[1] = new Log (2, "withdrad Amount", account2, 5000);
        log[2] = new Log (3, "Saving Amount", checkAccount, 4000);
        for(int i = 0; i < log.length; i++){
         if(log[i]!=null)
                System.out.println(log[i].toString());
        }
        
    }
}
