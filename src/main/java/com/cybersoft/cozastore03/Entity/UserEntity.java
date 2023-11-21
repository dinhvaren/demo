package com.cybersoft.cozastore03.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity (name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;
//    thằng nào là chữ N, khóa ngoại thì luôn luôn là @ManyToOne, JoinColumn(tên cột trong database)
//    Nếu chữ cuối là one thì sẽ là một đối tượng của Entity tham chiếu tới
//    Nếu chữ cuối là Many thì sẽ là một list đối tượng của Entity tham chiếu tới
    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleEntity role;
}
