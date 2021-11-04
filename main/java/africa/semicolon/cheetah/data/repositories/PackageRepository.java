package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;

import java.util.List;
import java.util.Optional;

public interface PackageRepository {

    Package save(Package aPackage);
    List<Package>findAll();


    void delete (Package aPackage);
    void delete (Integer id);

    Package findPackageTrackingNumber(Integer trackingNumber);

}
