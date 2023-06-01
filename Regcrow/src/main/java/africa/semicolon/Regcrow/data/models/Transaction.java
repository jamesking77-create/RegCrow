package africa.semicolon.Regcrow.data.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Payment payment;

    private Long sellerId;

    private Long buyerId;

    private LocalDateTime timeCreated;

    private TransactionStatus status;
}
