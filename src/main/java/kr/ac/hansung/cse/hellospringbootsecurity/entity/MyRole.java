package kr.ac.hansung.cse.hellospringbootsecurity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="roles")
@Getter
@Setter
@NoArgsConstructor
public class MyRole
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(nullable=false, unique=true)
    private String rolename;

    @ManyToMany(mappedBy="roles")
    private List<MyUser> users;

    public MyRole(String rolename) {
        this.rolename = rolename;
    }
}
