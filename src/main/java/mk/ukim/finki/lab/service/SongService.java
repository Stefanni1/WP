package mk.ukim.finki.lab.service;
import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;
import java.util.List;
import java.util.Optional;

public interface SongService{
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Optional<Song> findByTrackId(String trackId);
    void saveSong(Song song, Long albumId);
    Optional<Song> findById(Long songId);

    void deleteSongById(Long songId);
}
