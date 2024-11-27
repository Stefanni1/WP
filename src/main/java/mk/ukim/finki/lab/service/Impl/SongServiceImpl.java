package mk.ukim.finki.lab.service.Impl;
import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;
import mk.ukim.finki.lab.repository.SongRepository;
import mk.ukim.finki.lab.service.SongService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class SongServiceImpl implements SongService {
    public final SongRepository songRepository;
    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }
    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist,song);
    }
    @Override
    public Optional<Song> findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId);
    }
}