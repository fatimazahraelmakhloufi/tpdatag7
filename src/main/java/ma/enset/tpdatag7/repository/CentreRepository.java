package ma.enset.tpdatag7.repository;

import ma.enset.tpdatag7.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "centres")
public interface CentreRepository extends JpaRepository<Centre,Long> {
    List<Centre> findCentreByNom (@Param("nom") String nom);
}
