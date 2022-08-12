package exercise01.final_exam_02.service;


import exercise01.final_exam_02.model.Account;
import exercise01.final_exam_02.model.PaymentAccount;
import exercise01.final_exam_02.model.SavingAccount;
import exercise01.final_exam_02.util.Constant;
import exercise01.final_exam_02.util.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BankService {
    private List<Account> accounts = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();

    public BankService() {
        accounts = writeToAccount();
    }

    public void create(Account account){
        int lastId = 0;
        if (accounts.size() > 0) {
            lastId = accounts.get(accounts.size() - 1).getId();
        }

        account.setId(lastId + 1);
        accounts.add(account);
        fileHelper.write(Constant.path, Collections.singletonList(account), true);
    }

    public void delete(int id){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId() == id) {
                accounts.remove(i);
                fileHelper.write(Constant.path, accounts, false);
                return;
            }
        }
    }

    public List findAll(){
        return accounts;
    }

    private List writeToAccount(){
        List result = new ArrayList();

        List<String> lines = fileHelper.read(Constant.path);
        for (String line : lines) {
            String[] tmp = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String code = tmp[1];
            String name = tmp[2];
            String date = tmp[3];

            if (tmp.length == 8) {
                double sotiengui = Double.parseDouble(tmp[4]);
                String ngaygui = tmp[5];
                double laixuat = Double.parseDouble(tmp[6]);
                int kyhan = Integer.parseInt(tmp[7]);
                result.add(new SavingAccount(id, code, name, date,sotiengui,ngaygui,laixuat,kyhan));
            } else {
                String soThe = tmp[4];
                double sotien = Double.parseDouble(tmp[5]);
                result.add(new PaymentAccount(id, code, name,date,soThe,sotien));
            }
        }
        return result;
    }

    public void searching(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Find Account by Inputting Code or Name below: ");
        String search = scanner.nextLine();
        if (accounts.isEmpty()){
            System.out.println("The list is empty!");
        }
        for (int i = 0; i < accounts.size(); i++){
            if (!search.equals(accounts.get(i).getCode()) || !search.equals(accounts.get(i).getName())) {
                System.out.println("Can't find the Account with Code or Name: " + search);
            }else {
                System.out.println(accounts.get(i).toString());
            }
        }
    }
}
