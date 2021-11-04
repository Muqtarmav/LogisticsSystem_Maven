package africa.semicolon.cheetah.services;

import africa.semicolon.cheetah.data.repositories.PackageRepository;
import africa.semicolon.cheetah.data.repositories.PackageRepositoryImpl;
import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;

import africa.semicolon.cheetah.data.models.Package;
import africa.semicolon.cheetah.utils.ModelMapper;

public class PackageServiceImpl implements PackageService {

    private final PackageRepository packageRepository = new PackageRepositoryImpl();


    @Override
    public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {

        Package aPackage = ModelMapper.map(addPackageRequest);

        Package savedPackage = packageRepository.save(aPackage);


        //convert add [package request tp a package


        //  Package savedPackage = packageRepository.save(aPackage);

        // save package


        // convert saved package to AddPackage RESPONSE

        AddPackageResponse response = new AddPackageResponse();
        response.setPackageName(savedPackage.getName());
        response.setPackageWeight(savedPackage.getNetWeight());
        response.setReceiverName(savedPackage.getReceiverName());
        response.setTrackingNumber(savedPackage.getId());
        response.setReceiverPhone(savedPackage.getReceiverPhone());

        // return converted response
        return response;

    }



    @Override
    public java.lang.Package findMyPackageWithMy(Integer id) {
        return null;
    }
}

