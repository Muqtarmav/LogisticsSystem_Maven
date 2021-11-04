package africa.semicolon.cheetah.controllers;

import africa.semicolon.cheetah.dtos.requests.AddPackageRequest;
import africa.semicolon.cheetah.dtos.responses.AddPackageResponse;
import africa.semicolon.cheetah.services.PackageService;
import africa.semicolon.cheetah.services.PackageServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {

    private final PackageService packageService = new PackageServiceImpl();

    @PostMapping("/api/addpackage")
        public AddPackageResponse addPackage(AddPackageRequest addPackageRequest) {
            return packageService.addPackage(addPackageRequest);
        }



        @GetMapping("/api/package/{id}")
         public Package findPackageById(Integer id){
            return packageService.findMyPackageWithMy(id);
         }


}


