package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //Bu sınıf bir DataAccess nesnesi
public class InMemoryBrandRepository  { //implements BrandRepository
	/*
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Renault"));
		brands.add(new Brand(4,"Bugatti"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}*/

}
