package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;

import java.util.*;

public class PackageRepositoryImpl implements PackageRepository{

   private final Map<Integer, Package > database = new HashMap<>();
    @Override
    public Package save(Package aPackage) {
        Integer id = null;
        if(aPackage.getId() == null) {
            id = database.size() + 1;
            aPackage.setId(id);
        }
        database.put(id, aPackage);
        return database.get(id);


    }

    @Override
    public List<Package> findAll() {
        List<Package> all = new ArrayList<>();
                Set<Integer> keys = database.keySet();
        for(Integer key : keys){
            all.add(database.get(key));
        }
        return all;
    }

    @Override
    public void delete(Package aPackage) {

        database.remove(aPackage.getId());

    }

    @Override
    public void delete(Integer id) {
        database.remove(id);
    }

    @Override
    public Package findPackageTrackingNumber(Integer id) {
        return database.get(id);
    }


//    @Override
//    public void deleteByTracking(Integer id) {
//        database.remove(id);
//
//    }
//
//    @Override
//    public Package findPackageById(Integer id) {
//        return database.get(id);
//    }
}
