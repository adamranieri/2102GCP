package dev.ranieri.loancrudservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RestController
public class LoanController {

    @Autowired
    LoanRepo loanRepo;

    @GetMapping("/loans/{id}")
    public Loan getLoanById(@PathVariable int id){
        Loan loan = this.loanRepo.findById(id).get();
        return  loan;
    }

    @GetMapping("/loans")
    public Set<Loan> getAllLoans(){
        Set<Loan> loans = new HashSet<Loan>((Collection<? extends Loan>) this.loanRepo.findAll()) ;
        return  loans;
    }

    @PostMapping("/loans")
    public Loan createLoan(@RequestBody Loan loan){
        this.loanRepo.save(loan);
        return loan;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return  "All is good";
    }




}
