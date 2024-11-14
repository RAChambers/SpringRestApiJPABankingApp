package com.robynstuff.SpringRestApiJPracticeBankngApp.repository;

import com.robynstuff.SpringRestApiJPracticeBankngApp.model.BankingClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingClientRepository extends JpaRepository<BankingClient, String> {
}
