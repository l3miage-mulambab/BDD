package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
public class User {
    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;

}
