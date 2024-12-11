package mk.ukim.finki.lab.repository;
import mk.ukim.finki.lab.bootstrap.DataHolder;
import mk.ukim.finki.lab.model.Artist;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ArtistRepository {
    public List<Artist> findAll() {
        return DataHolder.artists;
    }
    public Optional<Artist> findById(Long id){
        return DataHolder.artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }
}