package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    private Integer id;
    private String uuid;
    private String lastname;
    private String firstname;
    private Sex sex;
    private LocalDate birthDate;
    @OneToOne
    private NetflixAccountEntity netflixAccount;
}

