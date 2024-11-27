//package mk.ukim.finki.lab.service.Impl;
//
//import mk.ukim.finki.lab.model.Album;
//import mk.ukim.finki.lab.repository.AlbumRepository;
//
//import java.util.List;
//
//public class AlbumServiceImpl {
//    AlbumRepository albumRepository;
//
//    public AlbumServiceImpl(AlbumRepository albumRepository) {
//        this.albumRepository = albumRepository;
//    }
//
//    @Override
//    public List<Album> findAll() {
//        return albumRepository.findAll();
//    }
//
//    @Override
//    public Album findOne(Long id) {
//        return albumRepository.findOne(id).orElse(null);
//    }
//}
