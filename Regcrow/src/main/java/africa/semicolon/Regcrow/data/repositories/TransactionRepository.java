package africa.semicolon.Regcrow.data.repositories;

import africa.semicolon.Regcrow.data.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
