package mk.ukim.finki.lab.service.Impl;
import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.repository.ArtistRepository;
import mk.ukim.finki.lab.repository.SongRepository;
import mk.ukim.finki.lab.service.ArtistService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ArtistServiceImpl implements ArtistService {
    public final ArtistRepository artistRepository;
    public ArtistServiceImpl(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
    }
    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }
    @Override
    public Artist findById(Long id) {
        return artistRepository.findById(id).orElse(null);
    }
}