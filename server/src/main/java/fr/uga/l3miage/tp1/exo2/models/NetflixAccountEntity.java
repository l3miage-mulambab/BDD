package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {
    @Id
    private Integer id;
    private int nbDevices;
    private TypeAccount typeAccount;
    @OneToOne(mappedBy = "netflixUser")
    private NetflixUserEntity netflixAccount;



}
