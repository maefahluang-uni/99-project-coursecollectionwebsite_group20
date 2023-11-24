package th.mfu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.repository.FavRepository;

@Service
public class FavService {

    @Autowired

    private final FavRepository favRepository;

    public FavService(FavRepository favRepository) {
        this.favRepository = favRepository;
    }

    public void updateDish( // upที่ใช้
            Long dishId,
            String dishName,
            String dishType,
            String dishPicture) {
        favRepository.customUpdate(dishId, dishName, dishType, dishPicture);
    } // ใช้ใน repo
}