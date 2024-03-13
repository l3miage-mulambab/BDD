package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Session {
    @Id
    private UUID idSession;
    private String lastCommand;
    private String currentDir;
    private boolean lock;
    @OneToOne(mappedBy = "idUser")
    private User idUser;
}