package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

//DAO
public interface BrandRepository extends JpaRepository<Brand,Integer>{
	//List<Brand> getAll();
	//Jpa bize temel methodları sağlıyor zaten
	boolean existsByName(String name);
}
