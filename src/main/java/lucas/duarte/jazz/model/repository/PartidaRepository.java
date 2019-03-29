package lucas.duarte.jazz.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lucas.duarte.jazz.model.bean.Partida;

@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long> {
	//E possivel criar metodos de query especificos aqui
	public Partida findOneByTimeA(String timea);
	public Partida findSetById(Long id);
	
}
