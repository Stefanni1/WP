package mk.ukim.finki.lab.service;
import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;
import java.util.List;
public interface ArtistService{
    List<Artist> listArtists();
    Artist findById(Long id);
}