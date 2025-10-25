package ma.enset.tpdatag7;

import ma.enset.tpdatag7.enums.Genre;
import ma.enset.tpdatag7.model.Etudiant;
import ma.enset.tpdatag7.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tpdatag7Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Tpdatag7Application.class, args);

    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant et1=Etudiant.builder()
                .nom("Benha")
                .prenom("Mehdi")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2=Etudiant.builder()
                .nom("Elmakhloufi")
                .prenom("Fatimazahra")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et2);
    }

}
