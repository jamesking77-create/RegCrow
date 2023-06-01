package africa.semicolon.Regcrow.data.repositories;

import africa.semicolon.Regcrow.data.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
