package com.feeapp.feenotifier.spi.db.entity;

import java.time.Instant;
import java.util.UUID;
import javax.persistence.*;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@Table(name = "user_details")
@Log4j2
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_id_sequence")
  Long id;

  @Column(name = "user_id", unique = true, updatable = false, nullable = false)
  private UUID userId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email", unique = true, updatable = false, nullable = false)
  private String email;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "password")
  private String password;

  @Column(name = "user_permission")
  private String userPermission;

  @Column(name = "created_at")
  @CreationTimestamp
  private Instant createdAt;

  @Column(name = "is_active")
  private Boolean isActive;
}
