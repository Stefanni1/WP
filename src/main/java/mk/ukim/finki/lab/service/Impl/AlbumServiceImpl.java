package mk.ukim.finki.lab.service.Impl;

import mk.ukim.finki.lab.model.Album;
import mk.ukim.finki.lab.repository.AlbumRepository;
import mk.ukim.finki.lab.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {
    AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Album findOne(Long id) {
        return albumRepository.findOne(id).orElse(null);
    }
}
