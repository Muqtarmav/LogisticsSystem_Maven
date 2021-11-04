package africa.semicolon.cheetah.data.repositories;

import africa.semicolon.cheetah.data.models.Package;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
    private PackageRepository packageRepository;

    @BeforeEach
    void setUp() {
        packageRepository = new PackageRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void savNewPackageTest(){
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, savedPackage.getId());

    }

    @Test
    void updatePackageTest() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        savedPackage.setName("sniper");
        Package updatedPackage = packageRepository.save(savedPackage);
        assertEquals(1, savedPackage.getId());
    }

    @Test
    void findAll() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, packageRepository.findAll().size());
    }

    @Test
    void delete() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, packageRepository.findAll().size());

        packageRepository.delete(savedPackage);
        assertEquals(0, packageRepository.findAll().size());

    }

    @Test
    void deleteById() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(1, packageRepository.findAll().size());

        packageRepository.delete(1);
        assertEquals(0, packageRepository.findAll().size());

    }

    @Test
    void findPackageTrackingNumber() {
        Package aPackage = new Package();
        aPackage.setName("Sleeping mat");
        aPackage.setSenderName("Toska");
        aPackage.setReceiverName("mav");
        aPackage.setReceiverPhone("08130249214");
        aPackage.setDeliveryAddress("312 herbart Macaulay way, Sabo Yabo, Lagos");
        aPackage.setNetWeight(23.5);
        aPackage.setSenderPhone(aPackage.getReceiverPhone());

        Package savedPackage = packageRepository.save(aPackage);
        assertEquals(savedPackage, packageRepository.findPackageTrackingNumber(1));

//        packageRepository.delete(savedPackage);
//        assertEquals(0, packageRepository.findAll().size());

    }
}