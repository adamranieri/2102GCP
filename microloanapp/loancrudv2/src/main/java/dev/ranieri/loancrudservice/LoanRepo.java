package dev.ranieri.loancrudservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends CrudRepository<Loan,Integer> {
}
