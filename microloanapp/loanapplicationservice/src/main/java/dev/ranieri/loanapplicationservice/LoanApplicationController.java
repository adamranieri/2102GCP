package dev.ranieri.loanapplicationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class LoanApplicationController {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("loans/apply")
    public Loan applyForLoan(@RequestBody LoanApplicationDTO applicationDTO){

        if(applicationDTO.getCreditScore()<700){
            throw new ResponseStatusException(HttpStatus.ACCEPTED,"You do qualify with your AWFUL credit");
        }

        // if we are good on credit we need to create loan and send it to the persistence service to be saved.
        Loan loan = new Loan(0,
                applicationDTO.getSsId(),
                applicationDTO.getAmountRequested(),
                applicationDTO.getAmountRequested()*2,
                applicationDTO.getAmountRequested()*2/12,
                applicationDTO.getReason()
                );

        ResponseEntity<Loan> responseEntity = this.restTemplate.postForEntity("http://loadcrud/loans",loan,Loan.class);
        Loan createdLoan = responseEntity.getBody();

        return  createdLoan;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "everything is AWESOME!!!!";
    }

}
