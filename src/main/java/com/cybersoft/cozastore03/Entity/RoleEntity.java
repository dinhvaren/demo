package com.cybersoft.cozastore03.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "role") // lưu ý: tên thuộc tính của entity bên bảng UserEntity
    private List<UserEntity> users;
}
