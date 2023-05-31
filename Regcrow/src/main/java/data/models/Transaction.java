package data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Payment payment;

    private Long sellerId;

    private Long buyerId;

    private LocalDateTime createdAt;
    private TransactionStatus status;
}
