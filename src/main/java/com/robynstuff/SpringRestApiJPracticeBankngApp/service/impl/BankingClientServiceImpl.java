package com.robynstuff.SpringRestApiJPracticeBankngApp.service.impl;

import com.robynstuff.SpringRestApiJPracticeBankngApp.model.BankingClient;
import com.robynstuff.SpringRestApiJPracticeBankngApp.repository.BankingClientRepository;
import com.robynstuff.SpringRestApiJPracticeBankngApp.service.BankingClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankingClientServiceImpl implements BankingClientService {

    BankingClientRepository bankingClientRepository;

    public BankingClientServiceImpl(BankingClientRepository bankingClientRepository) {
        this.bankingClientRepository = bankingClientRepository;
    }

    @Override
    public String createBankingClient(BankingClient bankingClient) {
        bankingClientRepository.save(bankingClient);
        return "Your client info has been saved successfully!";
    }

    @Override
    public String updateBankingClient(BankingClient bankingClient) {
        bankingClientRepository.save(bankingClient);
        return "Your client info has been updated successfully!";
    }

    @Override
    public String deleteBankingClient(String clientId) {
        bankingClientRepository.deleteById(clientId);
        return "The selected client info has been deleted.";
    }

    @Override
    public BankingClient getBankingClient(String clientId) {
       return bankingClientRepository.findById(clientId).get();
    }

    @Override
    public List<BankingClient> getAllBankingClients() {
        return bankingClientRepository.findAll();
    }
}
