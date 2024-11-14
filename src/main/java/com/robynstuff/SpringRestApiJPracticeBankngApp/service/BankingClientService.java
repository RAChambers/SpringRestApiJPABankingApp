package com.robynstuff.SpringRestApiJPracticeBankngApp.service;

import com.robynstuff.SpringRestApiJPracticeBankngApp.model.BankingClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankingClientService {

    public String createBankingClient(BankingClient bankingClient);
    public String updateBankingClient(BankingClient bankingClient);
    public String deleteBankingClient(String clientId);
    public BankingClient getBankingClient(String clientId);
    public List<BankingClient> getAllBankingClients();
}
