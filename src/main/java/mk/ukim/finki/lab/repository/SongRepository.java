package mk.ukim.finki.lab.repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;
import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
    private List<Song>songs;
    public SongRepository(){
            songs = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            songs.add(new Song(String.valueOf(i), String.format("Title%d", i), String.format("Genre%d", i), 2000 + i, new ArrayList<>()));
            }
        }
    public List<Song> findAll() {
        return songs;
    }

    public Optional<Song> findByTrackId(String trackId) {
        return songs.stream().filter(song -> song.getTrackId().equals(trackId)).findFirst();
    }

    public Artist addArtistToSong(Artist artist, Song song) {
        songs.stream().filter(tempSong -> tempSong.equals(song)).forEach(tempSong -> {
            List<Artist> currentPerformers = tempSong.getPerformers();
            currentPerformers.add(artist);
            tempSong.setPerformers(currentPerformers);
        });
        return artist;

    }

}
