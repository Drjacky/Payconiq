package ir.hosseinabbasi.payconiq.data.db;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;
import ir.hosseinabbasi.payconiq.data.db.model.Response;

/**
 * Created by Dr.jacky on 2018/04/26.
 */
public class DbService implements IDbService {
    private final RealmManager mRealmManager;

    @Inject
    public DbService(RealmManager realmManager){
        this.mRealmManager = realmManager;
    }

    @Override
    public List<Response> loadResponses() {
        Realm realm = mRealmManager.getLocalInstance();
        return realm.where(Response.class).findAll();
    }

    @Override
    public void saveResponses(List<Response> responseList) {
        Realm realm = mRealmManager.getLocalInstance();
        realm.executeTransaction(realm1 -> realm1.insertOrUpdate(responseList));
    }
}
