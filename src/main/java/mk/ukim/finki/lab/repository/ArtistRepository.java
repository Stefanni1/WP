package mk.ukim.finki.lab.repository;

import mk.ukim.finki.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ArtistRepository {
    private List<Artist> artists;

    public ArtistRepository() {
        artists = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            artists.add(new Artist(
                    Long.parseLong(String.valueOf(i)),
                    String.format("ArtistName%d", i),
                    String.format("ArtistLastName%d", i),
                    String.format("Bio%d", i)));
        }
    }

    public List<Artist> findAll() {
        return artists;
    }

    public Optional<Artist> findById(Long id) {
        return artists.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }
}