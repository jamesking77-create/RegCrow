package data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccount extends JpaRepository<data.models.BankAccount, Long> {
}
