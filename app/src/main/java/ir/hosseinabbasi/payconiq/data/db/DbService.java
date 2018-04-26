package ir.hosseinabbasi.payconiq.data.db;

import javax.inject.Inject;

import ir.hosseinabbasi.payconiq.data.db.IDbService;
import ir.hosseinabbasi.payconiq.data.RealmManager;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
public class DbService implements IDbService {
    private final RealmManager mRealmManager;

    @Inject
    public DbService(RealmManager realmManager){
        this.mRealmManager = realmManager;
    }
}
