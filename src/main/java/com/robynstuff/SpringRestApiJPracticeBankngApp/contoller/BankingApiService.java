package com.robynstuff.SpringRestApiJPracticeBankngApp.contoller;


import com.robynstuff.SpringRestApiJPracticeBankngApp.model.BankingClient;
import com.robynstuff.SpringRestApiJPracticeBankngApp.service.BankingClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankingclient")
public class BankingApiService {

    BankingClientService bankingClientService;

    public BankingApiService(BankingClientService bankingClientService) {
        this.bankingClientService = bankingClientService;
    }

    @GetMapping("{clientId}")
    public BankingClient getBankingClientDetails(@PathVariable("clientId") String clientId) {
        return bankingClientService.getBankingClient(clientId);

    }
    @GetMapping()
    public List<BankingClient> getAllBankingClientDetails() {
        return bankingClientService.getAllBankingClients();

    }
    @PostMapping
    public String createBankingClientDetails(@RequestBody BankingClient bankingClient){
        bankingClientService.createBankingClient(bankingClient);
        return "Banking Client Created Successfully!";
    }
    @PutMapping
    public String updateBankingClientDetails(@RequestBody BankingClient bankingClient) {
        bankingClientService.updateBankingClient(bankingClient);
        return "Banking Client Details Have Been Updated Successfully!";
    }

    @DeleteMapping("{clientId}")
    public String deleteBankingClientDetails(@PathVariable("clientId") String clientId){
        bankingClientService.deleteBankingClient(clientId);
        return "Banking Client Details have been updated successfully!";
    }
}