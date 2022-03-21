package me.yeonnex.auth_service.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username; // 아이디
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private RoleType role;

    @CreationTimestamp // 시간 자동으로 입력됨됨
    private Timestamp createDate;
}
