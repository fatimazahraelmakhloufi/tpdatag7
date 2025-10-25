package ma.enset.tpdatag7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.tpdatag7.enums.Genre;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="etudiants")
public class Etudiant {
    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nom_etudiant", nullable=false)
    private String nom;
    @Column(name="prenom_etudiant")
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
