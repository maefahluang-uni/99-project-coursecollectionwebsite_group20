package th.mfu.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import th.mfu.model.Fav;

public interface FavRepository extends CrudRepository<Fav, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Dishes d SET d.dish_name = :dishName, d.dishtype = :dishType, d.dish_picture = :dishPicture, d.dish_stock = :dishStock, d.dish_price = :dishPrice, d.dishStatus = :dishStatus WHERE d.id = :dishId")
    void customUpdate( // เรียกจาก service
            @Param("dishId") Long dishId,
            @Param("dishName") String dishName,
            @Param("dishDis") String dishdis,
            @Param("dishPicture") String dishPicture);
}