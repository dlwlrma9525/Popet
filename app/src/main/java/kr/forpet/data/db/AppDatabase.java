package kr.forpet.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import kr.forpet.data.dao.CommonDiseaseDAO;
import kr.forpet.data.dao.EmergencyDAO;
import kr.forpet.data.dao.FoodDAO;
import kr.forpet.data.dao.ShopDAO;
import kr.forpet.data.dao.ShopOpenTimeDAO;
import kr.forpet.data.dao.ShopPharmacyDAO;
import kr.forpet.data.dao.VaccinationDAO;
import kr.forpet.data.entity.CommonDisease;
import kr.forpet.data.entity.Emergency;
import kr.forpet.data.entity.Food;
import kr.forpet.data.entity.Shop;
import kr.forpet.data.entity.ShopOpenTime;
import kr.forpet.data.entity.ShopPharmacy;
import kr.forpet.data.entity.Vaccination;

// https://developer.android.com/training/data-storage/room/index.html
// https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds
// https://tourspace.tistory.com/28
@Database(
        entities = {
                Shop.class,
                ShopOpenTime.class,
                ShopPharmacy.class,
                Vaccination.class,
                Emergency.class,
                CommonDisease.class,
                Food.class
        },
        version = 1,
        exportSchema = true
)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ShopDAO shopDAO();
    public abstract ShopOpenTimeDAO shopOpenTimeDAO();
    public abstract ShopPharmacyDAO shopPharmacyDAO();
    public abstract VaccinationDAO vaccinationDAO();
    public abstract EmergencyDAO emergencyDAO();
    public abstract CommonDiseaseDAO commonDiseaseDAO();
    public abstract FoodDAO foodDAO();
}